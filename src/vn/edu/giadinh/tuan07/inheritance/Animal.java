/*
*  created date: Oct 21, 2021
*  author: cgm
*/
package vn.edu.giadinh.tuan07.inheritance;

public class Animal {

    protected String sound;// tên file âm thanh dành cho loại khác nhau

    protected String piture;

    protected String food;

    //location

    //boundaries

    protected void makeNoise(){
        //code để xử lý phát ra tiếng kêu
        //System.out.println("Phát ra tiếng kêu " + sound);
        System.out.println("Hmm...");
    }

    protected void eat(){
        System.out.println("Ăn ...");
    }


    protected void sleep(){
        System.out.println("Ngủ ...");
    }

    protected void roam(){
        System.out.println("Đi lang thang...");
    }
    
}
