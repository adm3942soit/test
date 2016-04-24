package io.fourfinanceit.homework.repositories;


import io.fourfinanceit.homework.config.RepositoryConfiguration;
import io.fourfinanceit.homework.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {RepositoryConfiguration.class})
public class UserRepositoryTest {

    private UserRepository userRepository;

    @Autowired
    public void setProductRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Test
    public void testSaveUser()


    {
        //setup product
        User user = new User();
        user.setFirstName("Oxana");
        user.setLastName("Dudnik");

        user.setAmount(new BigDecimal(0.0));
        user.setTerm(1);
        user.setCountEnter(1);

        //save product, verify has ID value after save
        assertNull(user.getId()); //null before save
        userRepository.save(user);
        assertNotNull(user.getId()); //not null after save
        //fetch from DB
        User fetchedUser = userRepository.findOne(user.getId());

        //should not be null
        assertNotNull(fetchedUser);

        //should equal
        assertEquals(user.getId(), fetchedUser.getId());
       // assertEquals(product.getDescription(), fetchedProduct.getDescription());

        //update description and save
      //  fetchedProduct.setDescription("New Description");
      //  productRepository.save(fetchedProduct);

        //get from DB, should be updated
      //  Product fetchedUpdatedProduct = productRepository.findOne(fetchedProduct.getId());
        //assertEquals(fetchedProduct.getDescription(), fetchedUpdatedProduct.getDescription());

        //verify count of products in DB
//        long productCount = productRepository.count();
  //      assertEquals(productCount, 1);

        //get all products, list should only have one
    //    Iterable<Product> products = productRepository.findAll();

        int count = 0;

 //       for (Product p : products) {
     //       count++;
    //    }

      /*  assertEquals(count, 1);*/
    }
}
