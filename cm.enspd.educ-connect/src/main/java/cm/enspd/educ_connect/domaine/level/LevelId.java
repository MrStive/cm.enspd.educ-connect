package cm.enspd.educ_connect.domaine.level;

import cm.enspd.educ_connect.domaine.Identifier;
import jakarta.persistence.Embeddable;
import java.util.UUID;

@Embeddable
public class LevelId extends Identifier {
  public LevelId() {
    super();
  }

  public LevelId(String value) {
    super(value);
  }

  public LevelId(UUID value) {
    super(value);
  }
}
