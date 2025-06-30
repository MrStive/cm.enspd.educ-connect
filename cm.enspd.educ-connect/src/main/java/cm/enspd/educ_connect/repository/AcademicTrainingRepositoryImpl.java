package cm.enspd.educ_connect.repository;

import cm.enspd.educ_connect.domaine.academictraining.AcademicTraining;
import cm.enspd.educ_connect.domaine.academictraining.AcademicTrainingId;
import cm.enspd.educ_connect.domaine.academictraining.AcademicTrainingRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AcademicTrainingRepositoryImpl implements AcademicTrainingRepository {
  private final AcademicTrainingSpringRepository academicTrainingSpringRepository;

  @Override
  public AcademicTraining save(AcademicTraining academicTraining) {
    return academicTrainingSpringRepository.save(academicTraining);
  }

  @Override
  public List<AcademicTraining> findAll() {
    return academicTrainingSpringRepository.findAll();
  }

  @Override
  public Optional<AcademicTraining> findById(AcademicTrainingId academicTrainingId) {
    return academicTrainingSpringRepository.findById(academicTrainingId);
  }
}
