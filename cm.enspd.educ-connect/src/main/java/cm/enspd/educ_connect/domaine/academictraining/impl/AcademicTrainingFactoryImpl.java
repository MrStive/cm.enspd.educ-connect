package cm.enspd.educ_connect.domaine.academictraining.impl;

import cm.enspd.educ_connect.domaine.academictraining.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AcademicTrainingFactoryImpl implements AcademicTrainingFactory {

  private final AcademicTrainingRepository academicTrainingRepository;

  @Override
  public AcademicTrainingId create(AcademicTrainingData academicTrainingData) {
    AcademicTraining academicTraining =
        AcademicTraining.builder()
            .name(academicTrainingData.getName())
            .description(academicTrainingData.getDescription())
            .build();
    return academicTrainingRepository.save(academicTraining).getId();
  }
}
