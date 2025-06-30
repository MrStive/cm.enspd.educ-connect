package cm.enspd.educ_connect.domaine.department;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DepartmentFactoryImpl implements DepartmentFactory {

  private final DepartmentRepository departmentRepository;

  @Override
  public DepartmentId createDepartment(DepartmentData departmentData) {
    Department department =
        Department.builder()
            .name(new DepartmentName(departmentData.name()))
            .description(departmentData.description())
            .build();
    return departmentRepository.save(department).getId();
  }
}
