package cm.enspd.educ_connect.domaine.user;

import jakarta.persistence.Column;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;
import org.apache.commons.lang3.StringUtils;
import org.apache.coyote.BadRequestException;

@EqualsAndHashCode
@Getter
@NoArgsConstructor
@FieldNameConstants
public class PhoneNumber {

  private static final String PLUS_SIGN = "+";

  @Column(name = "c_countrycode")
  private String countryCode;

  @Column(name = "c_number")
  private String number;

  public PhoneNumber(String countryCode, String number) throws BadRequestException {
    super();
    if (StringUtils.isEmpty(countryCode)) {
      throw new BadRequestException("Country Code should be set");
    }
    if (!StringUtils.isNumeric(countryCode)) {
      throw new BadRequestException("Country code should be a numberic");
    }
    if (StringUtils.isEmpty(number)) {
      throw new BadRequestException("number should be set");
    }
    if (!StringUtils.isNumeric(number)) {
      throw new BadRequestException("Number should be a numberic");
    }
    this.countryCode = countryCode;
    this.number = number;
  }

  public String getFullNumber() {
    if (StringUtils.isEmpty(countryCode) || StringUtils.isEmpty(number)) {
      return "";
    }
    return new StringBuilder(PLUS_SIGN).append(countryCode).append(number).toString();
  }

  public String getFullNumberWithoutPlusSign() {
    if (StringUtils.isEmpty(countryCode) || StringUtils.isEmpty(number)) {
      return "";
    }
    return countryCode.concat(number);
  }
}
