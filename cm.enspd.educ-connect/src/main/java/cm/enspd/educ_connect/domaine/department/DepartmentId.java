package cm.enspd.educ_connect.domaine.department;

import cm.enspd.educ_connect.domaine.Identifier;
import jakarta.persistence.Embeddable;

@Embeddable
public class DepartmentId extends Identifier {
  public DepartmentId() {
    super();
  }

  public DepartmentId(String value) {
    super(value);
  }
}
