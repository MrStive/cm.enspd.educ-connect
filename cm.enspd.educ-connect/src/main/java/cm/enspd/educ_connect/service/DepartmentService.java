package cm.enspd.educ_connect.service;

import cm.enspd.educ_connect.domaine.DepartmentFactory;
import cm.enspd.educ_connect.dto.DepartmentDTO;
import cm.enspd.educ_connect.service.mapper.DepartmentMapper;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DepartmentService {
    private final DepartmentFactory departmentFactory;
    private final DepartmentMapper departmentMapper;

    @Transactional
    public UUID createDepartment(DepartmentDTO departmentDTO) {
        return departmentFactory.createDepartment(departmentMapper.mapToDepartmentData(departmentDTO)).toUUID();
    }
}
