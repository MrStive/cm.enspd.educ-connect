package cm.enspd.educ_connect.api;

import cm.enspd.educ_connect.dto.CreateSpeciality;
import cm.enspd.educ_connect.dto.ProgramDTO;
import cm.enspd.educ_connect.dto.SpecialityDTO;
import cm.enspd.educ_connect.service.ProgramService;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProgramResource implements ProgramApi {
  private final ProgramService programService;

  @Override
  public ResponseEntity<UUID> addNewSpeciality(
      UUID departmentId, CreateSpeciality createSpeciality) {
    return ResponseEntity.status(HttpStatus.CREATED)
        .body(programService.addNewSpeciality(departmentId, createSpeciality));
  }

  @Override
  public ResponseEntity<List<ProgramDTO>> fetchAllProgramByDepartment(UUID departmentId) {
    return ResponseEntity.ok(programService.fetchAllProgramByDepartment(departmentId));
  }

  @Override
  public ResponseEntity<List<SpecialityDTO>> fetchAllSpecialityByProgram(UUID departmentId) {
    return ResponseEntity.ok(programService.getSpecialitiesByProgram(departmentId));
  }
}
