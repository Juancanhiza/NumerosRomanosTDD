package com.juancanhiza.numerosromanos;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumerosRomanosTest {

    private NumerosRomanos numerosRomanos = new NumerosRomanos();

    @Test
    public void unoANumeroRomano(){
        String unoEnRomano = numerosRomanos.convertir(1);
        Assert.assertEquals("I", unoEnRomano);
    }

    @Test
    public void dosANumeroRomano(){
        String dosEnRomano = numerosRomanos.convertir(2);
        Assert.assertEquals("II", dosEnRomano);
    }

    @Test
    public void tresANumeroRomano(){
        String tresEnRomano = numerosRomanos.convertir(3);
        Assert.assertEquals("III", tresEnRomano);
    }

    @Test
    public void cuatroANumeroRomano(){
        String cuatroEnRomano = numerosRomanos.convertir(4);
        Assert.assertEquals("IV", cuatroEnRomano);
    }

    @Test
    public void cincoANumeroRomano(){
        String cincoEnRomano = numerosRomanos.convertir(5);
        Assert.assertEquals("V", cincoEnRomano);
    }

    @Test
    public void seisANumeroRomano(){
        String seisEnRomano = numerosRomanos.convertir(6);
        Assert.assertEquals("VI", seisEnRomano);
    }

    @Test
    public void sieteANumeroRomano(){
        String sieteEnRomano = numerosRomanos.convertir(7);
        Assert.assertEquals("VII", sieteEnRomano);
    }

    @Test
    public void ochoANumeroRomano(){
        String ochoEnRomano = numerosRomanos.convertir(8);
        Assert.assertEquals("VIII", ochoEnRomano);
    }

    @Test
    public void nueveANumeroRomano(){
        String nueveEnRomano = numerosRomanos.convertir(9);
        Assert.assertEquals("IX", nueveEnRomano);
    }

    @Test
    public void diezANumeroRomano(){
        String diezEnRomano = numerosRomanos.convertir(10);
        Assert.assertEquals("X", diezEnRomano);
    }

    @Test
    public void onceANumeroRomano(){
        String onceEnRomano = numerosRomanos.convertir(11);
        Assert.assertEquals("XI", onceEnRomano);
    }

    @Test
    public void doceANumeroRomano(){
        String doceEnRomano = numerosRomanos.convertir(12);
        Assert.assertEquals("XII", doceEnRomano);
    }

    @Test
    public void treceANumeroRomano(){
        String treceEnRomano = numerosRomanos.convertir(13);
        Assert.assertEquals("XIII", treceEnRomano);
    }

    @Test
    public void catorceANumeroRomano(){
        String catorceEnRomano = numerosRomanos.convertir(14);
        Assert.assertEquals("XIV", catorceEnRomano);
    }

    @Test
    public void quinceANumeroRomano(){
        String quinceEnRomano = numerosRomanos.convertir(15);
        Assert.assertEquals("XV", quinceEnRomano);
    }

    @Test
    public void dieciseisANumeroRomano(){
        String dieciseisEnRomano = numerosRomanos.convertir(16);
        Assert.assertEquals("XVI", dieciseisEnRomano);
    }

    @Test
    public void diecisieteANumeroRomano(){
        String diecisieteEnRomano = numerosRomanos.convertir(17);
        Assert.assertEquals("XVII", diecisieteEnRomano);
    }

    @Test
    public void dieciochoANumeroRomano(){
        String dieciochoEnRomano = numerosRomanos.convertir(18);
        Assert.assertEquals("XVIII", dieciochoEnRomano);
    }

    @Test
    public void diecinueveANumeroRomano(){
        String diecinueveEnRomano = numerosRomanos.convertir(19);
        Assert.assertEquals("XIX", diecinueveEnRomano);
    }

    @Test
    public void veinteANumeroRomano(){
        String veinteEnRomano = numerosRomanos.convertir(20);
        Assert.assertEquals("XX", veinteEnRomano);
    }

    @Test
    public void veintenaANumerosRomanos(){
        List<Integer> veintena = Arrays.asList(20, 21, 22, 23, 24, 25, 26, 27, 28, 29);

        List<String> veintenaRomanos = veintena.stream()
                .map(numero -> numerosRomanos.convertir(numero))
                .collect(Collectors.toList());

        Assert.assertEquals(veintenaRomanos.get(0), "XX");
        Assert.assertEquals(veintenaRomanos.get(1), "XXI");
        Assert.assertEquals(veintenaRomanos.get(2), "XXII");
        Assert.assertEquals(veintenaRomanos.get(3), "XXIII");
        Assert.assertEquals(veintenaRomanos.get(4), "XXIV");
        Assert.assertEquals(veintenaRomanos.get(5), "XXV");
        Assert.assertEquals(veintenaRomanos.get(6), "XXVI");
        Assert.assertEquals(veintenaRomanos.get(7), "XXVII");
        Assert.assertEquals(veintenaRomanos.get(8), "XXVIII");
        Assert.assertEquals(veintenaRomanos.get(9), "XXIX");
    }

    @Test
    public void treintenaANumerosRomanos(){
        List<Integer> veintena = Arrays.asList(30, 31, 32, 33, 34, 35, 36, 37, 38, 39);

        List<String> veintenaRomanos = veintena.stream()
                .map(numero -> numerosRomanos.convertir(numero))
                .collect(Collectors.toList());

        Assert.assertEquals(veintenaRomanos.get(0), "XXX");
        Assert.assertEquals(veintenaRomanos.get(1), "XXXI");
        Assert.assertEquals(veintenaRomanos.get(2), "XXXII");
        Assert.assertEquals(veintenaRomanos.get(3), "XXXIII");
        Assert.assertEquals(veintenaRomanos.get(4), "XXXIV");
        Assert.assertEquals(veintenaRomanos.get(5), "XXXV");
        Assert.assertEquals(veintenaRomanos.get(6), "XXXVI");
        Assert.assertEquals(veintenaRomanos.get(7), "XXXVII");
        Assert.assertEquals(veintenaRomanos.get(8), "XXXVIII");
        Assert.assertEquals(veintenaRomanos.get(9), "XXXIX");
    }

    @Test
    public void decenasANumerosRomanos(){
        List<Integer> decenas = Arrays.asList(40, 50, 60, 70, 80, 90);

        List<String> decenasRomano = decenas.stream()
                .map(numero -> numerosRomanos.convertir(numero))
                .collect(Collectors.toList());

        Assert.assertEquals(decenasRomano.get(0), "XL");
        Assert.assertEquals(decenasRomano.get(1), "L");
        Assert.assertEquals(decenasRomano.get(2), "LX");
        Assert.assertEquals(decenasRomano.get(3), "LXX");
        Assert.assertEquals(decenasRomano.get(4), "LXXX");
        Assert.assertEquals(decenasRomano.get(5), "XC");
    }

    @Test
    public void numerosRandomARomano(){
        List<Integer> decenas = Arrays.asList(69, 99, 15, 81, 14, 55);

        List<String> decenasRomano = decenas.stream()
                .map(numero -> numerosRomanos.convertir(numero))
                .collect(Collectors.toList());

        Assert.assertEquals(decenasRomano.get(0), "LXIX");
        Assert.assertEquals(decenasRomano.get(1), "XCIX");
        Assert.assertEquals(decenasRomano.get(2), "XV");
        Assert.assertEquals(decenasRomano.get(3), "LXXXI");
        Assert.assertEquals(decenasRomano.get(4), "XIV");
        Assert.assertEquals(decenasRomano.get(5), "LV");
    }

    @Test
    public void numerosGrandesARomano(){
        List<Integer> decenas = Arrays.asList(100, 200, 300, 400, 500, 600, 700, 800, 900, 1000);

        List<String> decenasRomano = decenas.stream()
                .map(numero -> numerosRomanos.convertir(numero))
                .collect(Collectors.toList());

        Assert.assertEquals(decenasRomano.get(0), "C");
        Assert.assertEquals(decenasRomano.get(1), "CC");
        Assert.assertEquals(decenasRomano.get(2), "CCC");
        Assert.assertEquals(decenasRomano.get(3), "CD");
        Assert.assertEquals(decenasRomano.get(4), "D");
        Assert.assertEquals(decenasRomano.get(5), "DC");
        Assert.assertEquals(decenasRomano.get(6), "DCC");
        Assert.assertEquals(decenasRomano.get(7), "DCCC");
        Assert.assertEquals(decenasRomano.get(8), "CM");
        Assert.assertEquals(decenasRomano.get(9), "M");
    }

    @Test
    public void numerosGrandesrRandomARomano(){
        List<Integer> decenas = Arrays.asList(115, 580, 999);

        List<String> decenasRomano = decenas.stream()
                .map(numero -> numerosRomanos.convertir(numero))
                .collect(Collectors.toList());

        Assert.assertEquals(decenasRomano.get(0), "CXV");
        Assert.assertEquals(decenasRomano.get(1), "DLXXX");
        Assert.assertEquals(decenasRomano.get(2), "CMXCIX");
    }



}
