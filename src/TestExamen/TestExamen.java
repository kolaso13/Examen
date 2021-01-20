package TestExamen;

import app.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class TestExamen {
    @Test
    @DisplayName("Obtenemos el texto Face si el parametro que pasamos es multiplo de 3")
    void Mult3() {
        // 1 -preparacion del test
        Examen exa = new Examen();
        // 2- Ejecutar lo que vamos ha validar
        String result = exa.Multiplos(9);
        // 3- Aserciones
        assertEquals("Face", result, "Mult3");
    }

    @Test
    @DisplayName("Obtenemos el texto Book si el parametro que pasamos es multiplo de 5")
    void Mult5() {
        // 1 -preparacion del test
        Examen exa = new Examen();
        // 2- Ejecutar lo que vamos ha validar
        String result = exa.Multiplos(20);
        // 3- Aserciones
        assertEquals("Book", result, "Mult5");
    }

    @Test
    @DisplayName("Obtenemos el texto Facebook si el parametro que pasamos es multiplo de 15")
    void Mult15() {
        // 1 -preparacion del test
        Examen exa = new Examen();
        // 2- Ejecutar lo que vamos ha validar
        String result = exa.Multiplos(30);
        // 3- Aserciones
        assertEquals("Facebook", result, "Mult15");
    }

    @Test
    @DisplayName("Obtenemos el numero si el parametro que pasamos no tiene multiplos")
    void NoMult() {
        // 1 -preparacion del test
        Examen exa = new Examen();
        // 2- Ejecutar lo que vamos ha validar
        String result = exa.Multiplos(2);
        // 3- Aserciones
        assertEquals("2", result, "Nomult");
    }

    @Test
    @DisplayName("Obtenemos “1 2 Face“ cuando pasamos un array con los valores {1,2,3}")
    void array1() {
        // fail("Not yet implemented");
        // 1 - preracion del test
        Examen exa = new Examen();
        int[] array = {1,2,3};
        // 2 - Ejecutar lo que vamos a validar
        String result = exa.MultConArray(array);
        // 3 - Aserciones
        assertEquals("1 2 Face", result);
    }

    @Test
    @DisplayName("Obtenemos “Face Book Facebook” cuando pasamos {6,10,30}")
    void array2() {
        // fail("Not yet implemented");
        // 1 - preracion del test
        Examen exa = new Examen();
        int[] array = {6,10,30};
        // 2 - Ejecutar lo que vamos a validar
        String result = exa.MultConArray(array);
        // 3 - Aserciones
        assertEquals("Face Book Facebook", result);
    }

    @Test
    @DisplayName("Obtenemos “4 6 8” cuando pasamos {4,6,8}")
    void array3() {
        // fail("Not yet implemented");
        // 1 - preracion del test
        Examen exa = new Examen();
        int[] array = {4,6,8};
        // 2 - Ejecutar lo que vamos a validar
        String result = exa.MultConArray(array);
        // 3 - Aserciones
        assertEquals("4 6 8", result);
    }

}
