/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entities.Address;

/**
 *
 * @author chris
 */
public class AddressDTO {
    
    public String street;

    public AddressDTO(Address address) {
        this.street = address.getStreet();
    }
    
    
    
    
    
}
