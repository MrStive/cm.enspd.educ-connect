package cm.enspd.educ_connect.service.mapper;

import cm.enspd.educ_connect.domaine.demo.Demo;
import cm.enspd.educ_connect.domaine.demo.DemoData;
import cm.enspd.educ_connect.domaine.demo.DemoName;
import cm.enspd.educ_connect.dto.DemoDTO;
import java.util.Optional;
import org.mapstruct.BeanMapping;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface DemoMapper {
  @BeanMapping(ignoreByDefault = true)
  @Mapping(target = "name")
  @Mapping(target = "id")
  DemoData map(DemoDTO demoDTO);

  @BeanMapping(ignoreByDefault = true)
  @Mapping(target = "id", source = "id.value")
  @Mapping(target = "name")
  DemoDTO map(Demo demo);

  default String map(DemoName value) {
    return Optional.ofNullable(value).map(DemoName::getValue).orElse(null);
  }
}
