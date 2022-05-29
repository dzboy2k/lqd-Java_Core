package business;

import entity.*;

/**
 * class nay dung de tinh phu cap cho tung doi tuong.
 *
 */
public class AllowanceCalculator {

  public static float calculateAllowance(Employee emp){
    float allowance=0;

    if(emp instanceof Staff){
      Staff s = (Staff) emp;
      //head/trưởng phòng 2000
      if(s.getPosition()== EPosition.HEAD) {
        allowance = 2000;
      } else if (s.getPosition()==EPosition.VICE_HEAD) {
        //vice-head/phó phòng 1000
        allowance = 1000;
      } else if (s.getPosition()==EPosition.STAFF) {
        //staff/nhân viên 500
        allowance = 500;
      }

    } else if (emp instanceof Teacher){
      Teacher t = (Teacher) emp;
      if(t.getDegree()== EDegree.DOCTOR) {
        //Tien si
        allowance = 1000;
      } else if(t.getDegree()== EDegree.MASTER) {
        //Thac si
        allowance = 500;
      } else if(t.getDegree()== EDegree.BACHELOR) {
        //Cu nhan
        allowance = 300;
      }
    }
    return allowance;
  }
}
