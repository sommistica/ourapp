package nl.codeforall.hackaton.dao;

import nl.codeforall.hackaton.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserDao {

    @PersistenceContext
    private EntityManager em;

    @Autowired
    public void setEm(EntityManager em) {
        this.em = em;
    }

    public User findById(Integer id){
        return em.find(User.class, id);
    }

    public User saveOrUpdate(User user){
        return em.merge(user);
    }
}
