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
            return concatenarUnidadesRomanas(1, numeroNatural, "");
        }

        if (numeroNatural <= 8){
            return concatenarUnidadesRomanas(6, numeroNatural, "V");
        }

        return null;
    }

    private String concatenarUnidadesRomanas(int inicio, int numeroNatural, String inicioRomano){
        for (int i = inicio; i <= numeroNatural; i++) {
            inicioRomano += "I";
        }
        return inicioRomano;

    }
}
