package cm.enspd.educ_connect.domaine.user;

import java.util.Optional;

public interface UserFetcher {
  Optional<User> findById(UserId id);
}
