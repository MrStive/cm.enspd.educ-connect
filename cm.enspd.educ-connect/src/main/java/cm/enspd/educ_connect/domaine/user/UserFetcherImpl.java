package cm.enspd.educ_connect.domaine.user;

import cm.enspd.educ_connect.repository.UserSpringRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserFetcherImpl implements UserFetcher {

  private final UserSpringRepository userSpringRepository;

  @Override
  public Optional<User> findById(UserId id) {
    return userSpringRepository.findById(id);
  }
}
