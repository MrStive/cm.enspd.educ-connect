package cm.enspd.educ_connect.api;

import cm.enspd.educ_connect.dto.CreateLevel;
import cm.enspd.educ_connect.dto.LevelDTO;
import cm.enspd.educ_connect.service.LevelService;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LevelResource implements LevelApi {
  private final LevelService levelService;

  @Override
  public ResponseEntity<UUID> createNewLevel(CreateLevel createLevel) {
    return ResponseEntity.status(HttpStatus.CREATED).body(levelService.createLevel(createLevel));
  }

  @Override
  public ResponseEntity<List<LevelDTO>> fetchLevels() {
    return ResponseEntity.ok(levelService.geAllLevels());
  }
}
