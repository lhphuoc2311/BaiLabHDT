/*
*  created date: Nov 04, 2021
*  author: cgm
*/
package vn.edu.giadinh.tuan09;

import java.util.ArrayList;

import vn.edu.giadinh.tuan08.Animal;
import vn.edu.giadinh.tuan08.Dog;

public class AnimalManagement {

    private ArrayList<Animal> list;

    public AnimalManagement(){
        list = new ArrayList<>();
        
    }

    public void them(Animal animal){
        list.add(animal);
    }

    public Animal timKiemDogTheoTen(String name){
        Dog d = null;

        for (Animal animal : list) {

            if(animal instanceof Dog){

                Dog dog = (Dog)animal;
                if(dog.getName().equalsIgnoreCase(name)){
                    d = dog;
                }

            }
            
        }


        return d;

    }
    
}
