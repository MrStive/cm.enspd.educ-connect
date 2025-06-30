package cm.enspd.educ_connect.domaine.department.program.speciality;

import cm.enspd.educ_connect.domaine.EducConnectEntityBase;
import cm.enspd.educ_connect.domaine.department.program.Program;
import jakarta.persistence.*;
import java.util.Objects;
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
@Table(name = "t_speciality")
public class Speciality extends EducConnectEntityBase<SpecialityId> {

  @EmbeddedId
  @AttributeOverride(name = "value", column = @Column(name = "c_id"))
  private SpecialityId id = new SpecialityId();

  @Column(name = "c_name")
  private String name;

  @Column(name = "c_description")
  private String description;

  @ManyToOne
  @JoinColumn(name = "c_program_id")
  private Program program;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Speciality speciality)) return false;
    return Objects.equals(id, speciality.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }
}
