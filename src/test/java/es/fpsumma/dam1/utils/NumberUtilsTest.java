package es.fpsumma.dam1.utils;

/*import static org.junit.jupiter.api.Assertions.assertArrayEquals;*/
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class NumberUtilsTest {

    @Test
    public void suma() {

        int result = NumberUtils.suma(2, 3);
        assertEquals(5, result);

    }

    @Test
    public void division() {

        double result = NumberUtils.division(4, 2);
        assertEquals(2, result); 
        
        result = NumberUtils.division(5, 2);
        assertEquals(2.5, result);

    }

    @Test
    public void isEven() {

        int n = 0;
        boolean isEven = n % 2 == 0;
        if (isEven) {

            System.out.println("Es par");

        } else {

            System.out.println("Es impar");

        }
    }


}
