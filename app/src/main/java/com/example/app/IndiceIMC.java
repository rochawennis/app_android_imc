package com.example.app;

import java.io.Serializable;

public class IndiceIMC implements Serializable {

    private double peso;
    private double altura;
    private double calculoimc;

    public IndiceIMC(double peso, double altura) {
        this.altura = altura;
        this.peso = peso;
    }

    public double getPeso() {

        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {

        return altura;
    }

    public void setAltura(double altura) {

        this.altura = altura;
    }

    public double getCalculoimc() {
        calculoimc = peso / (altura*altura);
        return calculoimc;
    }

    public void setCalculoimc(double calculoimc) {
        this.calculoimc = calculoimc;
    }

    public String grau(double calculoimc) {
        if (calculoimc < 18.5) {
            return ("Resultado: - Abaixo do peso ideal");
        } else if (calculoimc <= 24.9) {
            return ("Resultado: - Peso ideal");
        } else if (calculoimc <= 29.9) {
            return ("Resultado: - Acima do peso(sobrepeso)");
        } else if (calculoimc <= 34.9) {
            return ("Resultado: - Obesidade grau I");
        } else if (calculoimc <= 39.9) {
            return ("Resultado: - Obesidade grau II");
        } else {
            return ("Resultado: - Obesidade grau III");
        }
    }
}
