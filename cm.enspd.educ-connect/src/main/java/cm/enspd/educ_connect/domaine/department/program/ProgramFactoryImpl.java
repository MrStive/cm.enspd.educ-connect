package cm.enspd.educ_connect.domaine.department.program;

import cm.enspd.educ_connect.domaine.department.program.speciality.Speciality;
import cm.enspd.educ_connect.domaine.department.program.speciality.SpecialityData;
import cm.enspd.educ_connect.domaine.department.program.speciality.SpecialityId;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;

@RequiredArgsConstructor
public class ProgramFactoryImpl implements ProgramFactory {

  private final ProgramRepository programRepository;

  @Override
  public ProgramId createProgram(UUID departmentId, ProgramData data) {
    return programRepository
        .save(
            Program.builder()
                .name(new ProgramName(data.name()))
                .description(data.description())
                .build())
        .getId();
  }

  @Override
  public SpecialityId addNewSpeciality(UUID programId, SpecialityData specialityData) {
    Program program =
        programRepository
            .findById(new ProgramId(programId))
            .orElseThrow(ResourceNotFoundException::new);
    return programRepository
        .saveSpeciality(
            Speciality.builder()
                .program(program)
                .name(specialityData.name())
                .description(specialityData.description())
                .build())
        .getId();
  }
}
