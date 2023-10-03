package com.example.mathcalcuator.math;

public class SimpleMath {

    //Aqui ficou o calculo para  e depois os chames passando o simplemath e o chamando de math
    //assim usando o math. mais a operação desejada

    public Double sum(Double firstNumber, Double secoundNumber){
        return firstNumber + secoundNumber;
    }

    public Double sub(Double firstNumber, Double secoundNumber){
        return firstNumber - secoundNumber;
    }

    public Double mult(Double firstNumber, Double secoundNumber){
        return firstNumber * secoundNumber;
    }

    public Double div(Double firstNumber, Double secoundNumber){
        return firstNumber / secoundNumber;
    }

    public Double med(Double firstNumber, Double secoundNumber){
        return (firstNumber + secoundNumber) / 2;
    }

    public Double sqtr(Double number){
        return (Double) Math.sqrt(number);
    }
}
