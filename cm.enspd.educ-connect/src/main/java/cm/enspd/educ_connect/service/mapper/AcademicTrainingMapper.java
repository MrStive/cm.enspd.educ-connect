package cm.enspd.educ_connect.service.mapper;

import cm.enspd.educ_connect.domaine.academictraining.AcademicTraining;
import cm.enspd.educ_connect.domaine.academictraining.AcademicTrainingData;
import cm.enspd.educ_connect.domaine.academictraining.AcademicTrainingId;
import cm.enspd.educ_connect.dto.AcademicTrainingDTO;
import cm.enspd.educ_connect.dto.CreateAcademicTraining;
import java.util.UUID;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AcademicTrainingMapper {

  AcademicTrainingDTO toDto(AcademicTraining academicTraining);

  AcademicTrainingData toData(CreateAcademicTraining createAcademicTraining);

  default UUID toUUID(AcademicTrainingId id) {
    return id != null ? UUID.fromString(id.getValue()) : null;
  }

  default AcademicTrainingId toAcademicTrainingId(UUID uuid) {
    return uuid != null ? new AcademicTrainingId(uuid.toString()) : null;
  }
}
