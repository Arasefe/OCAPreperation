package certLeader_3;

public class _215Exceptions {
    public static void main(String[] args) {
        _215Exceptions obj=new _215Exceptions();

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
