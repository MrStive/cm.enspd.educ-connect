package cm.enspd.educ_connect.domaine.program;

import lombok.Builder;

@Builder
public record ProgramData(
    String id,           // UUID sous forme de chaîne
    String name,         // Nom du programme
    String description,  // Description textuelle
    String departmentId, // Id du département associé
    String levelId       // Id du niveau (grade level) associé
) {}
