package cm.enspd.educ_connect.domaine.demo.impl;

import cm.enspd.educ_connect.domaine.demo.Demo;
import cm.enspd.educ_connect.domaine.demo.DemoFetcher;
import cm.enspd.educ_connect.domaine.demo.DemoRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class DemoFetcherImpl implements DemoFetcher {

  private final DemoRepository demoRepository;

  @Override
  public List<Demo> loadAllDemos() {
    return demoRepository.findAll();
  }
}
