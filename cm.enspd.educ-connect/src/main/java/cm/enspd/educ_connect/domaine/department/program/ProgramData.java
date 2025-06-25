package cm.enspd.educ_connect.domaine.department.program;

import lombok.Builder;

@Builder
public record ProgramData(
    String id,           
    String name,         
    String description,  
    String departmentId, 
    String levelId       
) {}
