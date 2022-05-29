package business;

import entity.*;
import exception.MyValidateException;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeManagement {

  public static final String FILE_NAME = "src/data.txt";
  public static final String NEW_LINE = "\n";
  public static final String EMP_TEACHER = "Teacher";
  public static final String EMP_STAFF = "Staff";

  // store all staff/teacher
  private ArrayList<Employee> listE;

  public EmployeeManagement() throws IOException, Exception {
    listE = new ArrayList<>();

    //load data tu data.txt to listE
    this.load(FILE_NAME);
  }

  public void addEmployee(Employee emp) throws IOException, Exception {

    //save to file
    save(emp, FILE_NAME);

    //add to list
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

  public ArrayList<Employee> getListE() {
    return listE;
  }

  /**
   * load data from data.txt
   * @param fileName
   */
  public void load(String fileName) throws MyValidateException, Exception {

    BufferedReader br = null;
    FileReader fr = null;
    String sCurrentLine = null;

    try {

      fr = new FileReader(fileName);
      br = new BufferedReader(fr);

      String[] words ;
      while ((sCurrentLine = br.readLine()) != null) {
        words = sCurrentLine.split(",");//tach chuoi dua tren ky tu ","

        //Tai sao lai la 8 ???
        if (words.length != 8) {
          throw new MyValidateException("Wrong data format at line :" + sCurrentLine);
        }

        if (EMP_STAFF.equals(words[0].trim())) {
          //Tao staff
          ////format Staff :staff,fullname,department,position,salaryRatio,allowance,noOfWorkingDay,salary
          Staff s = new Staff();
          s.setFullName(words[1].trim());
          s.setDepartment(words[2].trim());
          s.setPosition(EPosition.valueOf(words[3].trim()));
          s.setSalaryRatio(Float.parseFloat(words[4].trim()));
          s.setAllowance(Float.parseFloat(words[5].trim()));
          s.setNoOfWorkingDay(Float.parseFloat(words[6].trim()));
          s.setSalary(Float.parseFloat(words[7].trim()));
          //add to list
          this.getListE().add(s);
        } else if (EMP_TEACHER.equals(words[0].trim())) {
          //Tao teacher
          ////format Teacher :Teacher,fullname,faculty,degree,salaryRatio,allowance,teachingHours,salary
          Teacher t = new Teacher();
          t.setFullName(words[1].trim());
          t.setFaculty(words[2].trim());
          t.setDegree(EDegree.valueOf(words[3].trim()));
          t.setSalaryRatio(Float.parseFloat(words[4].trim()));
          t.setAllowance(Float.parseFloat(words[5].trim()));
          t.setTeachingHours(Integer.parseInt(words[6].trim()));
          t.setSalary(Float.parseFloat(words[7].trim()));
          //add to list
          this.getListE().add(t);
        }
      }
    } catch (IOException e) {
      throw new Exception("Can't read data.txt, please check soon!");
    } catch (NumberFormatException e) {
      throw new MyValidateException("Wrong input data, can't convert to number from character input at line : " + sCurrentLine);
    } finally {

      // close
      if (br != null)
        br.close();

      if (fr != null)
        fr.close();
    }
  }

  /**
   * save employee(staff/tearch) to data.txt
   * @param emp
   * @param fileName
   */
  public void save(Employee emp, String fileName) throws IOException, Exception {

    //format ghi noi dung ra file nhu sau : Staff :
    //staff,fullname,department,position,salaryRatio,allowance,noOfWorkingDay,salary
    //Teacher,fullname,faculty,degree,salaryRatio,allowance,teachingHours,salary

    BufferedWriter bw = null;
    FileWriter fw = null;

    try {

      String data = emp.toString();

      if (emp instanceof Staff) {
        data = EMP_STAFF + ", " + data;
      } else if (emp instanceof Teacher) {
        data = EMP_TEACHER + ", " + data;
      }

      //check data before add new line
      if (listE.size() > 0) {
        data = NEW_LINE + "" + data;
      }

      File file = new File(fileName);

      // true = append file
      fw = new FileWriter(file.getAbsoluteFile(), true);
      bw = new BufferedWriter(fw);

      //write data
      bw.write(data);

    } catch (Exception e) {
      throw new Exception("Can't save data to data.txt, please check soon!");
    } finally {

      if (bw != null)
        bw.close();

      if (fw != null)
        fw.close();
    }
  }

}
