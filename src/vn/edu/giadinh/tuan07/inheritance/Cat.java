/*
*  created date: Oct 21, 2021
*  author: cgm
*/
package vn.edu.giadinh.tuan07.inheritance;

public class Cat extends Animal{


    @Override
    protected void makeNoise() {
        // TODO Auto-generated method stub
        super.makeNoise();
    }

    @Override
    protected void eat() {
        // TODO Auto-generated method stub
        super.eat();
    }

    void chaseButterfly(){
        System.out.println("Đuổi bướm ...");
    }
    
}
