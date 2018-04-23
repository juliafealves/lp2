package lab1;

import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * @author Júlia Fernandes Alves (117211383)
 * julia.alves@ccc.ufcg.edu.br
 */
public class DobroTriplo {
    /**
     * Média principal.
     * @param args
     */
    public static void main(String[] args) {
        int numero = lerNumero();
        int dobro = calcularDobro(numero);
        int triplo = calcularTriplo(numero);
        String mensagem = "dobro: " + dobro + ", triplo: " + triplo;
        imprimirMensagem(mensagem);
    }

    /**
     * Retorna o dobro de um número.
     * @param numero
     * @return int
     */
    private static int calcularDobro(int numero){
        return numero * 2;
    }

    /**
     * Retorna o triplo de um número.
     * @param numero
     * @return int
     */
    private static int calcularTriplo(int numero){
        return numero * 3;
    }

    /**
     * Exibe uma mensagem no console.
     * @param mensagem
     */
    private static void imprimirMensagem(String mensagem){
        System.out.println(mensagem);
    }

    /**
     * Ler um número informado pelo usuário.
     * @return int
     */
    private static int lerNumero(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
