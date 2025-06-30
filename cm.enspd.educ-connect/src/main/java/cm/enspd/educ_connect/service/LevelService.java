package cm.enspd.educ_connect.service;

import cm.enspd.educ_connect.domaine.level.LevelFactory;
import cm.enspd.educ_connect.dto.LevelDTO;
import cm.enspd.educ_connect.service.mapper.LevelMapper;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class LevelService {
    private final LevelFactory levelFactory;
    private final LevelMapper levelMapper;

    @Transactional
    public UUID createLevel(LevelDTO levelDTO) {
        return levelFactory.createLevel(levelMapper.mapToLevelData(levelDTO)).toUUID();
    }
}
