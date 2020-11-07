package certLeader_2;

public class Question189_StaticVar {
    public static int stVar=100;
    public int var=200;
    public String toString(){
        return stVar+":"+var;
    }
}
class Test_Static{
    public static void main(String[] args) {
        Question189_StaticVar t1=new Question189_StaticVar();
        t1.var=300;
        System.out.println(t1);
        Question189_StaticVar t2=new Question189_StaticVar();
        t2.stVar=300;
        System.out.println(t2);

    }
}