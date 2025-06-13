package cm.enspd.educ_connect.repository;

import cm.enspd.educ_connect.domaine.demo.Demo;
import cm.enspd.educ_connect.domaine.demo.DemoId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoSpringRepository extends JpaRepository<Demo, DemoId> {}
