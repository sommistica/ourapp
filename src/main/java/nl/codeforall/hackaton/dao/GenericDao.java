package nl.codeforall.hackaton.dao;

import nl.codeforall.hackaton.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class GenericDao<T> {

    protected Class<T> modelType;

    @PersistenceContext
    protected EntityManager em;

    public GenericDao(Class<T> modelType){
        this.modelType = modelType;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }


    public List<T> findAll() {

        CriteriaQuery<T> criteriaQuery = em.getCriteriaBuilder().createQuery(modelType);
        Root<T> root = criteriaQuery.from(modelType);
        return em.createQuery(criteriaQuery).getResultList();
    }

    public T findById(Integer id){
        return em.find(modelType, id);
    }

    public T findByEmail(String email){

            // 1 - get a CriteriaBuilder object from the EntityManager
            CriteriaBuilder builder = em.getCriteriaBuilder();

            // 2 - create a new CriteriaQuery instance for the Customer entity
            CriteriaQuery<T> criteriaQuery = builder.createQuery(modelType);

            // 3 - get the root of the query, from where all navigation starts
            Root<T> root = criteriaQuery.from(modelType);

            // 4 - specify the item that is to be returned in the query result
            criteriaQuery.select(root);

            // 5 - add query restrictions
            criteriaQuery.where(builder.equal(root.get("email"), email));

            // 6 - create and execute a query using the criteria
            return em.createQuery(criteriaQuery).getSingleResult();
    }

    public T saveOrUpdate(T model){
        return em.merge(model);
    }
}
