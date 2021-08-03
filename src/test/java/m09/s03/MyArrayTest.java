package m09.s03;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MyArrayTest {

    @Test
    void defaultCtor() {
        MyArray<Integer> ma = new MyArray<>();

        int expected = 10;
        int actual = ma.getCapacity();

        assertThat(expected).isEqualTo(actual);
    }

    @Test
    void ctor() {
        int expected = 12;
        MyArray<Integer> ma = new MyArray<>(expected);

        int actual = ma.getCapacity();

        assertThat(expected).isEqualTo(actual);
    }

    @Test
    void addGetPlain() {
        MyArray<Integer> ma = new MyArray<>(1);

        int expected = 42;
        ma.add(expected);
        assertThat(ma.getCapacity()).isEqualTo(1);
        assertThat(ma.getSize()).isEqualTo(1);
        assertThat(ma.get(0)).isEqualTo(expected);
    }

    @Test
    void addZeroCapacity() {
        MyArray<Integer> ma = new MyArray<>(0);
        var thrown = assertThrows(IllegalStateException.class, () -> ma.add(42));
        assertThat(thrown.getMessage()).isEqualTo("Array is full");
    }

}
