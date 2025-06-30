package cm.enspd.educ_connect.domaine.level;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LevelFetcherImpl implements LevelFetcher {

  private final LevelRepository levelRepository;

  @Override
  public List<Level> findAllLevels() {
    return levelRepository.loadAllLevels();
  }
}
