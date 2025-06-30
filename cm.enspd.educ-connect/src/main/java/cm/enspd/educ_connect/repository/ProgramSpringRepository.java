package cm.enspd.educ_connect.repository;

import cm.enspd.educ_connect.domaine.department.DepartmentId;
import cm.enspd.educ_connect.domaine.department.program.Program;
import cm.enspd.educ_connect.domaine.department.program.ProgramId;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramSpringRepository extends JpaRepository<Program, ProgramId> {
  List<Program> findByDepartmentId(DepartmentId departmentId);
}
