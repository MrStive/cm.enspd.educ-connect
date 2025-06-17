package cm.enspd.educ_connect.repository.impl;

import cm.enspd.educ_connect.domaine.user.User;
import cm.enspd.educ_connect.domaine.user.UserRepository;
import cm.enspd.educ_connect.repository.UserSpringRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {
  private final UserSpringRepository userSpringRepository;

  @Override
  public User saveStudent(User student) {
    return userSpringRepository.save(student);
  }
}
