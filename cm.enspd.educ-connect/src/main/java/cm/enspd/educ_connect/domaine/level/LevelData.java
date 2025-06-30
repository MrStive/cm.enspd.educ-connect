package cm.enspd.educ_connect.domaine.level;

import cm.enspd.educ_connect.domaine.academictraining.AcademicTrainingId;
import lombok.Builder;
import lombok.Data;
import lombok.Setter;

@Data
@Builder
@Setter
public class LevelData {
  private String name;
  private AcademicTrainingId academicTrainingId;
}
