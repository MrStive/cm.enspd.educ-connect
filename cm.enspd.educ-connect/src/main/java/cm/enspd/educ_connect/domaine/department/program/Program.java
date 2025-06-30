package cm.enspd.educ_connect.domaine.department.program;

import cm.enspd.educ_connect.domaine.EducConnectEntityBase;
import cm.enspd.educ_connect.domaine.department.Department;
import cm.enspd.educ_connect.domaine.department.program.speciality.Speciality;
import cm.enspd.educ_connect.domaine.level.Level;
import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
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

  @OneToMany(mappedBy = "program", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<Speciality> specialities = new HashSet<>();

  public void addSpeciality(Speciality speciality) {
    specialities.add(speciality);
    speciality.setProgram(this);
  }

  public void removeSpeciality(Speciality speciality) {
    specialities.remove(speciality);
    speciality.setProgram(null);
  }

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
