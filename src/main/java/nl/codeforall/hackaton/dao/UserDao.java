package nl.codeforall.hackaton.dao;

import nl.codeforall.hackaton.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends GenericDao<User>{

    public UserDao(){
        super(User.class);
    }


}
