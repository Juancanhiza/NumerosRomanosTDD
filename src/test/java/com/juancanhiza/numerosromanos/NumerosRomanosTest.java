package com.juancanhiza.numerosromanos;

import org.junit.Assert;
import org.junit.Test;

public class NumerosRomanosTest {

    private NumerosRomanos numerosRomanos = new NumerosRomanos();

    @Test
    public void unoANumeroRomano(){
        String unoEnRomano = numerosRomanos.convertir(1);
        Assert.assertEquals(unoEnRomano, "I");
    }

    @Test
    public void dosANumeroRomano(){
        String dosEnRomano = numerosRomanos.convertir(2);
        Assert.assertEquals(dosEnRomano, "II");
    }

    @Test
    public void tresANumeroRomano(){
        String tresEnRomano = numerosRomanos.convertir(3);
        Assert.assertEquals(tresEnRomano, "III");
    }

    @Test
    public void cuatroANumeroRomano(){
        String cuatroEnRomano = numerosRomanos.convertir(4);
        Assert.assertEquals(cuatroEnRomano, "IV");
    }

    @Test
    public void cincoANumeroRomano(){
        String cincoEnRomano = numerosRomanos.convertir(5);
        Assert.assertEquals(cincoEnRomano, "V");
    }

    @Test
    public void seisANumeroRomano(){
        String seisEnRomano = numerosRomanos.convertir(6);
        Assert.assertEquals(seisEnRomano, "VI");
    }

    @Test
    public void sieteANumeroRomano(){
        String sieteEnRomano = numerosRomanos.convertir(7);
        Assert.assertEquals(sieteEnRomano, "VII");
    }

    @Test
    public void ochoANumeroRomano(){
        String ochoEnRomano = numerosRomanos.convertir(8);
        Assert.assertEquals(ochoEnRomano, "VIII");
    }

}
