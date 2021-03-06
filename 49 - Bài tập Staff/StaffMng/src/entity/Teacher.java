package entity;

import business.AllowanceCalculator;

public class Teacher extends Employee {

  private String faculty;// Ten khoa lam viec
  private EDegree degree; // trinh do (Tien si/thac si/cu nhan)
  private int teachingHours; // So gio giang day

  public Teacher() {
    float allowance = AllowanceCalculator.calculateAllowance((this));
    this.setAllowance(allowance);
  }

  @Override
  public float getSalary() {
    float sal;
    sal = this.getSalaryRatio() * 730 + this.getAllowance() + this.teachingHours * 45;
    return sal;
  }

  @Override
  public String toString() {
    return this.getFullName() + ", " + this.getFaculty() + ", " + this.getDegree() + ", "
            + this.getSalaryRatio() + ", " + this.getAllowance() + ", " + this.getTeachingHours() + ", "
            + this.getSalary();
  }

  public String getFaculty() {
    return faculty;
  }

  public void setFaculty(String faculty) {
    this.faculty = faculty;
  }

  public EDegree getDegree() {
    return degree;
  }

  public void setDegree(EDegree degree) {
    this.degree = degree;
  }

  public int getTeachingHours() {
    return teachingHours;
  }

  public void setTeachingHours(int teachingHours) {
    this.teachingHours = teachingHours;
  }

}
