/*
*  crated date: 9/16/2021
*  author: cgm
*/
package vn.edu.giadinh.tuan02;

import java.util.Scanner;

public class ChuongTrinhMenu {

    public static void main(String[] args) {
        System.out.println("============MENU===============");
        System.out.println("1. Giải phương trình bậc 1");
        System.out.println("2. Giải phương trình bậc 1");
        System.out.println("3. Tính tiền điện");
        System.out.println("==========END MENU=============");

        System.out.println("Hãy chọn 1 chức năng:");
        Scanner bienNhap = new Scanner(System.in);
        int giaTriNhap = bienNhap.nextInt();
        switch(giaTriNhap){
            case 1: giaiPTBac1();; break;
            case 2: giaiPTBacII();; break;
            case 3: /**làm cái gì đó */; break;
            default: System.out.println("Chọn chức năng khác");

        }
    }

    static void giaiPTBac1(){
        System.out.println("Cài đặt code giải phương trình bậc 1");
    }

    static void giaiPTBacII(){
        System.out.println("Cài đặt code giải phương trình bậc 2");
    }
    
}
