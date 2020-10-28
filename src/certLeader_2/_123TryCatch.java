package certLeader_2;

public class _123TryCatch {

    String myStr="9009";
    public void doStuff(String str){
        int myNum=0;
        try{
            String myStr=str;
            myNum=Integer.parseInt(myStr);
        }catch (NumberFormatException ne){
            ne.getStackTrace();
        }
        System.out.println("myStr: "+myStr +", myNum: "+myNum);
    }



    public static void main(String[] args) {
        _123TryCatch obj=new _123TryCatch();
        obj.doStuff("7007");
    }
}
