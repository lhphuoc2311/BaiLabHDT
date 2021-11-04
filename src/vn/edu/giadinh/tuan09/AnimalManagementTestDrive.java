/*
*  created date: Nov 04, 2021
*  author: cgm
*/
package vn.edu.giadinh.tuan09;

import vn.edu.giadinh.tuan08.Dog;
import vn.edu.giadinh.tuan08.Hippo;

public class AnimalManagementTestDrive {

    

    public static void main(String[] args) {
        AnimalManagement animalManagement = new AnimalManagement();
        Dog dog = new Dog();
        dog.setName("Ty"); 

        Hippo hippo = new Hippo();
        hippo.setName("hippi");

        animalManagement.them(dog);
        animalManagement.them(hippo);

        Dog chotimDuoc = (Dog)animalManagement.timKiemDogTheoTen("Teo");

        if(chotimDuoc == null){
            System.out.println("khoong tim thay ....!");
        }else{

            System.out.println("Ten cua cho tim duoc: " + chotimDuoc.getName());
        }
        
    }
    
}
