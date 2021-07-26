package com.juancanhiza.numerosromanos;

public class NumerosRomanos {

    public String convertir(int numeroNatural) {

        if (numeroNatural <= 3){
            return concatenarUnidadesRomanas(numeroNatural);
        }

        switch (numeroNatural){
            case 4:
                return "IV";
            case 5:
                return "V";
            default:
                return null;
        }
    }

    private String concatenarUnidadesRomanas(int numeroNatural) {
        String resultado = "";
        for (int i = 1; i <= numeroNatural; i++) {
            resultado += "I";
        }
        return resultado;
    }
}
