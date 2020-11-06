package certLeader_2;

class Question190 {
    public void m1() throws Exception{
        System.out.println("m1 accessed");
        throw new E1();
    }

    public void m2(){
        System.out.println("m2 accessed");
        throw new E2();
    }



}
class E2 extends RuntimeException{}

class E1 extends Exception{}