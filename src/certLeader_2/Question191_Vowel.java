package certLeader_2;

public class Question191_Vowel {
    private char var;

    public static void main(String[] args) {
        char var1='a';
        char var2=var1;
        var2='e';
        System.out.println("var1"+var1+" var2"+var2);

        Question191_Vowel obj1=new Question191_Vowel();
        Question191_Vowel obj2=obj1;
        obj1.var='o';
        obj2.var='i';
        System.out.println(var1+", "+var2);
        System.out.println(obj1.var+", "+obj2.var);

    }
}
