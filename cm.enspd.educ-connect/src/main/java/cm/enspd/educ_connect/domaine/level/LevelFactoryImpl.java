package cm.enspd.educ_connect.domaine.level;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LevelFactoryImpl implements LevelFactory {

  private final LevelRepository levelRepository;

  @Override
  public LevelId createLevel(LevelData data) {
    return levelRepository
        .save(
            Level.builder()
                .name(new LevelName(data.name()))
                .build()
        )
        .getId();
  }
}
