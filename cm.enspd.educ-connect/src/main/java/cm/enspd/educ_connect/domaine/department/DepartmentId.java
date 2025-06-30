package cm.enspd.educ_connect.domaine.department;

import jakarta.persistence.Embeddable;
import lombok.Getter;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Getter
@Embeddable
public class DepartmentId implements Serializable {
  private String value;

  public DepartmentId() {
    this.value = UUID.randomUUID().toString();
  }

  public DepartmentId(String value) {
    this.value = value;
  }

  public DepartmentId(UUID value) {
    this.value = value.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof DepartmentId that)) return false;
    return Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  public UUID toUUID() {
    return UUID.fromString(this.value);
  }
}
