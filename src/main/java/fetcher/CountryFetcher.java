/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fetcher;

import com.google.gson.Gson;
import dto.CountryDTO;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;
import utils.HttpUtils;
import java.util.Collection;
import java.util.Collections;
import utils.SortCountryNames;



public class CountryFetcher {
    
      private static String COUNTRIES_URL = "https://api.covid19api.com/countries";

    public static String responseFromExternalServersSequential(ExecutorService threadPool, Gson gson) throws InterruptedException, ExecutionException, TimeoutException, IOException {

        String countries = HttpUtils.fetchData(COUNTRIES_URL);
        
        CountryDTO[] countryDTO = gson.fromJson(countries, CountryDTO[].class);
        
        List<CountryDTO> list = Arrays.asList(countryDTO);          
        Collections.sort(list, new SortCountryNames());
        
        return gson.toJson(list);
    }
}
