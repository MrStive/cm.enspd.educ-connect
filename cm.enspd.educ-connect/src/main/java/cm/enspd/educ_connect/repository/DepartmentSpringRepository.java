package cm.enspd.educ_connect.repository;

import cm.enspd.educ_connect.domaine.Department;
import cm.enspd.educ_connect.domaine.DepartmentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentSpringRepository extends JpaRepository<Department, DepartmentId> {
}
