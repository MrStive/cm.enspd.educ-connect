package cm.enspd.educ_connect.domaine.academictraining;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AcademicTrainingData {
  private String name;
  private String description;
}
