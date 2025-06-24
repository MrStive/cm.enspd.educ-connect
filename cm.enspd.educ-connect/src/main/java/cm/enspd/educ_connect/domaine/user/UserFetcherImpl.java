package cm.enspd.educ_connect.domaine.user;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserFetcherImpl implements UserFetcher {
    private final UserRepository userRepository;
    @Override
    public User fetchStudent(UserId userId) {
        return userRepository.loadStudent(userId).orElseThrow();
    }
}
