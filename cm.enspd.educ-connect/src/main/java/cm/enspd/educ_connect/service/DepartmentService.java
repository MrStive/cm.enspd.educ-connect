package cm.enspd.educ_connect.service;

import cm.enspd.educ_connect.domaine.department.DepartmentFactory;
import cm.enspd.educ_connect.domaine.department.DepartmentFetcher;
import cm.enspd.educ_connect.dto.CreateDepartment;
import cm.enspd.educ_connect.dto.DepartmentDTO;
import cm.enspd.educ_connect.service.mapper.DepartmentMapper;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DepartmentService {
  private final DepartmentFactory departmentFactory;
  private final DepartmentMapper departmentMapper;
  private final DepartmentFetcher departmentFetcher;

  @Transactional
  public UUID createDepartment(CreateDepartment createDepartment) {
    return departmentFactory
        .createDepartment(departmentMapper.mapToDepartmentData(createDepartment))
        .toUUID();
  }

  @Transactional(readOnly = true)
  public List<DepartmentDTO> getAllDepartments() {
    return departmentFetcher.loadAllDepartments().stream()
        .map(departmentMapper::mapToDTO)
        .collect(Collectors.toList());
  }
}
