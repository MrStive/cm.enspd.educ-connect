package cm.enspd.educ_connect.domaine.department;

import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DepartmentFetcherImpl implements DepartmentFetcher {

  private final DepartmentRepository departmentRepository;

  @Override
  public List<Department> loadAllDepartments() {
    return departmentRepository.findAll();
  }

  @Override
  public Optional<Department> findById(DepartmentId id) {
    return departmentRepository.findById(id);
  }
}
