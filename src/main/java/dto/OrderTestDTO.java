
package dto;

import entities.OrderTest;
import entities.User;

public class OrderTestDTO {
    
    
    public String userName;
    public String street;
    public String country;
    public String zip;
    public String city;

    public OrderTestDTO(OrderTest ot) {
        this.userName = ot.getEmail();
        this.street = ot.getAddress().getStreet();
        this.country = ot.getAddress().getCountry().getCountry();
        this.zip = ot.getAddress().getCityInfo().getZip();
        this.city = ot.getAddress().getCityInfo().getCity();
    }
    
    
    
    
}
