
package cm.enspd.educ_connect.repository.impl;

import cm.enspd.educ_connect.domaine.department.Department;
import cm.enspd.educ_connect.domaine.department.DepartmentRepository;
import cm.enspd.educ_connect.repository.DepartmentSpringRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DepartmentRepositoryImpl implements DepartmentRepository {
  private final DepartmentSpringRepository departmentSpringRepository;

  @Override
  public Department saveDepartment(Department department) {
    return departmentSpringRepository.save(department);
  }
}
