package cm.enspd.educ_connect.domaine.academictraining;

import java.util.List;
import java.util.Optional;

public interface AcademicTrainingFetcher {

  List<AcademicTraining> findAll();

  Optional<AcademicTraining> findById(AcademicTrainingId id);
}
