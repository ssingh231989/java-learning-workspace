package com.boot.common.dao;

import java.util.List;

public interface JPABaseDao<E> {

    E getById(long id);

    void refresh(E entity);

    void update(E entity);

    void updateBatch(List<E> entityList);

    void delete(E entity);

    void deleteBatch(List<E> entityList);

    void insertBatch(List<E> entityList);

    void insertInNewTransaction(E entity);

    void updateInNewTransaction(E entity);

    void insertBatchInNewTransaction(List<E> entityList);

    void updateBatchInNewTransaction(List<E> entityList);
}
