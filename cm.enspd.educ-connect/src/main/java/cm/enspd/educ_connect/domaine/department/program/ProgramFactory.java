package cm.enspd.educ_connect.domaine.department.program;

import cm.enspd.educ_connect.domaine.department.program.speciality.SpecialityData;
import cm.enspd.educ_connect.domaine.department.program.speciality.SpecialityId;
import java.util.UUID;

public interface ProgramFactory {
  ProgramId createProgram(UUID departmentId, ProgramData programData);

  SpecialityId addNewSpeciality(UUID programId, SpecialityData specialityData);
}
