package cm.enspd.educ_connect.repository.impl;

import cm.enspd.educ_connect.domaine.department.Department;
import cm.enspd.educ_connect.domaine.department.DepartmentId;
import cm.enspd.educ_connect.domaine.department.DepartmentRepository;
import cm.enspd.educ_connect.repository.DepartmentSpringRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DepartmentRepositoryImpl implements DepartmentRepository {
  private final DepartmentSpringRepository departmentSpringRepository;

  @Override
  public Department save(Department department) {
    return departmentSpringRepository.save(department);
  }

  @Override
  public List<Department> findAll() {
    return departmentSpringRepository.findAll();
  }

  @Override
  public Optional<Department> findById(DepartmentId id) {
    return departmentSpringRepository.findById(id);
  }
}
