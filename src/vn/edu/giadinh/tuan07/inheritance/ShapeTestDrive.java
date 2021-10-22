/*
*  created date: Oct 21, 2021
*  author: cgm
*/
package vn.edu.giadinh.tuan07.inheritance;

public class ShapeTestDrive {

    
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.rotate();
        circle.playSound();

        Square square = new Square();
        square.rotate();
        square.playSound();

        Amoeba amoeba = new Amoeba("amoeba.hif", 5, 10);
        amoeba.rotate();
        amoeba.playSound();
        
    }
    

    


    
}
