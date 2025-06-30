package cm.enspd.educ_connect.domaine.demo;

import cm.enspd.educ_connect.domaine.Identifier;
import jakarta.persistence.Embeddable;
import java.util.UUID;

@Embeddable
public class DemoId extends Identifier {
  public DemoId() {
    super();
  }

  public DemoId(String value) {
    super(value);
  }

  public DemoId(UUID value) {
    super(value);
  }
}
