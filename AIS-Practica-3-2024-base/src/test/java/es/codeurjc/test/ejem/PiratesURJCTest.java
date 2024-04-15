package es.codeurjc.test.ejem;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PiratesURJCTest {

    public void funcionComparativa (String salida, String ronda) {
        PiratesURJC partida = new PiratesURJC();
        String resultado = partida.play(ronda);
        assertEquals(resultado, salida);
    }

    @Test
    @DisplayName("Test R1_1 (1M 4M)")
    public void TestR1_1 (){
        funcionComparativa("Gana jugador 2", "1M 4M");
    }
    @Test
    @DisplayName("Test R1_2 (5M 2M)")
    public void TestR1_2 (){
        funcionComparativa("Gana jugador 1", "5M 2M");
    }
}
