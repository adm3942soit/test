package io.fourfinanceit.homework.services;

import com.utils.date.Dater;
import io.fourfinanceit.homework.domain.User;
import io.fourfinanceit.homework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Iterable<User> listAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Integer id) {
        if(id==null)return null;
        return userRepository.findOne(id);
    }

    @Override
    public User saveUser(User user) {

        if(user.getAmount()!=null && !user.getAmount().equals(new BigDecimal(0.0))){
        user.setDateEnter(new Date());
        user.setTimeEnter(Dater.getTime());
        }
        User currentUser=getUserById(user.getId());
        Integer count=currentUser!=null?currentUser.getCountEnter():0;
        user.setCountEnter(((count!=null)?(++count):1));
        if(user.getAmount().compareTo(new BigDecimal(1000))>=1)
            user.setAmount(new BigDecimal(1000));

        if(Dater.timeBetween("00:00","06:00")){

            if(user.getAmount().compareTo(new BigDecimal(1000))>=1)
                        return null;
        }
        if(user.getCountEnter()>3){return null;}
        return userRepository.save(user);
    }
}
