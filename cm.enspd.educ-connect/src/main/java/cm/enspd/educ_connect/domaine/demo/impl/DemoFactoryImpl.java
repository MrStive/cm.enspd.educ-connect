package cm.enspd.educ_connect.domaine.demo.impl;

import cm.enspd.educ_connect.domaine.demo.Demo;
import cm.enspd.educ_connect.domaine.demo.DemoData;
import cm.enspd.educ_connect.domaine.demo.DemoFactory;
import cm.enspd.educ_connect.domaine.demo.DemoName;
import cm.enspd.educ_connect.domaine.demo.DemoRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DemoFactoryImpl implements DemoFactory {
  private final DemoRepository demoRepository;

  @Override
  public Demo create(DemoData demoData) {
    return demoRepository.save(Demo.builder().name(new DemoName(demoData.name())).build());
  }
}
