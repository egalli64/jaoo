package m6.s12;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterableString implements Iterable<Character> {
    private String s;

    public MyIterableString(String s) {
        this.s = s;
    }

    @Override
    public Iterator<Character> iterator() {
//        return new MyIterator(s);

        return new Iterator<Character>() {
            private int pos = 0;

            @Override
            public boolean hasNext() {
                return s.length() > pos;
            }

            @Override
            public Character next() {
                try {
                    char c = s.charAt(pos);
                    pos += 1;
                    return c;
//                    return s.charAt(pos++);
                } catch (Exception e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            }
        };
    }
}

class X {
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

class MyIterator implements Iterator<Character> {
    private String s;
    private int pos = 0;

    public MyIterator(String s) {
        this.s = s;
    }

    @Override
    public boolean hasNext() {
        return s.length() > pos;
    }

    @Override
    public Character next() {
        try {
            return s.charAt(pos++);
        } catch (Exception e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
