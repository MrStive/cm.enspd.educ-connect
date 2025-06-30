package cm.enspd.educ_connect.service.mapper;

import cm.enspd.educ_connect.domaine.level.LevelData;
import cm.enspd.educ_connect.dto.LevelDTO;
import org.mapstruct.BeanMapping;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface LevelMapper {
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "name")
    LevelData mapToLevelData(LevelDTO levelDTO);
}
