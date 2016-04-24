package io.fourfinanceit.homework.bootstrap;


import io.fourfinanceit.homework.domain.User;
import io.fourfinanceit.homework.repositories.UserRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class UserLoader implements ApplicationListener<ContextRefreshedEvent> {

    private UserRepository userRepository;

    private Logger log = Logger.getLogger(UserLoader.class);

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        User user= new User();
        user.setFirstName("Oxana");
        user.setLastName("Dudnik");
        user.setAmount(new BigDecimal(0.0));
        user.setTerm(1);
        user.setCountEnter(1);
        userRepository.save(user);
        log.info("Saved user - id: " + user.getId());


    }
}
