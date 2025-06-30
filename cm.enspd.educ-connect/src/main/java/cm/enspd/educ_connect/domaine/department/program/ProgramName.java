package cm.enspd.educ_connect.domaine.department.program;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;
import lombok.Getter;

@Getter
@Embeddable
public class ProgramName implements Serializable {

  private String value;

  public ProgramName() {}

  public ProgramName(String value) {
    if (value == null || value.isBlank()) {
      throw new IllegalArgumentException("Program name cannot be null or empty");
    }
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof ProgramName that)) return false;
    return Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return value;
  }
}
