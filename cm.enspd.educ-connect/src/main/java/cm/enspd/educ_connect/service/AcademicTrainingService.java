package cm.enspd.educ_connect.service;

import cm.enspd.educ_connect.domaine.academictraining.AcademicTrainingFactory;
import cm.enspd.educ_connect.domaine.academictraining.AcademicTrainingFetcher;
import cm.enspd.educ_connect.domaine.academictraining.AcademicTrainingId;
import cm.enspd.educ_connect.dto.AcademicTrainingDTO;
import cm.enspd.educ_connect.dto.CreateAcademicTraining;
import cm.enspd.educ_connect.service.mapper.AcademicTrainingMapper;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AcademicTrainingService {

  private final AcademicTrainingFactory academicTrainingFactory;
  private final AcademicTrainingFetcher academicTrainingFetcher;
  private final AcademicTrainingMapper academicTrainingMapper;

  @Transactional
  public UUID create(CreateAcademicTraining createAcademicTraining) {
    return academicTrainingFactory
        .create(academicTrainingMapper.toData(createAcademicTraining))
        .toUUID();
  }

  @Transactional(readOnly = true)
  public List<AcademicTrainingDTO> findAll() {
    return academicTrainingFetcher.findAll().stream()
        .map(academicTrainingMapper::toDto)
        .collect(Collectors.toList());
  }

  @Transactional(readOnly = true)
  public AcademicTrainingDTO findById(UUID id) {
    return academicTrainingFetcher
        .findById(new AcademicTrainingId(id.toString()))
        .map(academicTrainingMapper::toDto)
        .orElseThrow(() -> new RuntimeException("AcademicTraining not found"));
  }
}
