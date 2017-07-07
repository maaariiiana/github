import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Este código não funciona
 *
 * @author aluno
 */
public class Teste3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=0, b, c=0, x = 0, y = 1, z, w = 0, soma=0, i = 0, g = 0, base, n;

        while (a < 4) {

            System.out.print("Apresentar os números da série Fibonacci=====1\n");
            System.out.print("Apresentar números primos====2\n");
            System.out.print("Apresentar números perfeitos====3\n");
            System.out.print("Sair do Programa====4\n");
            String yolo = JOptionPane.showInputDialog("confirme a sua opção:/n");
            a = Integer.parseInt(yolo);
        
                System.out.print("Yolo =" + yolo);
            
            if (a == 1) {
                System.out.print("Fala ae o Intervalo, de 0 a algum número:\n");
                String barra = JOptionPane.showInputDialog("Digite:/n");
                c = Integer.parseInt(barra);
                        System.out.print("Barra =" + barra);
                char umChar = barra.charAt(0);

                while (soma <= c) {

                    soma = x + y;
                    x = y;
                    y = soma;
                    System.out.println(soma);
                    soma++;
                    if (soma >= c) {
                        return;
                    }
                }
            }

            if (a == 2) {
                i = 3;
                System.out.print("Digite o número:");
                String zero = JOptionPane.showInputDialog("Digite:/n");
                b = Interger.parseInt(zero);
                for (soma = 2; soma <= b;) {
                    for (x = 2; x <= i - 1; x++) {
                        if (i % x == 0) {
                            break;
                        }
                        if (x == i) {
                            System.out.println(i);
                            System.out.print("Valor de i" + i);
                            System.out.print("i é" + i + "! =D\n");
                            //printf("%d, %d" i,a);
                            System.out.println(i + "," + a);
                            soma++;
                        }
                        i++;
                    }
                }
            }

            if (a == 3) {
                i = 0;
                System.out.print("digite:");
                String save = JOptionPane.showInputDialog("Digite:/n");
                n =  Interger.parseInt(save);
                 
                for (i = 1; i <= n; i++) {
                    soma = 0;
                    for (x = 1; x < i; x++) {
                        if (i % x == 0) {
                            soma += x;
                        }
                    }

                    if (soma == i) {
                        {
                            System.out.println(i);
                        }
                    }
                }
            }
        }
        return;
        // TODO code application logic here
    }

}

