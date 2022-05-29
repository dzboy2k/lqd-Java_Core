package business;

import entity.Employee;
import entity.Staff;
import entity.Teacher;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeManagement {

  // store all staff/teacher
  private ArrayList<Employee> listE;

  public EmployeeManagement() {
    listE = new ArrayList<>();
  }

  public void addEmployee(Employee emp) {
    listE.add(emp);
  }

  // search by staff/teacher's name
  public ArrayList<Employee> searchByName(String name) {
    // store all matching staff or teacher
    ArrayList<Employee> empFound = new ArrayList<>();

    // check null and empty
    if (name == null || name.trim() == "") {
      return empFound;
    }

    // duyet tat ca cac phan tu mang de so sanh
    // su dung method contains() de kiem tra su ton tai cua 1 chuoi trong 1 chuoi
    // khac
    for (Employee employee : listE) {
      if (employee.getFullName().toUpperCase().contains(name.toUpperCase())) {
        empFound.add(employee);
      }
    }

    // your code
    return empFound;
  }

  // search by staff/teacher's department/faculty
  public ArrayList<Employee> searchByDept(String dept) {
    ArrayList<Employee> empFound = new ArrayList<>();

    // duyet tat ca cac phan tu mang de so sanh
    Staff s = null;
    Teacher t = null;
    String name = null;

    for (Employee employee : listE) {

      if (employee instanceof Staff) {
        s = (Staff) employee;

        // lay ve phong ban cua Staff
        name = s.getDepartment();
      } else if (employee instanceof Teacher) {
        t = (Teacher) employee;

        // lay ve khoa cua giang vien
        name = t.getFaculty();
      }

      //Check dept name
      if (name.toUpperCase().contains(dept.toUpperCase())) {
        empFound.add(employee);
      }
    }

    return empFound;
  }

  public ArrayList<Employee> listAll() {

    // sort the list of staff/teacher before return
    Collections.sort(listE);
    return listE;
  }

}
