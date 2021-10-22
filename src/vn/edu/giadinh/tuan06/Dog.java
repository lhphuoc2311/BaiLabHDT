/*
*  created date: Oct 14, 2021
*  author: cgm
*/
package vn.edu.giadinh.tuan06;

class Dog {

    // attribute
    private String breed;// biến state
    private String color;// biến state
    protected int age;// biến state
    private int size;

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {

        //lý luận code
        this.breed = breed;
    }

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    // method
    // constructor
    public Dog() {
    }

    Dog(String b, String c, int a) {
        breed = b;
        color = c;
        age = a;
    }

    private void sua() {
        System.out.println("Gâu gâu");
    }

   private void duoiMeo() {
        System.out.println("Đuổi mèo ...");
    }

    

    public void setSize(int s){
        //lý luận trong đây
        // chặn không chấp nhận các giá trị bất hợp lý
        if(s <= 0){
            System.out.println("Cân nặng của chó không hợp lệ rồi !!!");
        }else{
            size = s;
        }
        
    }

    public int getSize(){
        return size;
    }

}
