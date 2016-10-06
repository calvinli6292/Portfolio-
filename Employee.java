
/**
* Write a description of class Employee here.
* Calvin Li
* 3/6/16
*/
public class Employee
{

  private String name;
  private int idNumber;
  private String department;
  private String position;

 
  public Employee(String emp_name, int emp_idNumber, String emp_department, String emp_position) 
  {
     name = emp_name;
     idNumber = emp_idNumber;
     department = emp_department;
     position = emp_position;
  }

  
  public Employee(String emp_name, int emp_idNumber)
  {
     name = emp_name;
     idNumber = emp_idNumber;
     department = "";
     position = "";
  }

  
  public Employee()
  {
     name = "";
     idNumber = 0;
     department = "";
     position = "";
  }

  
  public String getName() {
     return name;
  }

  public void setName(String emp_name) {
     name = emp_name;
  }


  public int getIdNumber() {
     return idNumber;
  }

  
  public void setIdNumber(int emp_idNumber) {
     idNumber = emp_idNumber;
  }

  public String getDepartment() {
     return department;
  }


  public void setDepartment(String emp_department) {
     department = emp_department;
  }

  public String getPosition() {
     return position;
  }

 
  public void setPosition(String emp_position) {
     position = emp_position;
  }

  


}
