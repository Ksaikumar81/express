package model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name="type2employee")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)


public class Employee {
  @Id
  @Column(name="eid")
  int eid;
  @Column(name="ename")
  String ename;
  public int getEid() {
    return eid;
  }
  public void setEid(int eid) {
    this.eid = eid;
  }
  public String getEName() {
    return ename;
  }
  public void setEName(String name) {
    this.ename = ename;
  }

}