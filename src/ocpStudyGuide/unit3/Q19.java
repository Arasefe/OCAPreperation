package ocpStudyGuide.unit3;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q19 {
    public static void main(String[] args) {
        List<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(12);
        q.remove(1);
        System.out.println(q);

        Queue<Integer> q1 = new LinkedList<>();
        q.add(10);
        q.add(12);
        q.remove(1);
        System.out.println(q1);

    }
}
