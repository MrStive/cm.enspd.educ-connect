package cm.enspd.educ_connect.domaine.department;

import java.util.List;
import java.util.Optional;

public interface DepartmentFetcher {
  List<Department> loadAllDepartments();

  Optional<Department> findById(DepartmentId id);
}
