package cm.enspd.educ_connect.domaine.level;

import cm.enspd.educ_connect.domaine.EducConnectEntityBase;
import cm.enspd.educ_connect.domaine.department.program.Program;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Objects;

@FieldNameConstants
@Getter
@Setter
@NoArgsConstructor
@Entity
@SuperBuilder
@Table(name = "t_level")
public class Level extends EducConnectEntityBase<LevelId> {

  @EmbeddedId
  @AttributeOverride(name = "value", column = @Column(name = "c_id"))
  private LevelId id = new LevelId();

  @Embedded
  @AttributeOverride(name = "value", column = @Column(name = "c_name"))
  private LevelName name;

  @OneToMany(mappedBy = "level", cascade = CascadeType.ALL)
  private List<Program> programs;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Level level)) return false;
    return Objects.equals(id, level.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }
}
