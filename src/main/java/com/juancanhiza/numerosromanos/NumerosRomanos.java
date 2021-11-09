package com.juancanhiza.numerosromanos;

public class NumerosRomanos {

    public String convertir(int numeroNatural) {

        char[] numeros = String.valueOf(numeroNatural).toCharArray();

        if (numeros.length == 1) {
            return pasarUnidades(numeroNatural);
        } else {
            int unidad = Character.getNumericValue(numeros[1]);
            int decena = Character.getNumericValue(numeros[0]);
            return pasarDecenas(decena) + pasarUnidades(unidad);
        }
    }

    private String pasarUnidades(int numeroNatural) {
        switch (numeroNatural){
            case 4:
                return "IV";
            case 9:
                return "IX";
        }

        if (numeroNatural <= 3)
            return concatenarUnidadesRomanas(1, numeroNatural, "");
        if (numeroNatural <= 8)
            return concatenarUnidadesRomanas(6, numeroNatural, "V");

        return null;
    }

    private String pasarDecenas(int numeroNatural) {
        switch (numeroNatural) {
            case 1:
                return "X";
            case 2:
                return "XX";
            case 3:
                return "XXX";
            case 4:
                return "XL";
            case 5:
                return "L";
            case 6:
                return "LX";
            case 7:
                return "LXX";
            case 8:
                return "LXXX";
            case 9:
                return "XC";
            default:
                return null;
        }
    }

    private String concatenarUnidadesRomanas(int inicio, int numeroNatural, String inicioRomano){
        for (int i = inicio; i <= numeroNatural; i++) {
            inicioRomano += "I";
        }
        return inicioRomano;

    }
}
