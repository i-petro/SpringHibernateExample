package peter.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import peter.example.bo.ExampleBo;
import peter.example.bo.impl.ExampleBoImpl;
import peter.example.dao.impl.ExampleDaoImpl;
import peter.example.model.MyObject;

/**
 * Created by Peter on 05.01.2016.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/bean_locations.xml");
        ExampleBo bo = appContext.getBean("exampleBo", ExampleBo.class);

        //CRUD
        MyObject obj = new MyObject(1,"hibernate"+System.currentTimeMillis()%100);
        obj.setId(bo.save(obj));
        System.out.println(bo.getObjectById(obj.getId()));
        bo.update(obj = new MyObject(obj.getId(),"new name"));
        bo.delete(obj);
        System.out.println("\n\n\n\n--------------DONE---------------------");


    }
}
