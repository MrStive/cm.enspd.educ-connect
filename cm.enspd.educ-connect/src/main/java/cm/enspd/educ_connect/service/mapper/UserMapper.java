package cm.enspd.educ_connect.service.mapper;

import cm.enspd.educ_connect.domaine.user.Contact;
import cm.enspd.educ_connect.domaine.user.PhoneNumber;
import cm.enspd.educ_connect.domaine.user.User;
import cm.enspd.educ_connect.domaine.user.UserData;
import cm.enspd.educ_connect.dto.ContactDTO;
import cm.enspd.educ_connect.dto.PhoneNumberDTO;
import cm.enspd.educ_connect.dto.UserDTO;
import java.util.Optional;
import org.apache.coyote.BadRequestException;
import org.mapstruct.BeanMapping;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface UserMapper {
  @BeanMapping(ignoreByDefault = true)
  @Mapping(target = "birthdate")
  @Mapping(target = "email")
  @Mapping(target = "level")
  @Mapping(target = "firstName", source = "firstname")
  @Mapping(target = "lastName", source = "lastname")
  @Mapping(target = "training")
  @Mapping(target = "password")
  @Mapping(target = "username")
  @Mapping(target = "contact")
  UserData mapToUserData(UserDTO userDTO);

  @BeanMapping(ignoreByDefault = true)
  @Mapping(target = "whatsappPhoneNumber", source = "whatsappNumber")
  @Mapping(target = "phoneNumbers", source = "phoneNumbers")
  Contact mapToContactDTO(ContactDTO value);

  default PhoneNumber mapToPhoneNumber(PhoneNumberDTO value) {
    return Optional.ofNullable(value)
        .map(
            phone -> {
              try {
                return new PhoneNumber(phone.getCountryCode(), phone.getNumber());
              } catch (BadRequestException e) {
                throw new RuntimeException(e);
              }
            })
        .orElse(null);
  }
  @BeanMapping(ignoreByDefault = true)
  @Mapping(target = "id", source = "id.value")
  @Mapping(target = "email")
  @Mapping(target = "firstname", source = "firstName")
  @Mapping(target = "firstname", source = "firstName")
  @Mapping(target = "lastname", source = "lastName")
  UserDTO mapToUserDTO(User user);

  default PhoneNumberDTO mapToPhoneNumber(PhoneNumber value) {
    return Optional.ofNullable(value)
            .map(
                    phone -> new PhoneNumberDTO().number(phone.getNumber()).countryCode(phone.getCountryCode()))
            .orElse(null);
  }

}
