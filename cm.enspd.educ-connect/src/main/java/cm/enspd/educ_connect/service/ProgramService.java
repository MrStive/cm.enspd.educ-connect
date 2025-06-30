package cm.enspd.educ_connect.service;

import cm.enspd.educ_connect.domaine.department.program.ProgramFactory;
import cm.enspd.educ_connect.dto.ProgramDTO;
import cm.enspd.educ_connect.service.mapper.ProgramMapper;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProgramService {
    private final ProgramFactory programFactory;
    private final ProgramMapper programMapper;

    @Transactional
    public UUID createProgram(ProgramDTO programDTO) {
        return programFactory.createProgram(programMapper.mapToProgramData(programDTO)).toUUID();
    }
}
