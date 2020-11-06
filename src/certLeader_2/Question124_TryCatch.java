package certLeader_2;

public class Question124_TryCatch {
    String myStr="7007";
    public void doStuff(String str){
        int myNum=0;
        try{
             myStr=str;
            myNum=Integer.parseInt(myStr);
        }catch (NumberFormatException ne){
            ne.getStackTrace();
        }
        System.out.println("myStr: "+myStr +", myNum: "+myNum);
    }


    public static void main(String[] args) {
        Question124_TryCatch obj=new Question124_TryCatch();
        obj.doStuff("9009");
    }
}
