package certLeader;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

class CC {
    public CC(){
        System.out.println("C ");
    }
}


class BB extends C{
    public BB(){
        System.out.println("B ");
    }
}

public class _79A extends B{
    public _79A(){
        System.out.println("A ");
    }

    public static void main(String[] args) {
        _79A a=new _79A();
    }
}
