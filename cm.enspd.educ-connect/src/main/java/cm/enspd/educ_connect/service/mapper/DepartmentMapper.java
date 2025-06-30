package cm.enspd.educ_connect.service.mapper;

import cm.enspd.educ_connect.domaine.department.Department;
import cm.enspd.educ_connect.domaine.department.DepartmentData;
import cm.enspd.educ_connect.domaine.department.program.speciality.Speciality;
import cm.enspd.educ_connect.domaine.department.program.speciality.SpecialityData;
import cm.enspd.educ_connect.dto.CreateDepartment;
import cm.enspd.educ_connect.dto.CreateSpeciality;
import cm.enspd.educ_connect.dto.DepartmentDTO;
import cm.enspd.educ_connect.dto.SpecialityDTO;
import org.mapstruct.BeanMapping;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
    componentModel = "spring",
    injectionStrategy = InjectionStrategy.CONSTRUCTOR,
    uses = {ProgramMapper.class})
public interface DepartmentMapper {
  @BeanMapping(ignoreByDefault = true)
  @Mapping(target = "name")
  @Mapping(target = "description")
  DepartmentData mapToDepartmentData(DepartmentDTO departmentDTO);

  @BeanMapping(ignoreByDefault = true)
  @Mapping(target = "name")
  @Mapping(target = "description")
  DepartmentData mapToDepartmentData(CreateDepartment departmentDTO);

  @BeanMapping(ignoreByDefault = true)
  @Mapping(target = "id", source = "id.value")
  @Mapping(target = "name", source = "name.value")
  @Mapping(target = "description")
  DepartmentDTO mapToDTO(Department value);

  @BeanMapping(ignoreByDefault = true)
  @Mapping(target = "name")
  @Mapping(target = "description")
  SpecialityData mapToSpecialityData(CreateSpeciality createSpeciality);

  @BeanMapping(ignoreByDefault = true)
  @Mapping(target = "id", source = "id.value")
  @Mapping(target = "name", source = "name")
  @Mapping(target = "description")
  @Mapping(target = "program")
  SpecialityDTO mapToDTO(Speciality value);
}
