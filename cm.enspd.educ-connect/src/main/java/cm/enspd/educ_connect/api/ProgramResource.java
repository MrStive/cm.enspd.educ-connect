package cm.enspd.educ_connect.api;

import cm.enspd.educ_connect.dto.ProgramDTO;
import cm.enspd.educ_connect.service.ProgramService;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProgramResource implements ProgramApi {
    private final ProgramService programService;

    @Override
    public ResponseEntity<UUID> registerProgram(ProgramDTO programDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(programService.createProgram(programDTO));
    }
}
