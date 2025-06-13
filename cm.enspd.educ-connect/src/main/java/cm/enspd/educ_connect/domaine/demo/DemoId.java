package cm.enspd.educ_connect.domaine.demo;

import jakarta.persistence.Embeddable;
import lombok.Getter;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Getter
@Embeddable
public class DemoId implements Serializable {
  private String value;

  public DemoId() {
    this.value = UUID.randomUUID().toString();
  }

  public DemoId(String value) {
    this.value = value;
  }

  public DemoId(UUID value) {
    this.value = value.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof DemoId that)) {
      return false;
    }
    return Objects.equals(value, that.value);
  }
}
