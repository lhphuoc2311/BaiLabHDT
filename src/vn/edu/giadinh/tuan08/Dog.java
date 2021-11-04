/*
*  created date: Oct 21, 2021
*  author: cgm
*/
package vn.edu.giadinh.tuan08;
public class Dog extends Canine{

    @Override
    public void makeNoise() {
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
