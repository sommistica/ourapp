package nl.codeforall.hackaton.service;

import nl.codeforall.hackaton.dao.GenericDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class GenericService<T> {

    protected GenericDao<T> dao;

    @Autowired
    public void setDao(GenericDao<T> dao) {
        this.dao = dao;
    }

    public List<T> getList(){

        return dao.findAll();
    }

    public T get(Integer id){

        return dao.findById(id);
    }

    @Transactional
    public T save(T object){

        return dao.saveOrUpdate(object);
    }
}
