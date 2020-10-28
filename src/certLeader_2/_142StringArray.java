package certLeader_2;

public class _142StringArray {
    public static void main(String[] args) {
        int wd=0;
        String days[]={"sun","mon","wed","sat"};

        for (String s : days) {
            switch(s){
                case "sat":
                case "sun":
                    wd-=1;      //-1
                    break;
                case "mon":
                    wd-=1;      //-2
                    break;
                case "wed":
                    wd+=2;      //0

            }
        }
        System.out.println(wd);
    }
}
