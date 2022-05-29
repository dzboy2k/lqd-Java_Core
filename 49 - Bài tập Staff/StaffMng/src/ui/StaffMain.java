package ui;

import business.AllowanceCalculator;
import business.EmployeeManagement;
import entity.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main class for UI
 *
 */
public class StaffMain {

  public static void main(String[] args) {
    // create employee management object
    EmployeeManagement empMan = new EmployeeManagement();
    // menu
    Scanner scan = new Scanner(System.in);
    boolean keepRunning = true;
    while (keepRunning) {
      System.out.println("University Staff Management 1.0");
      System.out.println("\t1.Add staff");
      System.out.println("\t2.Search staff by name");
      System.out.println("\t3.Search staff by department/faculty");
      System.out.println("\t4.Display all staff");
      System.out.println("\t5.Exit");
      System.out.print("Select function (1,2,3,4 or 5): ");
      int choice = scan.nextInt();
      switch (choice) {
        case 1:// add staff/teacher
          Employee emp = createNewEmployee();
          float allowance = AllowanceCalculator.calculateAllowance(emp);
          emp.setAllowance(allowance);
          empMan.addEmployee(emp);
          break;
        case 2:// search by name
          System.out.print("\tEnter name to search: ");
          scan = new Scanner(System.in);
          String name = scan.nextLine();
          ArrayList<Employee> foundByName = empMan.searchByName(name);
          display(foundByName);
          break;
        case 3:// search by dept
          System.out.print("\tEnter dept/fac to search: ");
          scan = new Scanner(System.in);
          String dept = scan.nextLine();
          ArrayList<Employee> foundByDept = empMan.searchByDept(dept);
          display(foundByDept);
          break;
        case 4:// display all
          ArrayList<Employee> listE = empMan.listAll();
          display(listE);
          break;
        case 5:// exit
          keepRunning = false;
      }
    }
  }

  // create an employee by inputing it's attribute values from keyboard
  static Employee createNewEmployee() {

    System.out.print("Do you want to create a Staff or a Teacher (enter S for Staff, otherwise for Teacher)?");
    // accept Staff or Teacher details from keyboard
    Scanner scan = new Scanner(System.in);
    String choice = scan.nextLine();
    if (choice.equalsIgnoreCase("s")) {
      Staff s = new Staff();

      //Nhap thong tin nhan vien tu ban phim
      System.out.println("Staff name:");
      String fullname = scan.nextLine();

      System.out.println("Staff department:");
      String department = scan.nextLine();

      System.out.println("Staff position (1=HEAD, 2=VICE HEAD, 3=STAFF) :");
      int position = scan.nextInt();

      System.out.println("No of working day:");
      float noOFWorkingDay = scan.nextFloat();

      System.out.println("Salary radio:");
      float salaryRadio = scan.nextFloat();

      //set thong tin cho nhan vien
      s.setFullName(fullname);
      s.setDepartment(department);
      s.setSalaryRatio(salaryRadio);
      s.setNoOfWorkingDay(noOFWorkingDay);
      if (position == 1) {
        s.setPosition(EPosition.HEAD);
      } else if (position == 2) {
        s.setPosition(EPosition.VICE_HEAD);
      } else if (position == 3) {
        s.setPosition(EPosition.STAFF);
      }

      return s;

    } else {
      Teacher t = new Teacher();

      System.out.println("Teacher name:");
      String fullname = scan.nextLine();

      System.out.println("Teacher faculty:");
      String faculty = scan.nextLine();

      System.out.println("Teacher degree (1=BACHNELOR, 2=MASTER, 3=DOCTOR) :");
      int degree = scan.nextInt();

      System.out.println("Teaching Hours:");
      int teachingHours = scan.nextInt();

      System.out.println("Salary radio:");
      float salaryRadio = scan.nextFloat();

      //set thong tin cho giao vien
      t.setFullName(fullname);
      t.setFaculty(faculty);
      t.setSalaryRatio(salaryRadio);
      t.setTeachingHours(teachingHours);
      if (degree == 1) {
        t.setDegree(EDegree.BACHELOR);
      } else if (degree == 2) {
        t.setDegree(EDegree.MASTER);
      } else if (degree == 3) {
        t.setDegree(EDegree.DOCTOR);
      }

      return t;
    }

  }

  // display a list of employee
  static void display(ArrayList<Employee> listE) {
    System.out.println("Results:");
    System.out.println("Name, Fac/Dept, Deg/Pos, Sal Ratio, Allowance, T.Hours/W.Days, Salary");
    for (Employee e : listE) {
      System.out.println(e);
    }
  }

}
