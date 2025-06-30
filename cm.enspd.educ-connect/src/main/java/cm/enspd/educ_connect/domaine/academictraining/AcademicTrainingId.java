package cm.enspd.educ_connect.domaine.academictraining;

import cm.enspd.educ_connect.domaine.Identifier;
import jakarta.persistence.Embeddable;

@Embeddable
public class AcademicTrainingId extends Identifier {
  public AcademicTrainingId() {
    super();
  }

  public AcademicTrainingId(String value) {
    super(value);
  }
}
