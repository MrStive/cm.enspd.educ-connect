package cm.enspd.educ_connect.service.mapper;

import cm.enspd.educ_connect.domaine.academictraining.AcademicTrainingFetcher;
import cm.enspd.educ_connect.domaine.academictraining.AcademicTrainingId;
import cm.enspd.educ_connect.domaine.level.Level;
import cm.enspd.educ_connect.domaine.level.LevelData;
import cm.enspd.educ_connect.domaine.level.LevelId;
import cm.enspd.educ_connect.dto.CreateLevel;
import cm.enspd.educ_connect.dto.LevelDTO;
import java.util.UUID;
import org.mapstruct.BeanMapping;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(
    componentModel = "spring",
    injectionStrategy = InjectionStrategy.CONSTRUCTOR,
    uses = {AcademicTrainingMapper.class})
public abstract class LevelMapper {

  @Autowired protected AcademicTrainingFetcher academicTrainingFetcher;
  @Autowired protected AcademicTrainingMapper academicTrainingMapper;

  @Mapping(source = "id.value", target = "id")
  @Mapping(source = "name", target = "name")
  @Mapping(
      target = "academicTraining",
      expression =
          "java(academicTrainingMapper.toDto(academicTrainingFetcher.findById(level.getAcademicTrainingId()).orElse(null)))")
  public abstract LevelDTO mapToDto(Level level);

  @BeanMapping(ignoreByDefault = true)
  @Mapping(target = "name")
  public abstract LevelData mapToLevelData(CreateLevel createLevel);

  public UUID toUUID(LevelId id) {
    return id != null ? UUID.fromString(id.getValue()) : null;
  }

  public LevelId toLevelId(UUID uuid) {
    return uuid != null ? new LevelId(uuid.toString()) : null;
  }

  public AcademicTrainingId toAcademicTrainingId(UUID uuid) {
    return uuid != null ? new AcademicTrainingId(uuid.toString()) : null;
  }
}
