/*
*  created date: Nov 04, 2021
*  author: cgm
*/
package vn.edu.giadinh.tuan09;

import java.util.ArrayList;

import vn.edu.giadinh.tuan08.Animal;
import vn.edu.giadinh.tuan08.Dog;
import vn.edu.giadinh.tuan08.Hippo;

public class PolymorphismTestDrive {

    public static void main(String[] args) {


        ArrayList<Animal> list;
        list = new ArrayList<>();
        Dog dog = new Dog();
        dog.setName("Ki ki ");
        list.add(dog);


        Hippo hippo = new Hippo();
        hippo.setName("Hippi");
        list.add(hippo);

        Duck duck = new Duck();
        duck.setName("Do nan ...");
        list.add(duck);



        for (Animal animal : list) {
            //cùng 1 message thông điệp
            //ứng với mỗi động vật cụ thể 
            //có hành vi thể hiê
            animal.introduce();
            
        }


    }
    
}
