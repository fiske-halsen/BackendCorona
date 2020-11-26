/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fetcher;

import com.google.gson.Gson;
import dto.CoronaInfoDTO;
import dto.CountriesDTO;
import dto.CountryCoronaDTO;
import dto.CountryDTO;
import dto.CountryTestDTO;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import utils.HttpUtils;


public class CountryFetcher {
    
      private static String COUNTRY_TEST_URL = "https://api.covid19api.com/countries";

    public static String responseFromExternalServersSequential(ExecutorService threadPool, Gson gson) throws InterruptedException, ExecutionException, TimeoutException, IOException {

        String countries = HttpUtils.fetchData(COUNTRY_TEST_URL);
        
        List<CountryDTO> countryDTOList = gson.fromJson(countries, List.class);
        
        CountriesDTO countriesDTO = new CountriesDTO(countryDTOList);
        
        String result = gson.toJson(countriesDTO, CountriesDTO.class);

        return result;
    }
    
}
