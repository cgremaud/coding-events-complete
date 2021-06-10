package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.User;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface UserRepository extends CrudRepository<User, Integer> {

    //this is called a query method
    User findByUsername(String username); //returns a User object and takes a username as an arg

}
