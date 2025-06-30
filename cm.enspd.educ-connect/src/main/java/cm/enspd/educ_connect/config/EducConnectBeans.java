package cm.enspd.educ_connect.config;

import cm.enspd.educ_connect.domaine.academictraining.AcademicTrainingRepository;
import cm.enspd.educ_connect.domaine.demo.DemoFactory;
import cm.enspd.educ_connect.domaine.demo.DemoFetcher;
import cm.enspd.educ_connect.domaine.demo.DemoRepository;
import cm.enspd.educ_connect.domaine.demo.impl.DemoFactoryImpl;
import cm.enspd.educ_connect.domaine.demo.impl.DemoFetcherImpl;
import cm.enspd.educ_connect.domaine.department.*;
import cm.enspd.educ_connect.domaine.department.program.ProgramFactory;
import cm.enspd.educ_connect.domaine.department.program.ProgramFactoryImpl;
import cm.enspd.educ_connect.domaine.department.program.ProgramFetcher;
import cm.enspd.educ_connect.domaine.department.program.ProgramRepository;
import cm.enspd.educ_connect.domaine.level.LevelFactory;
import cm.enspd.educ_connect.domaine.level.LevelFactoryImpl;
import cm.enspd.educ_connect.domaine.level.LevelRepository;
import cm.enspd.educ_connect.domaine.user.UserFactory;
import cm.enspd.educ_connect.domaine.user.UserFactoryImpl;
import cm.enspd.educ_connect.domaine.user.UserRepository;
import cm.enspd.educ_connect.repository.*;
import cm.enspd.educ_connect.repository.impl.*;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
public class EducConnectBeans {

  @Bean
  public DemoFactory demoFactory(DemoRepository demoRepository) {
    return new DemoFactoryImpl(demoRepository);
  }

  @Bean
  UserRepository userRepository(UserSpringRepository userSpringRepository) {
    return new UserRepositoryImpl(userSpringRepository);
  }

  @Bean
  public UserFactory userFactory(UserRepository userRepository) {
    return new UserFactoryImpl(userRepository);
  }

  @Bean
  public DemoRepository demoRepository(DemoSpringRepository demoSpringRepository) {
    return new DemoRepositoryImpl(demoSpringRepository);
  }

  @Bean
  public DemoFetcher demoFetcher(DemoRepository demoRepository) {
    return new DemoFetcherImpl(demoRepository);
  }

  @Bean
  public AcademicTrainingRepository academicTrainingRepository(
      AcademicTrainingSpringRepository academicTrainingSpringRepository) {
    return new AcademicTrainingRepositoryImpl(academicTrainingSpringRepository);
  }

  @Bean
  public DepartmentRepository departmentRepository(
      DepartmentSpringRepository departmentSpringRepository) {
    return new DepartmentRepositoryImpl(departmentSpringRepository);
  }

  @Bean
  public DepartmentFetcher departmentFetcher(DepartmentRepository departmentRepository) {
    return new DepartmentFetcherImpl(departmentRepository);
  }

  @Bean
  public DepartmentFactory departmentFactory(DepartmentRepository departmentRepository) {
    return new DepartmentFactoryImpl(departmentRepository);
  }

  @Bean
  public ProgramRepository programRepository(
      ProgramSpringRepository programSpringRepository,
      SpecialitySpringRepository specialitySpringRepository) {
    return new ProgramRepositoryImpl(programSpringRepository, specialitySpringRepository);
  }

  @Bean
  public ProgramFactory programFactory(ProgramRepository programRepository) {
    return new ProgramFactoryImpl(programRepository);
  }

  @Bean
  public ProgramFetcher programFetcher(ProgramRepository programRepository) {
    return new ProgramFetcherImpl(programRepository);
  }

  @Bean
  public LevelFactory levelFactory(LevelRepository levelRepository) {
    return new LevelFactoryImpl(levelRepository);
  }

  @Bean
  public LevelRepository levelRepository(LevelSpringRepository levelSpringRepository) {
    return new LevelRepositoryImpl(levelSpringRepository);
  }
}
