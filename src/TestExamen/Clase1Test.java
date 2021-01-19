package TestExamen;

import app.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class Clase1Test {
    @Test
    @DisplayName("La multiplicación de 3x5 es 15")
    void test3x5() {
        //fail("Not yet implemented");
        // 1 -preparacion del test
        Calculadora cal = new Calculadora();
        // 2- Ejecutar lo que vamos ha validar
        int result = cal.multiplicación(3,5);
        // 3- Aserciones
        assertEquals(15, result, "3x5=15");

    }

    @Test
    @DisplayName("La suma de 5/10 + 3/6 es ")
    void testsumaFraccion() {
        //fail("Not yet implemented");
        // 1 -preparacion del test
        Fraccion f1 = new Fraccion(5,10);
        Fraccion f2 = new Fraccion(3,6);
        Calculadora cal = new Calculadora();
        // 2- Ejecutar lo que vamos ha validar
        Fraccion result = cal.suma(f1,f2);
        // 3- Aserciones
        assertEquals(60, result.numerador);

    }
}
