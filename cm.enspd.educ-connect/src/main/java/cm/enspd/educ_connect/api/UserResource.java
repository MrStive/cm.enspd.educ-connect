package cm.enspd.educ_connect.api;

import cm.enspd.educ_connect.dto.UserDTO;
import cm.enspd.educ_connect.service.UserService;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserResource implements UserApi {
  private final UserService userService;

  @Override
  public ResponseEntity<UUID> registerStudent(UserDTO userDTO) {
    return ResponseEntity.status(HttpStatus.CREATED).body(userService.createStudent(userDTO));
  }
}
