package cm.enspd.educ_connect.domaine.academictraining;

import cm.enspd.educ_connect.domaine.EducConnectEntityBase;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Objects;

import lombok.*;
import lombok.experimental.FieldNameConstants;
import lombok.experimental.SuperBuilder;

@FieldNameConstants
@Getter
@Setter
@NoArgsConstructor
@Entity
@SuperBuilder
@AllArgsConstructor
@Table(name = "t_academic_training")
public class AcademicTraining extends EducConnectEntityBase<AcademicTrainingId> {

  @Builder.Default
  @EmbeddedId
  @AttributeOverride(name = "value", column = @Column(name = "c_id"))
  private AcademicTrainingId id = new AcademicTrainingId();

  @Column(name = "c_name")
  private String name;

  @Column(name = "c_description")
  private String description;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof AcademicTraining that)) {
      return false;
    }
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }
}
