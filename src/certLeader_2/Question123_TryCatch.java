package certLeader_2;

public class Question123_TryCatch {

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
        Question123_TryCatch obj=new Question123_TryCatch();
        obj.doStuff("7007");
    }
}
