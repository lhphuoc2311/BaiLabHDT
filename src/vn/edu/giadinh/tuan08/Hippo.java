/*
*  created date: Oct 28, 2021
*  author: cgm
*/
package vn.edu.giadinh.tuan08;


public class Hippo extends Animal{

    public Hippo(){
        
        System.out.println("Making a Hippo");
    }

    public Hippo(String n){
        super(n);
    }


    @Override
    public void makeNoise() {

        if(hunger == 1){
            System.out.println("Kêu tiếng Hippo ...");
        }else if(hunger == 2){
            System.out.println(" Hippo Kêu quạo ....");
        }else{
            System.out.println("Kêu tiếng Hippo ...");
        }
        
        

    }

    @Override
    protected void eat() {
        System.out.println("Ăn kiểu hà mã");
    }

    
    
}
