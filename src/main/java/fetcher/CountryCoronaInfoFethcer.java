package fetcher;

import com.google.gson.Gson;
import dto.CoronaInfoDTO;
import dto.CountryCoronaDTO;
import dto.CountryTestDTO;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import utils.HttpUtils;

public class CountryCoronaInfoFethcer {

    private static String COUNTRY_CORONA_URL = "https://api.covid19api.com/premium/country/";
    private static String COUNTRY_TEST_URL = "https://api.covid19api.com/premium/country/testing/";

    public static String responseFromExternalServersParrallel(ExecutorService threadPool, Gson gson, String country) throws InterruptedException, ExecutionException, TimeoutException {

        Callable<CountryCoronaDTO> countryCoronaTask = new Callable<CountryCoronaDTO>() {
            @Override
            public CountryCoronaDTO call() throws Exception {
                String countryCorona = HttpUtils.fetchData(COUNTRY_CORONA_URL + country);
                CountryCoronaDTO[] countryList = gson.fromJson(countryCorona, CountryCoronaDTO[].class);
                CountryCoronaDTO countryCoronaDTO = countryList[countryList.length - 1];
                return countryCoronaDTO;
            }
        };

        Callable<CountryTestDTO> countryTestTask = new Callable<CountryTestDTO>() {
            @Override
            public CountryTestDTO call() throws Exception {
                String countryTest = HttpUtils.fetchData(COUNTRY_TEST_URL + country);
                CountryTestDTO[] countryTestList = gson.fromJson(countryTest, CountryTestDTO[].class);
                if (countryTestList.length==0){
                return new CountryTestDTO(0, 0);
                }
                CountryTestDTO countryTestDTO = countryTestList[countryTestList.length - 1];
                return countryTestDTO;
            }
        };

        Future<CountryCoronaDTO> futureCountryCorona = threadPool.submit(countryCoronaTask);
        Future<CountryTestDTO> futureCountryTest = threadPool.submit(countryTestTask);

        CountryCoronaDTO countryCorona = futureCountryCorona.get(2, TimeUnit.SECONDS);
        CountryTestDTO countryTest = futureCountryTest.get(2, TimeUnit.SECONDS);

        CoronaInfoDTO coronaInfoDTO = new CoronaInfoDTO(countryCorona, countryTest);
        String coronaInfoJSON = gson.toJson(coronaInfoDTO);

        return coronaInfoJSON;
    }

}
