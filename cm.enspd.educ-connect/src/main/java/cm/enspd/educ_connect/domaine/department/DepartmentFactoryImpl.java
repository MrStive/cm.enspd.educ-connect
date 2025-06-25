package cm.enspd.educ_connect.domaine.department;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@RequiredArgsConstructor
public class DepartmentFactoryImpl implements DepartmentFactory {

  private final DepartmentRepository departmentRepository;

  @Override
  public DepartmentId createDepartment(DepartmentData data) {
    return departmentRepository
        .save(
            Department.builder()
                .name(new DepartmentName(data.name()))
                .description(data.description())
                .build()
        )
        .getId();
  }
}
