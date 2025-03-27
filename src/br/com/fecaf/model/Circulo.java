package br.com.fecaf.model;

import java.util.Scanner;

public class Circulo {
    //isso é um atributo !!!
    public double raio, area, perimetro;

    // instancia biblioteca Scanner
    Scanner scanner = new Scanner(System.in);

    //cadastrar novo atributo !!
    // isso é um metodo (function)
    public boolean cadastrarCirculo (){
        System.out.println("/*************************************************************************************/");
        System.out.println("/*                                  Cadatro Circulo                                  */");
        System.out.println("/*************************************************************************************/");
        System.out.println("Informe o raio do circulo");
        raio = scanner.nextDouble();
        System.out.println("Circulo Cadastrado com Sucesso");
        System.out.println("/*************************************************************************************/");
        return true;
    }

    // metodo para calcular Area
    public void calcularArea (){
        System.out.println("/* Calculando area */");

        //area = 3.14159 * (raio * raio);

        area = Math.PI * (raio * raio);

        //area = Math.PI * Math.pow(raio, 2);
    }

    public void calcularPerimetro () {
        System.out.println("/* Calculando o Perimetro */");

        perimetro = 2 * Math.PI * raio;

    }
}