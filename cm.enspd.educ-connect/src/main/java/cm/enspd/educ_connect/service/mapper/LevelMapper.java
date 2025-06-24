package cm.enspd.educ_connect.service.mapper;

import cm.enspd.educ_connect.domaine.LevelData;
import cm.enspd.educ_connect.dto.LevelDTO;
import org.mapstruct.BeanMapping;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface LevelMapper {
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id")
    @Mapping(target = "name")
    @Mapping(target = "trainingType")
    LevelData mapToLevelData(LevelDTO levelDTO);
}
