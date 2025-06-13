package cm.enspd.educ_connect.domaine;

import java.io.Serializable;

public interface Entity<T extends Serializable> {
  T getId();

  void setId(T id);

  boolean isDeleted();

  void markAsDeleted();

  void markAsNotDeleted();
}
