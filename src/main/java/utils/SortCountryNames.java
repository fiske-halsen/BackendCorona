/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import dto.CountryDTO;
import java.util.Comparator;

/**
 *
 * @author lukas
 */
public class SortCountryNames implements Comparator<CountryDTO>{

    @Override
    public int compare(CountryDTO o1, CountryDTO o2) {
        return (o1.Country.compareTo(o2.Country));
    }
    
}
