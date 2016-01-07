package peter.example.dao;

import peter.example.model.MyObject;

import java.io.Serializable;

/**
 * Created by Peter on 05.01.2016.
 */
public interface ExampleDao {
    Serializable save(MyObject object);
    void update(MyObject object);
    void delete(MyObject object);
    MyObject getObjectById(int id);
}
