package cm.enspd.educ_connect.domaine;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public abstract class Identifier implements Serializable {

  private String value;

  public Identifier() {
    this.value = UUID.randomUUID().toString();
  }

  public Identifier(String value) {
    this.value = value;
  }

  public Identifier(UUID value) {
    this.value = value.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Identifier that = (Identifier) o;
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

  public UUID toUUID() {
    return UUID.fromString(value);
  }
}
