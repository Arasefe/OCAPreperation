package certLeader;

public class _87MarkList {
    int num;
    public static void graceMarks(_87MarkList obj4){
        obj4.num+=10;
        System.out.println(obj4.num);
    }

    public static void main(String[] args) {
        _87MarkList obj1=new _87MarkList();
        _87MarkList obj2=obj1;
        _87MarkList obj3=null;
        obj2.num=60;
        graceMarks(obj2);
    }
}
