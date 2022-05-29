package entity;

public abstract class Employee implements Comparable<Employee> {

  private String fullName; // Ten
  private float salaryRatio; // he so luong
  private float allowance; // phu cap

  private float salary;

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public float getSalaryRatio() {
    return salaryRatio;
  }

  public void setSalaryRatio(float salaryRatio) {
    this.salaryRatio = salaryRatio;
  }

  public float getAllowance() {
    return allowance;
  }

  public void setAllowance(float allowance) {
    this.allowance = allowance;
  }

  public abstract float getSalary();

  public void setSalary(float salary) {
    this.salary = salary;
  }

  @Override
  public int compareTo(Employee emp) {
    // so sanh ten de sap xep theo ten
    return this.fullName.compareTo(emp.fullName);
  }
}
