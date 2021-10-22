/*
*  created date: Oct 07, 2021
*  author: cgm
*/
package vn.edu.giadinh.tuan05;


public class Cow {

    //attribute
    double weight;//cân nặng
    int age;//tuổi

    //hàm tạo mặc định
    Cow(){
        weight = 11.2;
    }
    //constructor có tham số
    Cow(double w){
        weight = w;
    }
   
    void moo(int mooNumber){
        int bienCucBo = 5;

        System.out.println(bienCucBo);
        System.out.println("Be be ...");
    }//kết thúc
}
