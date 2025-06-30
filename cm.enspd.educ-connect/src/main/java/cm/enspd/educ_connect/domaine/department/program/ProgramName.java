package cm.enspd.educ_connect.domaine.department.program;

import jakarta.persistence.Embeddable;
import lombok.Getter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Embeddable
public class ProgramName implements Serializable {

  private String value;

  // Constructeur sans argument requis par JPA
  public ProgramName() {
  }

  // Constructeur avec valeur
  public ProgramName(String value) {
    // Exemple de validation simple : non null et non vide
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
