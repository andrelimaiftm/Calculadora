package br.edu.iftm.calculadora.classes;

public abstract class Calculadora {
    
    public abstract int somar(int valorA, int valorB);

    public abstract float somar(float valorA, float valorB);    

    public abstract float somar(float valorA, int valorB);

    public abstract float somar(int valorA, float valorB);

    public abstract int subtrair(int valorA, int valorB);

    public abstract float subtrair(float valorA, float valorB);    

    public abstract float subtrair(float valorA, int valorB);

    public abstract float subtrair(int valorA, float valorB);

    public abstract int dividir(int valorA, int valorB);

    public abstract float dividir(float valorA, float valorB);    

    public abstract float dividir(float valorA, int valorB);

    public abstract float dividir(int valorA, float valorB);
}
