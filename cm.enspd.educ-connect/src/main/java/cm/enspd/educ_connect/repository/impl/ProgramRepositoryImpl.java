
package cm.enspd.educ_connect.repository.impl;

import cm.enspd.educ_connect.domaine.program.Program;
import cm.enspd.educ_connect.domaine.program.ProgramRepository;
import cm.enspd.educ_connect.repository.ProgramSpringRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProgramRepositoryImpl implements ProgramRepository {
  private final ProgramSpringRepository programSpringRepository;

  @Override
  public Program saveProgram(Program program) {
    return programSpringRepository.save(program);
  }
}
