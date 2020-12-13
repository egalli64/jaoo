package m09.s03;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MyArrayTest {

    @Test
    void defaultCtor() {
        MyArray<Integer> ma = new MyArray<>();

        int expected = 10;
        int actual = ma.getCapacity();

        assertThat(expected, is(actual));
    }

    @Test
    void ctor() {
        int expected = 12;
        MyArray<Integer> ma = new MyArray<>(expected);

        int actual = ma.getCapacity();

        assertThat(expected, is(actual));
    }

    @Test
    void addGetPlain() {
        MyArray<Integer> ma = new MyArray<>(1);

        int expected = 42;
        ma.add(expected);
        assertThat(ma.getCapacity(), is(1));
        assertThat(ma.getSize(), is(1));
        assertThat(ma.get(0), is(expected));
    }

    @Test
    void addZeroCapacity() {
        MyArray<Integer> ma = new MyArray<>(0);
        var thrown = assertThrows(IllegalStateException.class, () -> ma.add(42));
        assertThat(thrown.getMessage(), is("Array is full"));
    }

}
