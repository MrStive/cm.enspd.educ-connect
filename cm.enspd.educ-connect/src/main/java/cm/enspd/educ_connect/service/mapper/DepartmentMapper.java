package cm.enspd.educ_connect.service.mapper;

import cm.enspd.educ_connect.domaine.department.DepartmentData;
import cm.enspd.educ_connect.dto.DepartmentDTO;
import org.mapstruct.BeanMapping;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface DepartmentMapper {
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "name")
    @Mapping(target = "description")
    DepartmentData mapToDepartmentData(DepartmentDTO departmentDTO);
}
