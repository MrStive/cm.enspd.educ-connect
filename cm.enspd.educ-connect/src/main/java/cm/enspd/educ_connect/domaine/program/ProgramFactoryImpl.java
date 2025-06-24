package cm.enspd.educ_connect.domaine.program;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProgramFactoryImpl implements ProgramFactory {

  private final ProgramRepository programRepository;

  @Override
  public ProgramId createProgram(ProgramData data) {
    return programRepository
        .save(
            Program.builder()
                .name(new ProgramName(data.name()))
                .description(data.description())
                .build()
        )
        .getId();
  }
}
