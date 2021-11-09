package com.juancanhiza.numerosromanos;

import java.util.Arrays;
import java.util.List;

public class NumerosRomanos {

    private static final List<String> SIMBOLOS_ROMANOS = Arrays.asList("I", "V", "X", "L", "C", "D", "M");

    public String convertir(int numeroNatural) {

        char[] numeros = String.valueOf(numeroNatural).toCharArray();

        int inc = 0;
        String resultado = "";

        for (int i = numeros.length - 1; i >= 0; i--) {
            int numeroDecimal = Character.getNumericValue(numeros[i]);
            String numeroRomano = pasarARomano(numeroDecimal, inc, 1+inc, 2+inc);

            resultado = numeroRomano + resultado;
            inc+=2;
        }

        return resultado;
    }

    private String pasarARomano(int numeroNatural, int menor, int medio, int mayor) {
        switch (numeroNatural){
            case 4:
                return SIMBOLOS_ROMANOS.get(menor) + SIMBOLOS_ROMANOS.get(medio);
            case 9:
                return SIMBOLOS_ROMANOS.get(menor) + SIMBOLOS_ROMANOS.get(mayor);
        }

        if (numeroNatural <= 3)
            return concatenarUnidadesRomanas(1, numeroNatural, "", SIMBOLOS_ROMANOS.get(menor));
        if (numeroNatural <= 8)
            return concatenarUnidadesRomanas(6, numeroNatural, SIMBOLOS_ROMANOS.get(medio), SIMBOLOS_ROMANOS.get(menor));

        return null;
    }

    private String concatenarUnidadesRomanas(int inicio, int numeroNatural, String inicioRomano, String iteradorRomano){
        for (int i = inicio; i <= numeroNatural; i++) {
            inicioRomano += iteradorRomano;
        }
        return inicioRomano;
    }
}
