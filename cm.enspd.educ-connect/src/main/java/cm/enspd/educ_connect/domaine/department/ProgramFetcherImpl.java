package cm.enspd.educ_connect.domaine.department;

import cm.enspd.educ_connect.domaine.department.program.Program;
import cm.enspd.educ_connect.domaine.department.program.ProgramFetcher;
import cm.enspd.educ_connect.domaine.department.program.ProgramId;
import cm.enspd.educ_connect.domaine.department.program.ProgramRepository;
import cm.enspd.educ_connect.domaine.department.program.speciality.Speciality;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProgramFetcherImpl implements ProgramFetcher {

  private final ProgramRepository programRepository;

  @Override
  public List<Program> findByDepartmentId(DepartmentId departmentId) {
    return programRepository.findByDepartmentId(departmentId);
  }

  @Override
  public ProgramId findById(ProgramId programId) {
    return programRepository
        .findById(programId)
        .orElseThrow(ResourceNotFoundException::new)
        .getId();
  }

  @Override
  public List<Speciality> fetchAllSpecialities(UUID programId) {
    return programRepository.loadSpecialitiesByProgram(new ProgramId(programId));
  }
}
