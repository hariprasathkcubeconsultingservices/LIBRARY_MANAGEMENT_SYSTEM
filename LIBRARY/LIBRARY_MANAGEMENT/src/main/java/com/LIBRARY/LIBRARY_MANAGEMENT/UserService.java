package com.LIBRARY.LIBRARY_MANAGEMENT;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private userrepo userrepo;

    public List<User> findAll() {
        return userrepo.findAll();
    }
    
    public User save(User user) {
        return userrepo.save(user);

    }

   
    public void deleteById(long id){
        userrepo.deleteById(id);
    }
}
