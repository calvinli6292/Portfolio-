
/**
 * Write a description of class Employee1 here.
 * Calvin Li
 * 3/6/16
 */
public class Employee1
{
    public static void main(String[] args)
  {
    Employee employee_1;
    employee_1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");

    Employee employee_2;
    employee_2 = new Employee("Mark Jones", 39119);

    Employee employee_3;
    employee_3 = new Employee();

    System.out.println("Name \t ID Number \t Department \t Position");

    System.out.println(employee_1.getName() + "\t" + employee_1.getIdNumber() + "\t" + employee_1.getDepartment() + "\t" + employee_1.getPosition());
    System.out.println(employee_2.getName() + "\t" + employee_2.getIdNumber() + "\t" + employee_2.getDepartment() + "\t" + employee_2.getPosition());
    System.out.println(employee_3.getName() + "\t" + employee_3.getIdNumber() + "\t" + employee_3.getDepartment() + "\t" + employee_3.getPosition());

   } 
}
