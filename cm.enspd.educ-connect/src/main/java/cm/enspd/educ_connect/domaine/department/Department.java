package cm.enspd.educ_connect.domaine.department;

import cm.enspd.educ_connect.domaine.EducConnectEntityBase;
import cm.enspd.educ_connect.domaine.program.Program;
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
@Table(name = "t_department")
public class Department extends EducConnectEntityBase<DepartmentId> {

  @EmbeddedId
  @AttributeOverride(name = "value", column = @Column(name = "c_id"))
  private DepartmentId id = new DepartmentId();

  @Embedded
  @AttributeOverride(name = "value", column = @Column(name = "c_name"))
  private DepartmentName name;

  @Column(name = "c_description")
  private String description;

  @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
  private List<Program> programs;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Department that)) return false;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }
}
