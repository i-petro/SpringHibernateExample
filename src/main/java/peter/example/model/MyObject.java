package peter.example.model;

import java.io.Serializable;

/**
 * Created by Peter on 05.01.2016.
 */
public class MyObject implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;

    public MyObject(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public MyObject() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
