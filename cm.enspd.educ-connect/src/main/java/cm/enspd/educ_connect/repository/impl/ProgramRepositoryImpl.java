package cm.enspd.educ_connect.repository.impl;

import cm.enspd.educ_connect.domaine.department.DepartmentId;
import cm.enspd.educ_connect.domaine.department.program.Program;
import cm.enspd.educ_connect.domaine.department.program.ProgramId;
import cm.enspd.educ_connect.domaine.department.program.ProgramRepository;
import cm.enspd.educ_connect.domaine.department.program.speciality.Speciality;
import cm.enspd.educ_connect.repository.ProgramSpringRepository;
import cm.enspd.educ_connect.repository.SpecialitySpringRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProgramRepositoryImpl implements ProgramRepository {
  private final ProgramSpringRepository programSpringRepository;
  private final SpecialitySpringRepository specialitySpringRepository;

  @Override
  public Program save(Program program) {
    return programSpringRepository.save(program);
  }

  @Override
  public List<Program> findByDepartmentId(DepartmentId departmentId) {
    return programSpringRepository.findByDepartmentId(departmentId);
  }

  @Override
  public Optional<Program> findById(ProgramId programId) {
    return programSpringRepository.findById(programId);
  }

  @Override
  public List<Speciality> loadSpecialitiesByProgram(ProgramId programId) {
    return specialitySpringRepository.findByProgramId(programId);
  }

  @Override
  public Speciality saveSpeciality(Speciality speciality) {
    return specialitySpringRepository.save(speciality);
  }
}
