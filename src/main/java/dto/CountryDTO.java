package dto;

import entities.Address;
import entities.Country;
import java.util.ArrayList;
import java.util.List;

public class CountryDTO {

    public String Country;
    public List<AddressDTO> listOfAdresses;

    public CountryDTO(Country country) {
        this.Country = country.getCountry();
        this.listOfAdresses = new ArrayList();
        for (Address address : country.getAddresses()) {
            listOfAdresses.add(new AddressDTO(address));
        }
    }

}
