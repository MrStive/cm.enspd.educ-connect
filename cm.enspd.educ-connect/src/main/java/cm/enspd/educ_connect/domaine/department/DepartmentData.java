package cm.enspd.educ_connect.domaine.department;

import lombok.Builder;

@Builder
public record DepartmentData(
    String id,           // UUID sous forme de chaîne
    String name,         // Nom du département (ex: "Informatique")
    String description   // Description du département
) {}
