package cm.enspd.educ_connect.domaine.level;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LevelFactoryImpl implements LevelFactory {

  private final LevelRepository levelRepository;

  @Override
  public LevelId createLevel(LevelData data) {
    return levelRepository
        .save(
            GradeLevel.builder()
                .name(new LevelName(data.name()))
                .trainingType(data.trainingType())
                .build()
        )
        .getId();
  }
}
