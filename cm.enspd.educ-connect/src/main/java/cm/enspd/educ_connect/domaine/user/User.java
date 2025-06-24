package cm.enspd.educ_connect.domaine.user;

import cm.enspd.educ_connect.domaine.EducConnectEntityBase;
import cm.enspd.educ_connect.domaine.demo.DemoId;
import jakarta.persistence.*;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;
import lombok.experimental.SuperBuilder;

@Entity
@FieldNameConstants
@Setter
@Getter
@NoArgsConstructor
@SuperBuilder
@Table(name = "t_user")
public class User extends EducConnectEntityBase<UserId> {
  @Builder.Default
  @EmbeddedId
  @AttributeOverride(name = "value", column = @Column(name = "c_id"))
  private UserId id = new UserId();

  @Column(name = "c_username")
  private String username;
   @Column(name = "c_email")
  private String email;

  @Column(name = "c_first_name")
  private String firstName;

  @Column(name = "c_last_name")
  private String lastName;

  @Column(name = "c_level")
  private int level;

  @Enumerated(EnumType.STRING)
  @Column(name = "c_training")
  private Training training;

  @Embedded private Contact contact;

  @Column(name = "c_birth_date")
  private LocalDate birthDate;
}
