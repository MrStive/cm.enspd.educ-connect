package cm.enspd.educ_connect.domaine.department;

import lombok.Builder;

@Builder
public record DepartmentData(String id, String name, String description) {}
