package cm.enspd.educ_connect.repository;

import cm.enspd.educ_connect.domaine.Level;
import cm.enspd.educ_connect.domaine.LevelId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelSpringRepository extends JpaRepository<Level, LevelId> {
}
