/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entities.Address;
import entities.CityInfo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chris
 */
public class CityInfoDTO {
    
    public String zip;
    public String city;
    public List<AddressDTO> addresses;

    public CityInfoDTO(CityInfo cityInfo) {
        this.zip = cityInfo.getZip();
        this.city = cityInfo.getCity();
        this.addresses = new ArrayList();
        for (Address address : cityInfo.getAddresses()) {
            this.addresses.add(new AddressDTO(address));
        }
    }
    
    
}
