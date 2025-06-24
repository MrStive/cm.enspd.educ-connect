package cm.enspd.educ_connect.domaine.user;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserFactoryImpl implements UserFactory {
  private final UserRepository userRepository;

  @Override
  public UserId createStudent(UserData userData) {
    return userRepository
        .saveStudent(
            User.builder()
                .contact(userData.contact())
                .level(userData.level())
                .firstName(userData.firstName())
                .lastName(userData.lastName())
                .training(userData.training())
                .birthDate(userData.birthdate())
                .build())
        .getUserId();
  }
}
