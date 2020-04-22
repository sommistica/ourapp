package nl.codeforall.hackaton.service;

import nl.codeforall.hackaton.dao.UserDao;
import nl.codeforall.hackaton.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {


    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public User get(Integer id){

        return userDao.findById(id);
    }

    @Transactional
    public User save(User user){

        return userDao.saveOrUpdate(user);
    }
}
