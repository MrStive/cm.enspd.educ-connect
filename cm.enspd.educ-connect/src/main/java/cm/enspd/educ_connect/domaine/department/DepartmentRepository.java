package cm.enspd.educ_connect.domaine.department;

import java.util.List;
import java.util.Optional;

public interface DepartmentRepository {
  Department save(Department department);

  List<Department> findAll();

  Optional<Department> findById(DepartmentId id);
}
