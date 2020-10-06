package udayan.Test1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Question15 {
    String name;
    int age;

    void Question15(){
        //Question15("James",25);
    }
    void Question(String name, int age){
        this.name=name;
        this.age=age;
    }
}
class Test{
    public static void main(String[] args) {
        Question15 s=new Question15();
        System.out.println(s.name+":"+s.age);
    }
}
