/*
*  created date: Oct 21, 2021
*  author: cgm
*/
package vn.edu.giadinh.tuan08;

public class Animal {

    protected String sound;// tên file âm thanh dành cho loại khác nhau
    private String name;

    protected String picture;

    protected int hunger;

    protected String food;

    public Animal(){
        //super();
        System.out.println("making a Animal ...");
    }

    public Animal(String n){
        name = n;
    }

    //location

    //boundaries

    protected void makeNoise(){
        //code để xử lý phát ra tiếng kêu
        //System.out.println("Phát ra tiếng kêu " + sound);
        System.out.println("Hmm...");
    }

    protected void eat(){
        System.out.println("Ăn ...");
    }


    protected void sleep(){
        System.out.println("Ngủ ...");
    }

    protected void roam(){
        System.out.println("Đi lang thang...");
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
