package cm.enspd.educ_connect.domaine.level;

import cm.enspd.educ_connect.domaine.EducConnectEntityBase;
import cm.enspd.educ_connect.domaine.academictraining.AcademicTrainingId;
import jakarta.persistence.*;
import java.util.Objects;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;
import lombok.experimental.SuperBuilder;

@FieldNameConstants
@Getter
@Setter
@NoArgsConstructor
@Entity
@SuperBuilder
@Table(name = "t_level")
public class Level extends EducConnectEntityBase<LevelId> {

  @Builder.Default
  @EmbeddedId
  @AttributeOverride(name = "value", column = @Column(name = "c_id"))
  private LevelId id = new LevelId();

  @Column(name = "c_name")
  private String name;

  @Embedded
  @AttributeOverride(name = "value", column = @Column(name = "c_academic_training_id"))
  private AcademicTrainingId academicTrainingId;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Level level)) {
      return false;
    }
    return Objects.equals(id, level.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }
}
