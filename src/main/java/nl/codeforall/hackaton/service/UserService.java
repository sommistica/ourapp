package nl.codeforall.hackaton.service;

import nl.codeforall.hackaton.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService extends GenericService<User>{

    public boolean authenticate(String email, String password){
        User user = dao.findByEmail(email);
        return user != null && user.getPassword().equals(password);
    }

    @Transactional
    public User get(String email){

        return dao.findByEmail(email);
    }

    @Transactional
    public User getbyEmail(String email){

        return dao.findByEmail(email);
    }
}
