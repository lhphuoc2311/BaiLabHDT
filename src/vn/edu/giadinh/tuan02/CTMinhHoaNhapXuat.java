/*
*  crated date: 9/16/2021
*  author: cgm
*/
package vn.edu.giadinh.tuan02;

import java.util.Scanner;

public class CTMinhHoaNhapXuat {

    public static void main(String[] args) {

        System.out.print("Lê Văn Tửng" + "Hello" + " Xin chào");    
        System.out.println(5 + 8);    


        float diemKTLapTrinh;

        //biến tham chiếu
        Scanner bienNhapLieu;//Điều khiển từ xa

        bienNhapLieu = new Scanner(System.in);

        System.out.print("Nhập vào điểm môn Kỹ thuật lập trình: ");
        diemKTLapTrinh = bienNhapLieu.nextFloat();

        System.out.println("Điểm môn kỹ thuật lập trình: " + diemKTLapTrinh);

        //ví dụ khác
        String tenSinhVien = new String("Mr Tý");
    }
    
}
