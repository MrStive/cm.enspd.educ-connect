package cm.enspd.educ_connect.api;

import cm.enspd.educ_connect.dto.AcademicTrainingDTO;
import cm.enspd.educ_connect.dto.CreateAcademicTraining;
import cm.enspd.educ_connect.service.AcademicTrainingService;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AcademicTrainingResource implements AcademicTrainingApi {

  private final AcademicTrainingService academicTrainingService;

  @Override
  public ResponseEntity<UUID> createNewAcademicTraining(
      CreateAcademicTraining createAcademicTraining) {
    return ResponseEntity.status(HttpStatus.CREATED)
        .body(academicTrainingService.create(createAcademicTraining));
  }

  @Override
  public ResponseEntity<List<AcademicTrainingDTO>> getAllAcademicTraining() {
    return ResponseEntity.ok(academicTrainingService.findAll());
  }
}
