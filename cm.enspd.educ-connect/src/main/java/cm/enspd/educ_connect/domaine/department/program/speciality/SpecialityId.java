package cm.enspd.educ_connect.domaine.department.program.speciality;

import cm.enspd.educ_connect.domaine.Identifier;
import java.util.UUID;

public class SpecialityId extends Identifier {
  public SpecialityId() {
    super(UUID.randomUUID().toString());
  }

  public SpecialityId(String value) {
    super(value);
  }
}
