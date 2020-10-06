package entuware.mostmissedtest;

public abstract class Planet {
    protected void revolve() {
        System.out.println("The planet is revolving");
    }
}

class Earth extends Planet {
    public void revolve() {
        System.out.println("The Planet is revolving");
    }

    protected void rotate() {
        System.out.println("The Planet is rotating around the sun");
    }
}