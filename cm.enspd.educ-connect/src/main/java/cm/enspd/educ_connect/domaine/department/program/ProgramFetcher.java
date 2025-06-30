package cm.enspd.educ_connect.domaine.department.program;

import cm.enspd.educ_connect.domaine.department.DepartmentId;
import cm.enspd.educ_connect.domaine.department.program.speciality.Speciality;
import java.util.List;
import java.util.UUID;

public interface ProgramFetcher {
  List<Program> findByDepartmentId(DepartmentId departmentId);

  ProgramId findById(ProgramId programId);

  List<Speciality> fetchAllSpecialities(UUID programId);
}
