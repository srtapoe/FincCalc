package org.com.studies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculoTest {

    private Cliente cliente;
    private Calculo calculo;
    private double valueLending;
    private double rate;
    private int time;

    @BeforeEach
   void setup(){
      cliente = new Cliente("Ted", "25000", TypesServices.SIMPLE_INTEREST);
        valueLending = 1000.00;
        rate = 0.1;
        time = 3;
        calculo = new Calculo();
    }
    @Test
    void calculateSimpleInterestSuccess(){
        double expected = 300.00;
        double result = calculo.calculateSimpleInterest(valueLending, rate, time);

        cliente.showInformations(cliente);

        Assertions.assertEquals(expected, result);
    }
}
