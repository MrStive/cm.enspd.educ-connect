package cm.enspd.educ_connect.domaine.level;

import java.util.List;

public interface LevelRepository {
  Level save(Level level);

  List<Level> loadAllLevels();
}
