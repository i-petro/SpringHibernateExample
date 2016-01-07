package peter.example.dao.impl;

import org.hibernate.Criteria;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;
import peter.example.dao.ExampleDao;
import peter.example.model.MyObject;

import java.io.Serializable;

/**
 * Created by Peter on 05.01.2016.
 */
public class ExampleDaoImpl extends HibernateDaoSupport implements ExampleDao {

    public Serializable save(MyObject object) {
        return getHibernateTemplate().save(object);
    }

    public void update(MyObject object) {
        getHibernateTemplate().update(object);
    }

    public void delete(MyObject object) {
        getHibernateTemplate().delete(object);
    }

    public MyObject getObjectById(int id) {
        return getHibernateTemplate().get(MyObject.class, id);
    }
}
