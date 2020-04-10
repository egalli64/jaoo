package m2.s37;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;

class ExerciseCaesarTest {

    /*
     * System.out.println("encryptCaesar() CIAO +1: " + encryptCaesar("CIAO", 1));
     * System.out.println("encryptCaesar(): ZOO +1: " + encryptCaesar("ZOO", 1));
     * System.out.println("encryptCaesar(): DJBP -1: " + encryptCaesar("DJBP", -1));
     * System.out.println("encryptCaesar(): APP -1: " + encryptCaesar("APP", -1));
     * 
     * System.out.println("encryptCaesar(): CIAO +26: " + encryptCaesar("CIAO",
     * 26)); System.out.println("encryptCaesar(): ZOO +26: " + encryptCaesar("ZOO",
     * 26)); System.out.println("encryptCaesar(): DJBP -26: " +
     * encryptCaesar("DJBP", -26)); System.out.println("encryptCaesar(): APP -26: "
     * + encryptCaesar("APP", -26));
     * 
     * System.out.println("encryptCaesar(): CIAO +27: " + encryptCaesar("CIAO",
     * 27)); System.out.println("encryptCaesar(): ZOO +27: " + encryptCaesar("ZOO",
     * 27)); System.out.println("encryptCaesar(): DJBP -27: " +
     * encryptCaesar("DJBP", -27)); System.out.println("encryptCaesar(): APP -27: "
     * + encryptCaesar("APP", -27));
     */

    @Test
    void encryptCaesarPlainPlusOne() {
        String result = Exercise.encryptCaesar("CIAO", 1);

        assertThat(result, equalTo("DJBP"));
    }

}
