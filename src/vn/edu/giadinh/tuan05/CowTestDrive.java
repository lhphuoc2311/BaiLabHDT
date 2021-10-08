/*
*  created date: Oct 07, 2021
*  author: cgm
*/
package vn.edu.giadinh.tuan05;

public class CowTestDrive {
    public static void main(String[] args) {
        
        Cow cow;

        cow = new Cow();//constructor do developers tạo ra

        cow = new Cow(3.0);

        Cow cow2 = new Cow(11.5);

        //xuất

        cow = new Cow(9.5, 1);

        System.out.println("cân nặng " + cow.weight);
        System.out.println("tuổi " + cow.age);

        //xuất
        //cow2.age;
        

    }
    
}
