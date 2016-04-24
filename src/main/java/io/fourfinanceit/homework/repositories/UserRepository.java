package io.fourfinanceit.homework.repositories;


import io.fourfinanceit.homework.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{
}
