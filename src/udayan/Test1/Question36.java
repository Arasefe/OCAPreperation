package udayan.Test1;

import java.util.ArrayList;
import java.util.List;

public class Question36 {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add(0, 'V');
        list.add('T');
        list.add(1, 'E');
        list.add(3, 'O');

        if(list.contains('O')) {
            list.remove('O');           // INDEX OF O-->79 INDEX OUT OF BOUNDS EXCEPTION
        }

        for(char ch : list) {
            System.out.print(ch);
        }
    }
}
