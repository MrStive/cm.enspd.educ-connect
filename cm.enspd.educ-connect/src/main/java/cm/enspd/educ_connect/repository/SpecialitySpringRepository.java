package cm.enspd.educ_connect.repository;

import cm.enspd.educ_connect.domaine.department.program.ProgramId;
import cm.enspd.educ_connect.domaine.department.program.speciality.Speciality;
import cm.enspd.educ_connect.domaine.department.program.speciality.SpecialityId;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialitySpringRepository extends JpaRepository<Speciality, SpecialityId> {
  List<Speciality> findByProgramId(ProgramId programId);
}
