package cm.enspd.educ_connect.domaine.Level;

import jakarta.persistence.Embeddable;
import lombok.Getter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Embeddable
public class LevelName implements Serializable {

  private String value;

  public LevelName() {
  }

  public LevelName(String value) {
    if (value == null || value.isBlank()) {
      throw new IllegalArgumentException("Level name cannot be null or empty");
    }
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof LevelName that)) return false;
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
