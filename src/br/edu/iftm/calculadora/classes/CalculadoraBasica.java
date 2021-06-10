package br.edu.iftm.calculadora.classes;

public class CalculadoraBasica extends Calculadora{

    @Override
    public int somar(int valorA, int valorB) {
        // TODO Auto-generated method stub
        return valorA+valorB;
    }

    @Override
    public float somar(float valorA, float valorB) {
        // TODO Auto-generated method stub
        return valorA+valorB;
    }

    @Override
    public float somar(float valorA, int valorB) {
        return valorA+valorB;
    }

    @Override
    public float somar(int valorA, float valorB) {
        
        return valorA+valorB;
    }

    @Override
    public int subtrair(int valorA, int valorB) {
        // TODO Auto-generated method stub
        return valorA-valorB;
    }

    @Override
    public float subtrair(float valorA, float valorB) {
        // TODO Auto-generated method stub
        return valorA-valorB;
    }

    @Override
    public float subtrair(float valorA, int valorB) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public float subtrair(int valorA, float valorB) {
        // TODO Auto-generated method stub
        return valorA-valorB;
    }

    @Override
    public int dividir(int valorA, int valorB) {
        // TODO Auto-generated method stub
        return valorA/valorB;
    }

    @Override
    public float dividir(float valorA, float valorB) {
        // TODO Auto-generated method stub
        return valorA/valorB;
    }

    @Override
    public float dividir(float valorA, int valorB) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public float dividir(int valorA, float valorB) {
        // TODO Auto-generated method stub
        return valorA/valorB;
    }
    
}
