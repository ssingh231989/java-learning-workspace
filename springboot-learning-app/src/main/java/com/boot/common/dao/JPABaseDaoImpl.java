package com.boot.common.dao;

import javax.annotation.PostConstruct;
import javax.swing.text.html.parser.Entity;
import java.lang.reflect.ParameterizedType;

public abstract class JPABaseDaoImpl implements JPABaseDao {

   /* protected Class<E> clazz;

    protected EntityManager entityManager;

    public abstract void init();

    @PostConstruct
    public void initialize(){
        init();
    }
    public JPABaseDaoImpl(){
        clazz=(Class<E>) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Override

    public E getById(long id) {
        return null;
    }*/
}
