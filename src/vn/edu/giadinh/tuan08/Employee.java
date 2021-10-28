/*
*  created date: Oct 28, 2021
*  author: cgm
*/
package vn.edu.giadinh.tuan08;

public class Employee extends Person{
    private int salary;

    @Override
    public String toString() {
        String s;
        s = getName() + ", " + getBirthday();
        s += ", " + salary;

        return s;
    }
    
}
