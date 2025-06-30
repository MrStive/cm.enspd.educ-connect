package cm.enspd.educ_connect.domaine.user;

import java.util.Optional;

public interface UserRepository {
  User saveStudent(User student);

  Optional<User> loadStudent(UserId userId);
}
