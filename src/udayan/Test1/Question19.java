package udayan.Test1;

import com.sun.org.apache.xpath.internal.operations.Variable;

public class Question19 {
    public static void main(String[] args) {
        double price=90000;
        String model;
        if(price>100000){
            model="Tesla X";

        }else if(price<=100000){
            model="Tesla S";
        }
        //System.out.println(model);
        //Variable 'model' might not have been initialized
    }
}
