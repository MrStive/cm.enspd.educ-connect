package cm.enspd.educ_connect.domaine.level;

import jakarta.persistence.Embeddable;
import lombok.Getter;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Getter
@Embeddable
public class LevelId implements Serializable {
  private String value;

  public LevelId() {
    this.value = UUID.randomUUID().toString();
  }

  public LevelId(String value) {
    this.value = value;
  }

  public LevelId(UUID value) {
    this.value = value.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof LevelId that)) return false;
    return Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  public UUID toUUID() {
    return UUID.fromString(value);
  }
}
