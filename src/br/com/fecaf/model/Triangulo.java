package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {

    public double base, lado2, lado3, area, perimetro, altura;

    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo () {
        System.out.println("/*************************************************************************************/");
        System.out.println("/*                                 Cadatro Triangulo                                 */");
        System.out.println("/*************************************************************************************/");
        System.out.println("Informe o lado1:              ");
        base = scanner.nextDouble();
        System.out.println("Informe o lado 2:             ");
        lado2 = scanner.nextDouble();
        System.out.println("Informe o lado 3:             ");
        lado3 = scanner.nextDouble();
        System.out.println(" Informe a altura:             ");
        altura = scanner.nextDouble();
        System.out.println("/* Triângulo cadastrado com sucesso !");
        System.out.println("/*************************************************************************************/");

        return true;


    }

    public void calcularArea (){
        System.out.println("/*************************************************************************************/");
        System.out.println("/*                                   Calculando area                                 */");
        System.out.println("/*************************************************************************************/");
        area = (base * altura) / 2 ;
        System.out.println("A area é : " + area);
        System.out.println("/*************************************************************************************/");
    }

    public void calcularPerimetro (){
        System.out.println("/*************************************************************************************/");
        System.out.println("/*         Calculando Perimetro      */");
        System.out.println("/*************************************************************************************/");
        perimetro = base + lado2 + lado3;
        System.out.println("A perimetro é : " + perimetro);
        System.out.println("/*************************************************************************************/");
    }

    // Isoseres / escaleno / equilatero
    public void definirTipo () {
        System.out.println("/*************************************************************************************/");
        System.out.println("/*                                    Definindo tipo                                 */");
        System.out.println("/*************************************************************************************/");

        if (base == lado2 && base == lado3 && lado2 == lado3) {

            System.out.println("Este é Triangulo é um Equilatero....");

        } else if (base != lado2 && base != lado3 && lado2 != lado3){

            System.out.println("Este é um Triangulo Escaleno");

        } else {

            System.out.println("Este Triangulo é um Isoceles");

        }
        System.out.println("/*************************************************************************************/");
    }


    // isto aqui é para validar se é triangulo retanulo
    public void verificarTrianguloRetangulo() {
        System.out.println("/*************************************************************************************/");
        System.out.println("/*                               Verificando Triângulo                               */");
        System.out.println("/*************************************************************************************/");

        // no primeiro passo, assumir que lado1 é a hipotenusa
        double hipotenusa = base;
        double cateto1 = lado2;
        double cateto2 = lado3;

        // Se lado2 for maior, ele se torna a hipotenusa
        if (lado2 > hipotenusa) {
            hipotenusa = lado2;
            cateto1 = base;
            cateto2 = lado3;
        }

        // Se lado3 for maior, ele se torna a hipotenusa
        if (lado3 > hipotenusa) {
            hipotenusa = lado3;
            cateto1 = base;
            cateto2 = lado2;
        }

        // Verificar se a  condição do Teorema de Pitágoras para identificar um triângulo retângulo
        if (hipotenusa * hipotenusa == cateto1 * cateto1 + cateto2 * cateto2) {
            System.out.println("O triângulo é retângulo. este triangulo é um tipo 3,4,5 ");
        } else {
            System.out.println("O triângulo NÃO é retângulo.");
        }
    }

}
