package ir.mctab.java32.hibernate.projects.webandhibernate.config.hibernate.repositories;

import ir.mctab.java32.hibernate.projects.webandhibernate.config.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.io.Serializable;
import java.util.List;

public abstract class CrudRepository<T, S extends Serializable> {

    private Session session = HibernateUtil.getSession();

    protected abstract Class<T> getEntityClass();

    public T save(T entity) {
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        return entity;
    }

    public T update(T entity) {
        session.beginTransaction();
        session.update(entity);
        session.getTransaction().commit();
        return entity;
    }

    public void delete(T entity) {
        session.beginTransaction();
        session.remove(entity);
        session.getTransaction().commit();
    }

    public void deleteById(S id) {
        T entity = findById(id);
        if (entity != null) {
            session.beginTransaction();
            session.remove(entity);
            session.getTransaction().commit();
        }
    }

    public T findById(S id) {
        session.beginTransaction();
        T entity = session.get(getEntityClass(), id);
        session.getTransaction().commit();
        return entity;
    }

    public List<T> findAll() {
        session.beginTransaction();
        List<T> tList = session.createQuery("from " + getEntityClass().getName()).list();
        session.getTransaction().commit();
        return tList;
    }

    public List<T> findAll(int firstResult, int maxResults) {
        session.beginTransaction();
        Query query = session.createQuery("from " + getEntityClass().getName());
        query.setFirstResult(firstResult);
        query.setMaxResults(maxResults);
        List<T> tList = query.list();
        session.getTransaction().commit();
        return tList;
    }

    public Session getSession() {
        return session;
    }

}
