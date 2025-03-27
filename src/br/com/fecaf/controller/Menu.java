package br.com.fecaf.controller;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import br.com.fecaf.model.Triangulo;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void executarMenu () {

        boolean exit = false;

        while (!exit) {
            System.out.println("/*************************************************************************************/");
            System.out.println("/*                                      Geometria                                    */");
            System.out.println("/*************************************************************************************/");
            System.out.println("/*                                    1 - Circulo                                    */");
            System.out.println("/*                                    2 - Retangulo                                  */");
            System.out.println("/*                                    3 - Triângulo                                  */");
            System.out.println("/*                                    4 - Sair                                       */");
            System.out.println("/*************************************************************************************/");


            System.out.println("Informe a opção desejada: ");
            int optionUsuer = scanner.nextInt();

            switch (optionUsuer) {
                case 1:

                    boolean exitCirculo = false;

                    while (!exitCirculo) {


                        System.out.println("/*************************************************************************************/");
                        System.out.println("/*********************************       Circulo      *********************************");
                        System.out.println("/*************************************************************************************/");
                        System.out.println("/*                                 1 - Cadastar Circulo                              */");
                        System.out.println("/*                                 2 - Calcular Area                                 */");
                        System.out.println("/*                                 3 - Calcular Perimetro                            */");
                        System.out.println("/*                                 4-  Sair do Circulo                               */");
                        System.out.println("/*************************************************************************************/");
                        System.out.println("Informe a opção desejada   ");

                        int optionCirculo = scanner.nextInt();

                        Circulo circulo = new Circulo();

                        boolean validaCadastro = false;

                        switch (optionCirculo) {
                            case 1:
                                 validaCadastro = circulo.cadastrarCirculo();
                                break;
                            case 2:
                                if (validaCadastro) {
                                    circulo.calcularArea();
                                }
                                break;
                            case 3:
                                if (validaCadastro) {
                                    circulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um circulo");
                                }
                            case 4:
                                System.out.println("Saindo do circulo");
                                exitCirculo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção Válida !");
                        }
                    }
                    break;
                case 2:

                    boolean exitRetangulo = false;

                    Retangulo retangulo = new Retangulo();

                    boolean validaRetangulo = false;


                    while (!exitRetangulo) {

                        System.out.println("/*************************************************************************************/");
                        System.out.println("/********************************       Retangulo      ********************************");
                        System.out.println("/*************************************************************************************/");
                        System.out.println("/*                                1 - Cadastar Retangulo                             */");
                        System.out.println("/*                                2 - Calcular Area                                  */");
                        System.out.println("/*                                3 - Calcular Perimetro                             */");
                        System.out.println("/*                                4 - Definir se é um Quadrado                       */");
                        System.out.println("/*                                5 - Sair do Retangulo                              */");
                        System.out.println("/*************************************************************************************/");
                        System.out.println("Informe a opção desejada   ");

                        int optionRetangulo = scanner.nextInt();

                        switch (optionRetangulo) {
                            case 1:
                                validaRetangulo = retangulo.cadastrarReangulo();
                                break;
                            case 2:
                                if (validaRetangulo){
                                    retangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um retangulo");
                                }
                                break;
                            case 3:
                                if (validaRetangulo) {
                                    retangulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Retangulo");
                                }
                                break;
                            case 4:
                                if (validaRetangulo)
                                    retangulo.verificarSeQuadrado();
                                else {
                                    System.out.println("Cadastre um retângulo primeiro!");
                                }
                                break;
                            case 5:
                                System.out.println("Saindo do retangulo");
                                exitRetangulo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção valida");
                        }
                    }


                    break;
                case 3:
                    boolean exitTriangulo = false;

                    Triangulo triangulo = new Triangulo();

                    boolean validaTriangulo = false;

                    while (!exitTriangulo) {

                        System.out.println("/*************************************************************************************/");
                        System.out.println("/********************************       Triângulo      ********************************");
                        System.out.println("/*************************************************************************************/");
                        System.out.println("/*                                1 - Cadastar Triângulo                             */");
                        System.out.println("/*                                2 - Calcular Area                                  */");
                        System.out.println("/*                                3 - Calcular Perimetro                             */");
                        System.out.println("/*                                4 - Definir qual é o tipo                          */");
                        System.out.println("/*                                5 - Verificar se o Triângulo é Retângulo           */");
                        System.out.println("/*                                6 - Sair do Triângulo                              */");
                        System.out.println("/*************************************************************************************/");
                        System.out.println("Informe a opção desejada   ");

                        int optionTriangulo = scanner.nextInt();

                        switch (optionTriangulo) {
                            case 1:
                                validaTriangulo = triangulo.cadastrarTriangulo();
                                break;
                            case 2:
                                if (validaTriangulo) {
                                    triangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um triangulo");
                                }
                                break;
                            case 3:
                                if (validaTriangulo) {
                                    triangulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um triangulo");
                                }
                                break;
                            case 4:
                                if (validaTriangulo)
                                    triangulo.definirTipo();
                                else {
                                    System.out.println("Cadastre um triangulo primeiro!");
                                }
                            case 5:
                                if (validaTriangulo) {
                                    triangulo.verificarTrianguloRetangulo();
                                } else {
                                    System.out.println("Cadastre um triangulo primeiro!");
                                }
                                break;
                            case 6:
                                System.out.println("Saindo do triangulo");
                                exitTriangulo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção valida");
                        }
                    }

                    break;
                case 4:
                    System.out.println("Até mais ...");
                    exit = true; // nesta parte eu fiz um finalizamento do loop do menu
                    break;
                default:
                    System.out.println("Escolha uma opção valida");
            }

        }
    }

}
