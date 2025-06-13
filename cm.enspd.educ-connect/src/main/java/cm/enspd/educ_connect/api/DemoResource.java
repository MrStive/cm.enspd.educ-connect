package cm.enspd.educ_connect.api;

import cm.enspd.educ_connect.dto.DemoDTO;
import cm.enspd.educ_connect.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class DemoResource implements DemoApi {
  private final DemoService demoService;

  @Override
  public ResponseEntity<List<DemoDTO>> fetchAllDemo() {
    return ResponseEntity.ok(demoService.fetchAllDemos());
  }

  @Override
  public ResponseEntity<UUID> createDemo(DemoDTO demoDTO) {
    UUID createdDemoId = demoService.createDemo(demoDTO);
    return ResponseEntity.status(HttpStatus.CREATED).body(createdDemoId);
  }
}
