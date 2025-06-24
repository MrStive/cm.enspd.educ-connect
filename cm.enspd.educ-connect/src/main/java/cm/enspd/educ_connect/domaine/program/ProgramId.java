package cm.enspd.educ_connect.domaine.program;

import jakarta.persistence.Embeddable;
import lombok.Getter;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Getter
@Embeddable
public class ProgramId implements Serializable {
  private String value;

  public ProgramId() {
    this.value = UUID.randomUUID().toString();
  }

  public ProgramId(String value) {
    this.value = value;
  }

  public ProgramId(UUID value) {
    this.value = value.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof ProgramId that)) return false;
    return Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }
}
