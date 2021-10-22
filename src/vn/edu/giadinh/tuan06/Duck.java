/*
*  created date: Oct 14, 2021
*  author: cgm
*/
package vn.edu.giadinh.tuan06;

public class Duck {

    int size;//biến state 
    static int count; //biến static; biến class

    Duck(){
        count ++;
    }

    void quack(){
        count --;
    }
    
}
