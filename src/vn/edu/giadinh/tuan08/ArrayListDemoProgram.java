/*
*  created date: Oct 28, 2021
*  author: cgm
*/
package vn.edu.giadinh.tuan08;

import java.util.ArrayList;
import java.util.List;

import vn.edu.giadinh.tuan05.Dog;
import vn.edu.giadinh.tuan07.inheritance.Amoeba;
import vn.edu.giadinh.tuan07.inheritance.Circle;
import vn.edu.giadinh.tuan07.inheritance.Shape;
import vn.edu.giadinh.tuan07.inheritance.Square;


public class ArrayListDemoProgram {

    public static void main(String[] args) {
        List<String> list;

        list = new ArrayList<>();

        list.add("Tý");
        list.add("Tèo");
        list.add("Tửng");

        System.out.println(list);


        ArrayList<String> list5;

        list5 = new ArrayList<>();

        list5.add("Mai");
        list5.add("Trúc");

        System.out.println("số phần tử của list 5" + list5.size());
        System.out.println(list5);

        List<Shape> list2 = new ArrayList<>();

        Circle circle = new Circle();
        Square square = new Square();
        Amoeba amoeba = new Amoeba();

        list2.add(circle);
        list2.add(square);
        list2.add(amoeba);

      /*    for (Shape shape : list2) {
            shape.playSound();
            shape.rotate();
        } */
 

        for(int i = 0; i < list2.size(); i ++){

            Shape shape = list2.get(i);
            shape.playSound();
            shape.rotate();

        }


        List<Animal> list3;

        List<Dog> list4;

    }
    
}
