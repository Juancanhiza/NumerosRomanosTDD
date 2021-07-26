package com.juancanhiza.numerosromanos;

public class NumerosRomanos {

    public String convertir(int numeroNatural) {

        switch (numeroNatural){
            case 4:
                return "IV";
            case 9:
                return "IX";
        }

        if (numeroNatural <= 3){
            return concatenarUnidadesRomanas(numeroNatural);
        }

        if (numeroNatural <= 8){
            return concatenarUnidadesRomanasDesdeV(numeroNatural);
        }

        return null;
    }

    private String concatenarUnidadesRomanas(int inicioNatural) {
        String resultado = "";
        for (int i = 1; i <= inicioNatural; i++) {
            resultado += "I";
        }
        return resultado;
    }

    private String concatenarUnidadesRomanasDesdeV(int inicioNatural) {
        String resultado = "V";
        for (int i = 6; i <= inicioNatural; i++) {
            resultado += "I";
        }
        return resultado;
    }
}
