package peter.example.bo.impl;

import peter.example.bo.ExampleBo;
import peter.example.dao.ExampleDao;
import peter.example.model.MyObject;

import java.io.Serializable;

/**
 * Created by Peter on 05.01.2016.
 */
public class ExampleBoImpl implements ExampleBo {
    private ExampleDao exampleDao;

    public void setExampleDao(ExampleDao exampleDao) {
        this.exampleDao = exampleDao;
    }

    public Integer save(MyObject object) {
        return (Integer) exampleDao.save(object);
    }

    public void update(MyObject object) {
        exampleDao.update(object);
    }

    public void delete(MyObject object) {
        exampleDao.delete(object);
    }

    public MyObject getObjectById(int id) {
        return exampleDao.getObjectById(id);
    }
}
