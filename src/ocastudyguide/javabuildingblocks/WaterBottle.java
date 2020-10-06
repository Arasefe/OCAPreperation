package ocastudyguide.javabuildingblocks;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class WaterBottle {
    private String brand;
    private boolean empty;

    public static void main(String[] args) {
        WaterBottle wb=new WaterBottle();
        System.out.println("Empty = "+wb.empty);
        System.out.println(", Brand = "+wb.brand);
    }
}
