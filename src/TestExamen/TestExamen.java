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
    
}
