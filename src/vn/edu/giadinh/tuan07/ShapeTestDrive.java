/*
*  created date: Oct 21, 2021
*  author: cgm
*/
package vn.edu.giadinh.tuan07;

public class ShapeTestDrive {

    public static void main(String[] args) {

        Square square = new Square("hinhVuong.aif");

        Circle circle = new Circle("hinhTron.aif");

        circle.rotate();
        circle.playSound();

        Amoeba amoeba = new Amoeba("amobea.hif", 5, 10);
        amoeba.rotate();
        amoeba.playSound();

    }
    
}
