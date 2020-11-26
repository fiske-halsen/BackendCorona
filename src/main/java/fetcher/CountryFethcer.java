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

public class CountryFethcer {

    private static String COUNTRY_CORONA_URL = "https://api.covid19api.com/premium/country/denmark";
    private static String COUNTRY_TEST_URL = "https://api.covid19api.com/premium/country/testing/denmark";

    public static String responseFromExternalServersParrallel(ExecutorService threadPool, Gson gson) throws InterruptedException, ExecutionException, TimeoutException {

        Callable<CountryCoronaDTO> countryCoronaTask = new Callable<CountryCoronaDTO>() {
            @Override
            public CountryCoronaDTO call() throws Exception {
                String countryCorona = HttpUtils.fetchData(COUNTRY_CORONA_URL);
                CountryCoronaDTO[] countryList = gson.fromJson(countryCorona, CountryCoronaDTO[].class);
                CountryCoronaDTO countryCoronaDTO = countryList[countryList.length-1];
                return countryCoronaDTO;
            }
        };

        Callable<CountryTestDTO> countryTestTask = new Callable<CountryTestDTO>() {
            @Override
            public CountryTestDTO call() throws Exception {
                String countryTest = HttpUtils.fetchData(COUNTRY_TEST_URL);
                CountryTestDTO countryTestDTO = gson.fromJson(countryTest, CountryTestDTO.class);

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
