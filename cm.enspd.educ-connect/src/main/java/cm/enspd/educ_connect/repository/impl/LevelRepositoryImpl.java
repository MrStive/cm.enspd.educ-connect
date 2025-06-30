package cm.enspd.educ_connect.repository.impl;

import cm.enspd.educ_connect.domaine.level.Level;
import cm.enspd.educ_connect.domaine.level.LevelRepository;
import cm.enspd.educ_connect.repository.LevelSpringRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LevelRepositoryImpl implements LevelRepository {
  private final LevelSpringRepository levelSpringRepository;

  @Override
  public Level save(Level level) {
    return levelSpringRepository.save(level);
  }

  @Override
  public List<Level> loadAllLevels() {
    return levelSpringRepository.findAll();
  }
}
