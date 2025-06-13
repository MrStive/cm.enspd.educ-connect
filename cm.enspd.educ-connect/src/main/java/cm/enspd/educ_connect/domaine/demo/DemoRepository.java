package cm.enspd.educ_connect.domaine.demo;

import java.util.List;

public interface DemoRepository {

  Demo save(Demo value);

  List<Demo> findAll();
}
