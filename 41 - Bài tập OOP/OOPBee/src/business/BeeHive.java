package business;

import entity.Bee;
import entity.Drone;
import entity.QueenBee;
import entity.WorkerBee;

import java.util.ArrayList;
import java.util.Random;

/**
 * class dùng để xử lý logic : tạo danh sách bee, attack bee
 */
public class BeeHive {
  private ArrayList<Bee> listBee;

  public void init() {
    //create list of 10 bees of Queen, Drone and Worker types
    //in each bee, type and health attributes are randomly chosen
    this.listBee = new ArrayList<>();

    //add mỗi kiểu Bee một con đầu tiên và add vào list
    this.listBee.add(new QueenBee());
    this.listBee.add(new WorkerBee());
    this.listBee.add(new Drone());

    //tạo random 7 Bee còn lại của 3 kiểu Bee
    // Tạo một số random từ 1 đến 3.
    Random rand = new Random();

    for (int i = 0; i < 7; i++) {
      int r = rand.nextInt(3) + 1;
      if (r == 1) {
        // add Queen bee
        this.listBee.add(new QueenBee());
      } else if (r == 2) {
        // add Worker bee
        this.listBee.add(new WorkerBee());
      } else {
        // add Drone bee
        this.listBee.add(new Drone());
      }
    }
  }

  public ArrayList<Bee> getAllBees() {
    return listBee;
  }

  //attack all bees
  public void attackBees() {

    //lặp toàn bộ danh sách Bee trong mảng để thực hiện damage
    for (int i = 0; i < getAllBees().size(); i++) {
      getAllBees().get(i).damage();
    }
  }
}
