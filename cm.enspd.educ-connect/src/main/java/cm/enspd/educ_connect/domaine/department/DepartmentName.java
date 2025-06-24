package cm.enspd.educ_connect.domaine.department;

import jakarta.persistence.Embeddable;
import lombok.Getter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Embeddable
public class DepartmentName implements Serializable {

  private String value;

  public DepartmentName() {
  }

  public DepartmentName(String value) {
    if (value == null || value.isBlank()) {
      throw new IllegalArgumentException("Department name cannot be null or empty");
    }
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof DepartmentName that)) return false;
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
