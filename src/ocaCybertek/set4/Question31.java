package ocaCybertek.set4;


import java.util.ArrayList;

public class Question31 {
    public static void main(String[] args) {
        ArrayList<String>myList=new ArrayList<>();
        String[]myArray;
        try{
            while(true){
                myList.add("MyString");
            }
        }catch (RuntimeException e){
            System.out.println("A");
        }catch (Exception e){
            System.out.println("B");
        }
        System.out.println("Ready to use");
    }
}
