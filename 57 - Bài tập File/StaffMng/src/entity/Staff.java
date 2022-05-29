package entity;

public class Staff extends Employee {

  private String department; // Ten phong ban
  private float noOfWorkingDay; // so ngay lam viec
  private EPosition position; // chuc vu: truong phong/pho phong/nhan vien

  public Staff() {

  }

  @Override
  public float getSalary() {
    float sal;
    sal = this.getSalaryRatio() * 730 + this.getAllowance() + this.noOfWorkingDay * 30;
    return sal;
  }

  @Override
  public String toString() {
    return this.getFullName() + ", " + this.getDepartment() + ", " + this.getPosition() + ", "
            + this.getSalaryRatio() + ", " + this.getAllowance() + ", " + this.getNoOfWorkingDay() + ", "
            + this.getSalary();

  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public float getNoOfWorkingDay() {
    return noOfWorkingDay;
  }

  public void setNoOfWorkingDay(float noOfWorkingDay) {
    this.noOfWorkingDay = noOfWorkingDay;
  }

  public EPosition getPosition() {
    return position;
  }

  public void setPosition(EPosition position) {
    this.position = position;
  }

}
