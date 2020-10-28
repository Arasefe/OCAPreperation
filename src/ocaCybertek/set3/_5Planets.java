package ocaCybertek.set3;


public class _5Planets {
    public String name;
    public int moons;

    public _5Planets(String name, int moons){
        this.name=name;
        this.moons=moons;
    }

    public static void main(String[] args) {
        _5Planets[]planets={
                new _5Planets("Mercury",0),
                new _5Planets("Venus",0),
                new _5Planets("Earth",1),
                new _5Planets("Mars",2)
        };
        System.out.println(planets);
        System.out.println(planets[2]);
        System.out.println(planets[2].moons);
    }
}
