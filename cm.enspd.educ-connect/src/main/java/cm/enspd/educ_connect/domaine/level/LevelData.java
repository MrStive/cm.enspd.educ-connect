package cm.enspd.educ_connect.domaine.level;

import lombok.Builder;

@Builder
public record LevelData(
    String id,           // UUID sous forme de chaîne
    String name,         // Nom du niveau (ex: "Licence 1", "Master 2")
    String trainingType  // Type de formation (ex: "ALTERNANCE", "INITIAL")
) {}
