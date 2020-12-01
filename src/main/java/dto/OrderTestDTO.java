
package dto;

import entities.Address;
import entities.OrderTest;
import entities.User;


public class OrderTestDTO {
    
    
    public String country;
    public String city;
    public String zip;
    public String street;
    public String email;

    public OrderTestDTO(OrderTest orderTest, User user) {
        this.country = orderTest.getAddress().getCountry().getCountry();
        this.city = orderTest.getAddress().getCityInfo().getCity();
        this.zip = orderTest.getAddress().getCityInfo().getZip();
        this.street = orderTest.getAddress().getStreet();
        this.email = user.getUserName();
    }
    
    
    

   

    
   
   
    
    
    
    
}
