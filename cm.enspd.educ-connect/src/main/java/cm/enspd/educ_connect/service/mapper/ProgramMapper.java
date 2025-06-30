package cm.enspd.educ_connect.service.mapper;

import cm.enspd.educ_connect.domaine.department.program.Program;
import cm.enspd.educ_connect.domaine.department.program.ProgramData;
import cm.enspd.educ_connect.domaine.department.program.speciality.Speciality;
import cm.enspd.educ_connect.domaine.department.program.speciality.SpecialityData;
import cm.enspd.educ_connect.dto.CreateProgram;
import cm.enspd.educ_connect.dto.CreateSpeciality;
import cm.enspd.educ_connect.dto.ProgramDTO;
import cm.enspd.educ_connect.dto.SpecialityDTO;
import org.mapstruct.BeanMapping;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
    componentModel = "spring",
    injectionStrategy = InjectionStrategy.CONSTRUCTOR,
    uses = {DepartmentMapper.class})
public interface ProgramMapper {
  @BeanMapping(ignoreByDefault = true)
  @Mapping(target = "name")
  @Mapping(target = "description")
  ProgramData mapToProgramData(CreateProgram createProgram);

  @BeanMapping(ignoreByDefault = true)
  @Mapping(target = "name", source = "name.value")
  @Mapping(target = "id", source = "id.value")
  @Mapping(target = "description")
  @Mapping(target = "department")
  ProgramDTO mapToDto(Program program);

  @BeanMapping(ignoreByDefault = true)
  @Mapping(target = "id", source = "id.value")
  @Mapping(target = "description")
  @Mapping(target = "program")
  SpecialityDTO mapToDto(Speciality value);

  @BeanMapping(ignoreByDefault = true)
  @Mapping(target = "name")
  @Mapping(target = "description")
  SpecialityData mapToSpecialityData(CreateSpeciality createSpeciality);
}
