package cm.enspd.educ_connect.domaine.program;

import cm.enspd.educ_connect.domaine.EducConnectEntityBase;
import cm.enspd.educ_connect.domaine.department.Department;
import cm.enspd.educ_connect.domaine.level.Level;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@FieldNameConstants
@Getter
@Setter
@NoArgsConstructor
@Entity
@SuperBuilder
@Table(name = "t_program")
public class Program extends EducConnectEntityBase<ProgramId> {

  @EmbeddedId
  @AttributeOverride(name = "value", column = @Column(name = "c_id"))
  private ProgramId id = new ProgramId();

  @Embedded
  @AttributeOverride(name = "value", column = @Column(name = "c_name"))
  private ProgramName name;

  @Column(name = "c_description")
  private String description;

  @ManyToOne
  @JoinColumn(name = "c_department_id")
  private Department department;

  @ManyToOne
  @JoinColumn(name = "c_level_id")
  private Level level;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Program program)) return false;
    return Objects.equals(id, program.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }
}
