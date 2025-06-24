
package cm.enspd.educ_connect.repository.impl;

import cm.enspd.educ_connect.domaine.level.Level;
import cm.enspd.educ_connect.domaine.level.LevelRepository;
import cm.enspd.educ_connect.repository.LevelSpringRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LevelRepositoryImpl implements LevelRepository {
  private final LevelSpringRepository levelSpringRepository;

  @Override
  public Level saveLevel(Level level) {
    return levelSpringRepository.save(level);
  }
}
