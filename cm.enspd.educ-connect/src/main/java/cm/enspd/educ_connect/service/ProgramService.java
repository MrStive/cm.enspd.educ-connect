package cm.enspd.educ_connect.service;

import cm.enspd.educ_connect.domaine.department.DepartmentId;
import cm.enspd.educ_connect.domaine.department.program.ProgramFactory;
import cm.enspd.educ_connect.domaine.department.program.ProgramFetcher;
import cm.enspd.educ_connect.dto.CreateProgram;
import cm.enspd.educ_connect.dto.CreateSpeciality;
import cm.enspd.educ_connect.dto.ProgramDTO;
import cm.enspd.educ_connect.dto.SpecialityDTO;
import cm.enspd.educ_connect.service.mapper.ProgramMapper;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProgramService {
  private final ProgramFactory programFactory;
  private final ProgramMapper programMapper;
  private final ProgramFetcher programFetcher;

  @Transactional
  public UUID createProgram(UUID departmentId, CreateProgram createProgram) {
    return programFactory
        .createProgram(departmentId, programMapper.mapToProgramData(createProgram))
        .toUUID();
  }

  @Transactional
  public UUID addNewSpeciality(UUID programId, CreateSpeciality createSpeciality) {
    return programFactory
        .addNewSpeciality(programId, programMapper.mapToSpecialityData(createSpeciality))
        .toUUID();
  }

  @Transactional(readOnly = true)
  public List<ProgramDTO> fetchAllProgramByDepartment(UUID departmentId) {
    return programFetcher.findByDepartmentId(new DepartmentId(departmentId.toString())).stream()
        .map(programMapper::mapToDto)
        .collect(Collectors.toList());
  }

  @Transactional(readOnly = true)
  public List<SpecialityDTO> getSpecialitiesByProgram(UUID programId) {
    return programFetcher.fetchAllSpecialities(programId).stream()
        .map(programMapper::mapToDto)
        .toList();
  }
}
