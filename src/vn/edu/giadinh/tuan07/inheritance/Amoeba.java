/*
*  created date: Oct 21, 2021
*  author: cgm
*/
package vn.edu.giadinh.tuan07.inheritance;

public class Amoeba extends Shape{

    int x;
    int y;

  public  Amoeba(){}

  

    /**
 * @param s
 * @param x
 * @param y
 */
/* public Amoeba(String s, int x, int y) {
    super(s);
    this.x = x;
    this.y = y;
} */



    public Amoeba(String s){
        super(s);
    }

     public Amoeba(String s, int x, int y){
        //super(s);
        this(s);
        this.x = x;
        this.y = y;
        
    } 

  public void rotate(){

        //code xử lý cho các hình xoay 360
        //giống kim đồng hồ
        //1. xác tọa độ x, y
        //2. xoay theo x, y
        System.out.println("Xoay theo tọa độ x = " + x + " và y = " + y);

        this.x = 10;

    }

 public void playSound(){

        //code xử lý file .hif để phát ra thâm thanh
        //của 1 tâm tin .hif

        //khác với code xử lý file .aif

        System.out.println("Phát ra file âm thanh có tên " + getSound());
    }
    
}
