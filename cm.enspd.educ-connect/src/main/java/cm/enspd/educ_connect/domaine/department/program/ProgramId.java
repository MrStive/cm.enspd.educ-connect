package cm.enspd.educ_connect.domaine.department.program;

import cm.enspd.educ_connect.domaine.Identifier;
import jakarta.persistence.Embeddable;
import java.util.UUID;

@Embeddable
public class ProgramId extends Identifier {
  public ProgramId() {
    super();
  }

  public ProgramId(String value) {
    super(value);
  }

  public ProgramId(UUID value) {
    super(value);
  }
}
