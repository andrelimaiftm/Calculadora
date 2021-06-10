package br.edu.iftm.calculadora.classes;

import javax.swing.JOptionPane;

public class regraNegocio {

    CalculadoraBasica calculadoraBasica = new CalculadoraBasica();

    public void somar(int valorA, int valorB){
        int resultado = calculadoraBasica.somar(valorA, valorB);
        System.out.println(resultado);
    }

    public void subtrair(int valorA, int valorB){
        int resultado = calculadoraBasica.subtrair(valorA, valorB);
        System.out.println(resultado);
    }

    public void dividir(int valorA, int valorB){
        int resultado = calculadoraBasica.dividir(valorA, valorB);
        System.out.println(resultado);
    }

    public int escolherOperacao(){
        int opcao = 0;
        String escolha = "";
        do{
            System.out.println(" Menu Calculadora");
            System.out.println(" 1 - Somar");
            System.out.println(" 2 - Subtarir");
            System.out.println(" 3 - Dividir");            
        escolha= JOptionPane.showInputDialog(null, "Escolha a opção que deseja executar: ");
        opcao = Integer.parseInt(escolha);
        }while(opcao == 0);
        return opcao;
    }

    public void realizaOperacao(int operacao){
        String numeroA = JOptionPane.showInputDialog(null, "Digite o primeiro valor: ");
        String numeroB = JOptionPane.showInputDialog(null, "Digite o segundo valor: ");
        int valorA = Integer.parseInt(numeroA);
        int valorB = Integer.parseInt(numeroB);
        switch (operacao) {
            case 1:
                this.somar(valorA, valorB);
                break;
            case 2:
                this.subtrair(valorA, valorB);
                break;
            case 3:
                this.dividir(valorA, valorB);
            
        }
    }
    
}
