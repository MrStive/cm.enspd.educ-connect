package cm.enspd.educ_connect.domaine;

import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.MappedSuperclass;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@NoArgsConstructor
@SuperBuilder
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class EducConnectEntityBase<T extends Serializable> extends EntityAdapter<T>
    implements EducConnectEntity<T> {}
