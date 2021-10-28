/*
*  created date: Oct 28, 2021
*  author: cgm
*/
package vn.edu.giadinh.tuan08;

public class Wolf  extends Feline{

    public Wolf(){
        
    }

    @Override
    protected void eat() {
        System.out.println("Ăn kiểu Sói ");
    }

    @Override
    protected void makeNoise() {
        System.out.println("Kêu tiếng Sói .. . hú");
    }

    
    
}
