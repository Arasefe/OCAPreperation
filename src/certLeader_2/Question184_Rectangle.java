package certLeader_2;

public class Question184_Rectangle {
    private double length;
    private double height;
    private double area;


    public void setLength(double length){
        this.length=length;
        setArea();
    }

    public void setHeight(double height){
        this.height=height;
        setArea();
    }
    public void setArea(){
        area=length*height;
        System.out.println(area);
    }

    public static void main(String[] args) {
        Question184_Rectangle obj=new Question184_Rectangle();
        obj.height=2;
        obj.length=3;
        obj.setArea();
    }
}
