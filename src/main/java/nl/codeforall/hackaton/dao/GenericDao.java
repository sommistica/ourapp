package nl.codeforall.hackaton.dao;

import nl.codeforall.hackaton.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class GenericDao<T> {

    private Class<T> modelType;

    @PersistenceContext
    protected EntityManager em;

    public GenericDao(Class<T> modelType){
        this.modelType = modelType;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public T findById(Integer id){
        return em.find(modelType, id);
    }

    public T findByEmail(String email){
        return em.find(modelType, email);
    }

    public T saveOrUpdate(T model){
        return em.merge(model);
    }
}
