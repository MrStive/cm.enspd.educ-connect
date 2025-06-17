package cm.enspd.educ_connect.repository;

import cm.enspd.educ_connect.domaine.user.User;
import cm.enspd.educ_connect.domaine.user.UserId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface UserSpringRepository extends JpaRepository<User, UserId> {}
