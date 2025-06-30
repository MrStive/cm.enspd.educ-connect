package cm.enspd.educ_connect.domaine.level;

import lombok.Builder;

@Builder
public record LevelData(
    String id,           
    String name
) {}
