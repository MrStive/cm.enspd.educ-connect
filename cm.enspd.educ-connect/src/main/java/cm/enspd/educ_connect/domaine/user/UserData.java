package cm.enspd.educ_connect.domaine.user;

import java.time.LocalDate;
import java.util.UUID;
import lombok.Builder;

@Builder
public record UserData(
    String username,
    String email,
    String password,
    String firstName,
    String lastName,
    Contact contact,
    Training training,
    LocalDate birthdate,
    UUID level) {}
