
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dell
 */
public class Pincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        Funcoes calcula = new Funcoes();

        int i = 0;
        while (i < 4) {

            System.out.print("Digite um Valor1");
            double val = sc.nextDouble();
            System.out.print("Digite um Valor2");
            double val2 = sc.nextDouble();

            System.out.println("Qual operação você deseja realizar?");
            System.out.println("1 soma  2 subtração 3 multiplicação ou  4 divisão");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(calcula.soma(val, val2));
                    break;
                case 2:
                    System.out.println(calcula.sub(val, val2));
                    break;
                case 3:
                    System.out.println(calcula.mult(val, val2));
                    break;
                case 4:
                    System.out.println(calcula.div(val, val2));
                    break;

                default:
                    System.out.println("Não temos essa opção");
                    break;
            }
            i++;
        }
        
        System.out.println("Testando o commit");
        System.out.println("colocando mais um commit para teste");
    }

}
