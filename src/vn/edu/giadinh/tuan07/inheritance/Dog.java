/*
*  created date: Oct 21, 2021
*  author: cgm
*/
package vn.edu.giadinh.tuan07.inheritance;

public class Dog extends Animal{

    @Override
    protected void makeNoise() {
        System.out.println("Phát ra âm thanh kiểu chó");
    }

    @Override
    protected void eat() {
        System.out.println("Ăn kiểu chó ...");
    }

    void chaseCats(){
        System.out.println("Đuổi mèo ...");
    }
    
}
