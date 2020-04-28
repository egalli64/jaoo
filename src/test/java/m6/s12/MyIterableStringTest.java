package m6.s12;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

class MyIterableStringTest {
    @Test
    void iteratorPlain() {
        MyIterableString mis = new MyIterableString("hi");
        Iterator<Character> it = mis.iterator();

        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is('h'));

        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is('i'));

        assertThat(it.hasNext(), is(false));
        assertThrows(NoSuchElementException.class, it::next);
    }

    @Test
    void iteratorEmptyString() {
        MyIterableString mis = new MyIterableString("");
        Iterator<Character> it = mis.iterator();

        assertThat(it.hasNext(), is(false));
        assertThrows(NoSuchElementException.class, it::next);
    }

    @Test
    void iteratorPlainForEach() {
        String input = "hi";
        MyIterableString mis = new MyIterableString(input);
        int count = 0;
        for (Character c : mis) {
            assertThat(c, is(input.charAt(count)));
            count += 1;
        }

        assertThat(count, is(input.length()));
    }
}
