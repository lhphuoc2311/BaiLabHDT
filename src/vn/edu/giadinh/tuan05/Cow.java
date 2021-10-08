/*
*  created date: Oct 07, 2021
*  author: cgm
*/
package vn.edu.giadinh.tuan05;


public class Cow {

    //attribute
    double weight;//cân nặng
    int age;//tuổi

    //method
    

    //phương thức tạo đâu?????
    //không có
    
    //hàm tạo mặc định
    Cow()
    {
        //thiết lập thông tin khởi tạo ban đầu cho bò
        age = 1;// tuổi trong bụng
    }

    //method - function tạo -constructor có tham số
    Cow(double w){
        weight =  w; //truyền đối số
    }

    //constructor nhiều tham số
    Cow(double w, int a){
        weight = w;
        age = a;
    }

    void moo(){
        System.out.println("Be be ...");
    }

    
}
