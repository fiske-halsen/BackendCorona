/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.ArrayList;
import java.util.List;


public class CountriesDTO {
    
    private List<CountryDTO> countries = new ArrayList();

    public CountriesDTO(List<CountryDTO> countries) {
        this.countries = countries;
    }

    public List<CountryDTO> getCountries() {
        return countries;
    }

    public void setCountries(List<CountryDTO> countries) {
        this.countries = countries;
    }
}
