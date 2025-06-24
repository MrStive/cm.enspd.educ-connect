package cm.enspd.educ_connect.repository;

import cm.enspd.educ_connect.domaine.Program;
import cm.enspd.educ_connect.domaine.ProgramId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramSpringRepository extends JpaRepository<Program, ProgramId> {
}
