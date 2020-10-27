package ocaStudyGuide.methodsencapsulation;

public class Order3 {

    final String value1="1";
    static String value2="2";
    String value3="3";
    {
        value2="instanceblockvalue2";
        value3="instanceblockvalue3";
    }
    static{
        value2="staticblock";
    }
}
