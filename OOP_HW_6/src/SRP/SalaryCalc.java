package SRP;

public class SalaryCalc {
          public int calculateNetSalary(Employee employee) {
                int tax = (int) (employee.getBaseSalary() * 0.25);// calculate in otherway
                return employee.getBaseSalary() - tax;
          }
}
