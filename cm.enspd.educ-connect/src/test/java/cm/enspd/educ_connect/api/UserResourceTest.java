package cm.enspd.educ_connect.api;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import cm.enspd.educ_connect.dto.ContactDTO;
import cm.enspd.educ_connect.dto.UserDTO;
import cm.enspd.educ_connect.service.UserService;
import java.time.LocalDate;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;

@ExtendWith(MockitoExtension.class)
class UserResourceTest {

  @Mock private UserService userService;

  @Test
  void createDemoTest() {
    // Given
    UUID expectedId = UUID.randomUUID();
    UserDTO userDTO =
        new UserDTO()
            .contact(new ContactDTO())
            .birthdate(LocalDate.now().withDayOfYear(5))
            .email("educ.connect@gmail.com")
            .password("1234")
            .level(4L);
    when(userService.createStudent(any(UserDTO.class))).thenReturn(expectedId);
    // When
    // spotless:off
        UUID createdId =
                given()
                        .standaloneSetup(new UserResource(userService))
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .body(userDTO)
                        .when()
                        .post("/register")
                        .then()
                        .statusCode(201)
                        .extract().body().as(UUID.class);
        // spotless:on
    // Then
    assertThat(createdId).isEqualTo(expectedId);
  }
}
