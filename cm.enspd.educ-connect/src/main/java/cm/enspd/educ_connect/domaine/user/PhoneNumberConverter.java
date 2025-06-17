package cm.enspd.educ_connect.domaine.user;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.apache.commons.lang3.StringUtils;
import org.apache.coyote.BadRequestException;

@Converter(autoApply = true)
public class PhoneNumberConverter implements AttributeConverter<PhoneNumber, String> {

  @Override
  public String convertToDatabaseColumn(PhoneNumber attribute) {
    if (attribute == null) {
      return null;
    }
    return attribute.getCountryCode() + ";" + attribute.getNumber();
  }

  @Override
  public PhoneNumber convertToEntityAttribute(String dbData) {
    if (StringUtils.isEmpty(dbData)) {
      return null;
    }
    String[] split = dbData.split(";");
    if (split.length != 2) {
      return null;
    }
    try {
      return new PhoneNumber(split[0], split[1]);
    } catch (BadRequestException e) {
      throw new RuntimeException(e);
    }
  }
}
