package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeManager {
  public String addEmployee(Employee E )throws Exception
  {
    SessionFactory SF =new Configuration().configure().buildSessionFactory();
    Session S =SF.openSession();
    S.getTransaction().begin();
    S.persist(E); //INSERT
    S.getTransaction().commit();
    S.close();
    SF.close();
    return"Employee data has been added";
  }
  public String addRegularEmployee(RegularEmployee R)throws Exception
  {
    SessionFactory SF =new Configuration().configure().buildSessionFactory();
    Session S =SF.openSession();
    S.getTransaction().begin();
    S.persist(R);
    S.getTransaction().commit();
    S.close();
    SF.close();
    return"Regular  Employee data has been added";
  }

public String addContractEmployee(ContractEmployee C)throws Exception
{
  SessionFactory SF =new Configuration().configure().buildSessionFactory();
  Session S =SF.openSession();
  S.getTransaction().begin();
  S.persist(C);
  S.getTransaction().commit();
  S.close();
  SF.close();
  return"Contract  Employee data has been added";
}

}