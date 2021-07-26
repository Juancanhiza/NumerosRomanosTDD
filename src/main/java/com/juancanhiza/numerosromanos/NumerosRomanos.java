package com.juancanhiza.numerosromanos;

public class NumerosRomanos {

    public String convertir(int numeroNatural) {
        switch (numeroNatural){
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            default:
                return null;
        }
    }
}
