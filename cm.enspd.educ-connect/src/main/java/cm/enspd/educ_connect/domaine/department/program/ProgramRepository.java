package cm.enspd.educ_connect.domaine.department.program;

import cm.enspd.educ_connect.domaine.department.DepartmentId;
import cm.enspd.educ_connect.domaine.department.program.speciality.Speciality;
import java.util.List;
import java.util.Optional;

public interface ProgramRepository {
  Program save(Program program);

  List<Program> findByDepartmentId(DepartmentId departmentId);

  Optional<Program> findById(ProgramId programId);

  List<Speciality> loadSpecialitiesByProgram(ProgramId programId);

  Speciality saveSpeciality(Speciality speciality);
}
