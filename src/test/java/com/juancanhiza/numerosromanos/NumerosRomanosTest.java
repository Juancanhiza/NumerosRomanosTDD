package com.juancanhiza.numerosromanos;

import org.junit.Assert;
import org.junit.Test;

public class NumerosRomanosTest {

    private NumerosRomanos numerosRomanos = new NumerosRomanos();

    @Test
    public void UnoANumeroRomano(){
        String unoEnRomano = numerosRomanos.convertir(1);
        Assert.assertEquals(unoEnRomano, "I");
    }

}
