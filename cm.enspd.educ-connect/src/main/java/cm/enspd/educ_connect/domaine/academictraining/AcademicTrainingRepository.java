package cm.enspd.educ_connect.domaine.academictraining;

import java.util.List;
import java.util.Optional;

public interface AcademicTrainingRepository {
  AcademicTraining save(AcademicTraining academicTraining);

  List<AcademicTraining> findAll();

  Optional<AcademicTraining> findById(AcademicTrainingId academicTrainingId);
}
