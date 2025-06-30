package cm.enspd.educ_connect.service;

import cm.enspd.educ_connect.domaine.academictraining.AcademicTrainingFetcher;
import cm.enspd.educ_connect.domaine.level.LevelData;
import cm.enspd.educ_connect.domaine.level.LevelFactory;
import cm.enspd.educ_connect.domaine.level.LevelFetcher;
import cm.enspd.educ_connect.dto.CreateLevel;
import cm.enspd.educ_connect.dto.LevelDTO;
import cm.enspd.educ_connect.service.mapper.LevelMapper;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class LevelService {
  private final LevelFactory levelFactory;
  private final LevelMapper levelMapper;
  private final LevelFetcher levelFetcher;
  @Transactional
  public UUID createLevel(CreateLevel createLevel) {
    LevelData levelData = levelMapper.mapToLevelData(createLevel);
    return levelFactory.create(levelData).toUUID();
  }

  @Transactional(readOnly = true)
  public List<LevelDTO> geAllLevels() {
    return levelFetcher.findAllLevels().stream().map(levelMapper::mapToDto).toList();
  }
}
