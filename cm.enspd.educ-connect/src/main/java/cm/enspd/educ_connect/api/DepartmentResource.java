package cm.enspd.educ_connect.api;

import cm.enspd.educ_connect.dto.CreateDepartment;
import cm.enspd.educ_connect.dto.CreateProgram;
import cm.enspd.educ_connect.dto.DepartmentDTO;
import cm.enspd.educ_connect.service.DepartmentService;
import cm.enspd.educ_connect.service.ProgramService;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DepartmentResource implements DepartmentApi {
  private final DepartmentService departmentService;
  private final ProgramService programService;

  @Override
  public ResponseEntity<UUID> addNewProgram(UUID departmentId, CreateProgram createProgram) {
    return ResponseEntity.status(HttpStatus.CREATED)
        .body(programService.createProgram(departmentId, createProgram));
  }

  @Override
  public ResponseEntity<UUID> createNewDepartment(CreateDepartment createDepartment) {
    return ResponseEntity.status(HttpStatus.CREATED)
        .body(departmentService.createDepartment(createDepartment));
  }

  @Override
  public ResponseEntity<List<DepartmentDTO>> getAllDepartment() {
    return ResponseEntity.ok(departmentService.getAllDepartments());
  }
}
