package certLeader_3;

public class Question215_Exceptions {
    public static void main(String[] args) {
        Question215_Exceptions obj=new Question215_Exceptions();

        try{
            obj.open();
            obj.process();

        }catch (Exception e){
            System.out.println("completed");
        }
    }
    public void process()  throws LogFileException{
        System.out.println("Processed");
        throw new LogFileException();
    }
    public void open(){
        System.out.println("Opened");
        throw new AccessViolationException();
    }
}
class LogFileException extends Exception{}

class AccessViolationException extends RuntimeException{}
