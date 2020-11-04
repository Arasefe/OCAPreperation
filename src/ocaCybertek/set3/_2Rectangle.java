package ocaCybertek.set3;

public class _2Rectangle {
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
    public void setArea() {
        area = length*height;
        System.out.println(area);
    }
}
class Mocktest{
    public static void main(String[] args) {
        _2Rectangle obj=new _2Rectangle();
        obj.setHeight(2.0);
        obj.setLength(3.0);
        obj.setArea();
    }


}
