package com.example.mathcalcuator.converters;

public class NumberConverter {

    //aqui implementei as convertores
    //usando logica de não nulo e pegando de string para double

    public static Double convertToDouble(String strNumber){
        if (strNumber == null) return 0D;
        String number = strNumber.replace(",", ".");
        if (isNumeric(number)) return Double.parseDouble(number);
        return 0D;
    }


    //aqui verificando se é um numero.
    //e convertando  todas as , em . as virgulas em pontos
    public static boolean isNumeric(String strNumber){
        if (strNumber == null) return false;
        String number = strNumber.replace(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");

    }
}
