package cm.enspd.educ_connect.domaine.academictraining.impl;

import cm.enspd.educ_connect.domaine.academictraining.AcademicTraining;
import cm.enspd.educ_connect.domaine.academictraining.AcademicTrainingFetcher;
import cm.enspd.educ_connect.domaine.academictraining.AcademicTrainingId;
import cm.enspd.educ_connect.domaine.academictraining.AcademicTrainingRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AcademicTrainingFetcherImpl implements AcademicTrainingFetcher {
  private final AcademicTrainingRepository academicTrainingRepository;

  @Override
  public List<AcademicTraining> findAll() {
    return academicTrainingRepository.findAll();
  }

  @Override
  public Optional<AcademicTraining> findById(AcademicTrainingId academicTrainingId) {
    return academicTrainingRepository.findById(academicTrainingId);
  }
}
