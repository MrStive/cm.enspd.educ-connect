package cm.enspd.educ_connect.domaine.user;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "t_user")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
  @EmbeddedId
  @Column(name = "c_id")
  @Builder.Default
  private UserId userId = new UserId();

  @Column(name = "c_username")
  private String username;

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
