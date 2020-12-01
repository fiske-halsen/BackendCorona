package utils;


import entities.Address;
import entities.CityInfo;
import entities.Country;
import entities.OrderTest;
import entities.Role;
import entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class SetupTestUsers {

  public static void setUpUsers() {

    EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();
    EntityManager em = emf.createEntityManager();
    
    // IMPORTAAAAAAAAAANT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // This breaks one of the MOST fundamental security rules in that it ships with default users and passwords
    // CHANGE the three passwords below, before you uncomment and execute the code below
    // Also, either delete this file, when users are created or rename and add to .gitignore
    // Whatever you do DO NOT COMMIT and PUSH with the real passwords

    User user = new User("user", "testuser");
    User admin = new User("admin", "testadmin");
    User both = new User("user_admin", "testuseradmin");
    Role userRole = new Role("user");
    Role adminRole = new Role("admin");
    //Country country = new Country("Denmark");
    //CityInfo cityInfo = new CityInfo("3000", "Helsingør");
    Address address = new Address("Skansedalen 12");
    OrderTest orderTest = new OrderTest("sebastian@godskhansen.dk");

    if(admin.getUserPass().equals("test")||user.getUserPass().equals("test")||both.getUserPass().equals("test"))
      throw new UnsupportedOperationException("You have not changed the passwords");

    em.getTransaction().begin();
    
    address.setCountry(em.find(Country.class, 1));
    address.setCityInfo(em.find(CityInfo.class, "3000"));
    
    orderTest.setAddress(address);
    
    user.addOrderTest(orderTest);
    
    user.addRole(userRole);
    admin.addRole(adminRole);
    both.addRole(userRole);
    both.addRole(adminRole);
    
    em.persist(orderTest);
    em.persist(userRole);
    em.persist(adminRole);
    em.persist(user);
    em.persist(admin);
    em.persist(both);
    
    em.getTransaction().commit();
    System.out.println("PW: " + user.getUserPass());
    System.out.println("Testing user with OK password: " + user.verifyPassword("test"));
    System.out.println("Testing user with wrong password: " + user.verifyPassword("test1"));
    System.out.println("Created TEST Users");
   
  }
  
}
