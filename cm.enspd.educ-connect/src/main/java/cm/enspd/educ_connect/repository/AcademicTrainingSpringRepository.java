package cm.enspd.educ_connect.repository;

import cm.enspd.educ_connect.domaine.academictraining.AcademicTraining;
import cm.enspd.educ_connect.domaine.academictraining.AcademicTrainingId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicTrainingSpringRepository
    extends JpaRepository<AcademicTraining, AcademicTrainingId> {}
