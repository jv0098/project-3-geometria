package br.com.fecaf.model;

import java.util.Scanner;

public class Retangulo {
    public double lado1, lado2, area, perimetro;

    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarReangulo(){
        System.out.println("/*************************************************************************************/");
        System.out.println("/*                                    Cadastrar Retangulo                            */");
        System.out.println("/*************************************************************************************/");
        System.out.println("Informe o lado 1: ");
        lado1 = scanner.nextDouble();
        System.out.println("Informe o lado 2: ");
        lado2 = scanner.nextDouble();
        System.out.println("Retangulo Cadastrado com sucesso");
        System.out.println("/***********************/");

        return true;
    }





    public void calcularArea(){
        System.out.println("/* Calculando Area */");
        area = lado1 *lado2;
        System.out.println(" A area é: " + area);
    }

    public void calcularPerimetro(){
        System.out.println("/* Calculando Perimetro */");
        perimetro = lado1 * lado2 * 2;
        System.out.println(" O perimetro é:" + perimetro);
    }



    //define se é um quadrado

    public boolean verificarSeQuadrado() {
        System.out.println("/* Verificando se é um quadrado */");
        if (lado1 == lado2) {
            System.out.println(" Isto é um quadrado.");
            return true;
        }
        System.out.println(" Não é um quadrado...");
        return false;

    }


}
