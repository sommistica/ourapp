package nl.codeforall.hackaton.service;

import nl.codeforall.hackaton.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService extends GenericService<User>{

    public boolean authenticata(String email, String password){
        User user = dao.findByEmail(email);
        return user != null && user.getPassword().equals(password);
    }
}
