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

    @Test
    public void DosANumeroRomano(){
        String dosEnRomano = numerosRomanos.convertir(2);
        Assert.assertEquals(dosEnRomano, "II");
    }

    @Test
    public void TresANumeroRomano(){
        String tresEnRomano = numerosRomanos.convertir(3);
        Assert.assertEquals(tresEnRomano, "III");
    }

    @Test
    public void CuatroANumeroRomano(){
        String cuatroEnRomano = numerosRomanos.convertir(4);
        Assert.assertEquals(cuatroEnRomano, "IV");
    }

}
