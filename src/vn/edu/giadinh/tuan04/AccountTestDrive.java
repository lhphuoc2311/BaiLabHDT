/*
*  created date: Sep 30, 2021
*  author: cgm
*/
package vn.edu.giadinh.tuan04;

public class AccountTestDrive {
    public static void main(String[] args) {
        Account account;

       account =  new Account(123, 500);
       account.showData();
       account.deposit(500);
       account.showData();
       account.withdraw(200);
       account.showData();
    }
    
}
