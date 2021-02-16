package m11.s12;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyIterableString mis = new MyIterableString("ciao");

        Iterator<Character> it = mis.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (Character c : mis) {
            System.out.println(c);
        }
    }
}
