package cm.enspd.educ_connect.api;

import cm.enspd.educ_connect.dto.LevelDTO;
import cm.enspd.educ_connect.service.LevelService;
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
    public ResponseEntity<UUID> registerLevel(LevelDTO levelDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(levelService.createLevel(levelDTO));
    }
}
