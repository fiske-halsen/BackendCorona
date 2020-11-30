package facades;

import entities.Address;
import entities.CityInfo;
import entities.Country;
import entities.OrderTest;
import entities.Role;
import entities.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import security.errorhandling.AuthenticationException;
import utils.EMF_Creator;

/**
 * @author lam@cphbusiness.dk
 */
public class UserFacade {

    private static EntityManagerFactory emf;
    private static UserFacade instance;
    EntityManager em = emf.createEntityManager();

    private UserFacade() {
    }

    /**
     *
     * @param _emf
     * @return the instance of this facade.
     */
    public static UserFacade getUserFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new UserFacade();
        }
        return instance;
    }

    public User getVeryfiedUser(String username, String password) throws AuthenticationException {
        EntityManager em = emf.createEntityManager();
        User user;
        try {
            user = em.find(User.class, username);
            if (user == null || !user.verifyPassword(password)) {
                throw new AuthenticationException("Invalid user name or password");
            }
        } finally {
            em.close();
        }
        return user;
    }

    public User createUser(String username, String password1, String password2) throws AuthenticationException {
        if (password1.equals(password2)) {
            EntityManager em = emf.createEntityManager();
            User user = new User(username, password1);
            Role userRole = new Role("user");
            user.addRole(userRole);
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();

            try {
                user = em.find(User.class, username);
                if (user == null || !user.verifyPassword(password1)) {
                    throw new AuthenticationException("Invalid user name or password");
                }
            } finally {
                em.close();
            }
            return user;

        } else {
            throw new AuthenticationException("Your password didn't match");
        }

    }
    
    
    public OrderTest orderTest(User user, String country, String zip, String street, String city){
        
        Country c = new Country(country);
        CityInfo ci = new CityInfo(zip, city);
        Address a = new Address(street);
        
        a.setCityInfo(ci);
        a.setCountry(c);
        OrderTest ot = new OrderTest(user.getUserName());
        ot.setAddress(a);
        user.addOrderTest(ot);
        
         em.getTransaction().begin();
         
         em.persist(c);
         em.persist(ci);
         em.persist(a);
         em.persist(ot);
  
         em.getTransaction().commit();
         return ot;
    }
    

}
