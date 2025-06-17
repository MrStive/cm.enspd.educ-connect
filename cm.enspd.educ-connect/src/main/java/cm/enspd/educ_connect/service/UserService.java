package cm.enspd.educ_connect.service;

import cm.enspd.educ_connect.domaine.user.UserFactory;
import cm.enspd.educ_connect.dto.UserDTO;
import cm.enspd.educ_connect.service.mapper.UserMapper;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
  private final UserFactory userFactory;
  private final UserMapper userMapper;

  @Transactional
  public UUID createStudent(UserDTO userDTO) {
    return userFactory.createStudent(userMapper.mapToUserData(userDTO)).toUUID();
  }
}
