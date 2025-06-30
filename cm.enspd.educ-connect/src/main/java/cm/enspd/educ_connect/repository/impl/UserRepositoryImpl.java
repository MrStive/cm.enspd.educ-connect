package cm.enspd.educ_connect.repository.impl;

import cm.enspd.educ_connect.domaine.user.User;
import cm.enspd.educ_connect.domaine.user.UserData;
import cm.enspd.educ_connect.domaine.user.UserId;
import cm.enspd.educ_connect.domaine.user.UserRepository;
import cm.enspd.educ_connect.repository.UserSpringRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {
  private final UserSpringRepository userSpringRepository;

  @Override
  public User saveStudent(User student) {
    return userSpringRepository.save(student);
  }

    @Override
    public Optional<User> loadStudent(UserId userId) {
        return userSpringRepository.findById(userId);
    }
}
