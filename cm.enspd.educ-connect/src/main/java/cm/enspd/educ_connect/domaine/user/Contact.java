package cm.enspd.educ_connect.domaine.user;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Contact {

  @ElementCollection
  @CollectionTable(
      name = "t_phone_number",
      joinColumns =
          @JoinColumn(
              name = "c_student",
              referencedColumnName = "c_id",
              nullable = false,
              table = "c_student"))
  @Column(name = "c_phone_number")
  @Convert(converter = PhoneNumberConverter.class)
  @Builder.Default
  private List<PhoneNumber> phoneNumbers = new ArrayList<>();

  @Column(name = "c_whatsapp_phone_number")
  @Convert(converter = PhoneNumberConverter.class)
  private PhoneNumber whatsappPhoneNumber;
}
