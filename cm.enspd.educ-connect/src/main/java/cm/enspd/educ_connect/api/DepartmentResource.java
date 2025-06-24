package cm.enspd.educ_connect.api;

import cm.enspd.educ_connect.dto.DepartmentDTO;
import cm.enspd.educ_connect.service.DepartmentService;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DepartmentResource implements DepartmentApi {
    private final DepartmentService departmentService;

    @Override
    public ResponseEntity<UUID> registerDepartment(DepartmentDTO departmentDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(departmentService.createDepartment(departmentDTO));
    }
}
