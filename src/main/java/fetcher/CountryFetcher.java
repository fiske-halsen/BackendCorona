/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fetcher;

import com.google.gson.Gson;
import dto.CountryDTO;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;
import utils.HttpUtils;


public class CountryFetcher {
    
      private static String COUNTRY_TEST_URL = "https://api.covid19api.com/countries";

    public static String responseFromExternalServersSequential(ExecutorService threadPool, Gson gson) throws InterruptedException, ExecutionException, TimeoutException, IOException {

        String countries = HttpUtils.fetchData(COUNTRY_TEST_URL);
        
        CountryDTO[] countryDTO = gson.fromJson(countries, CountryDTO[].class);
        
        return gson.toJson(countryDTO);
    }
}
