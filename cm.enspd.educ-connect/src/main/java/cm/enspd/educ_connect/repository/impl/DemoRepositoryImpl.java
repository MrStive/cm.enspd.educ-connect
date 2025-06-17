package cm.enspd.educ_connect.repository.impl;

import cm.enspd.educ_connect.domaine.demo.Demo;
import cm.enspd.educ_connect.domaine.demo.DemoRepository;
import cm.enspd.educ_connect.repository.DemoSpringRepository;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DemoRepositoryImpl implements DemoRepository {
  private final DemoSpringRepository demoSpringRepository;

  @Override
  public Demo save(Demo value) {
    return demoSpringRepository.save(value);
  }

  @Override
  public List<Demo> findAll() {
    return new ArrayList<>(demoSpringRepository.findAll());
  }
}
