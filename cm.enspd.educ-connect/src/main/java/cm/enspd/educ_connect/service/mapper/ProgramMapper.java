package cm.enspd.educ_connect.service.mapper;

import cm.enspd.educ_connect.domaine.ProgramData;
import cm.enspd.educ_connect.dto.ProgramDTO;
import org.mapstruct.BeanMapping;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ProgramMapper {
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id")
    @Mapping(target = "name")
    @Mapping(target = "description")
    @Mapping(target = "departmentId")
    @Mapping(target = "levelId")
    ProgramData mapToProgramData(ProgramDTO programDTO);
}
