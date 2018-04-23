package lab1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * @author Júlia Fernandes Alves (117211383)
 * julia.alves@ccc.ufcg.edu.br
 */
public class AlunosNotas {
    private static final int MEDIA_APROVACAO = 700;
    private static final String CARACTER_CORINGA = "-";

    /**
     * Método principal.
     * @param args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int[] notas = new int[1];

        while(true){
            String[] entradas = scanner.nextLine().split(" ");

            if(entradas[0].equals(CARACTER_CORINGA)){
                break;
            }

            notas = Arrays.copyOf(notas, i + 1);
            notas[i] = Integer.parseInt(entradas[1]);
            i++;
        }

        imprimirMensagem("maior: " + obterMaiorNota(notas));
        imprimirMensagem("menor: " + obterMenorNota(notas));
        imprimirMensagem("media: " + calcularMedia(notas));
        imprimirMensagem("acima: " + contarNotasAcima(notas));
        imprimirMensagem("abaixo: " + contarNotasAbaixo(notas));
    }

    /**
     * Calcula a média das notas.
     * @param notas
     * @return
     */
    private static int calcularMedia(int[] notas){
        int soma = 0;

        for (int i = 0; i < notas.length; i++){
            soma += notas[i];
        }

        return (soma / notas.length);
    }

    /**
     * Conta a quantidade de notas abaixo da média de aprovação.
     * @param notas
     * @return
     */
    private static int contarNotasAbaixo(int[] notas){
        int contar = 0;

        for(int i = 0; i < notas.length; i++) {
            if (notas[i] < MEDIA_APROVACAO){
                contar++;
            }
        }

        return contar;
    }

    /**
     * Conta a quantidade de notas acima da média de aprovação.
     * @param notas
     * @return
     */
    private static int contarNotasAcima(int[] notas){
        int contar = 0;

        for(int i = 0; i < notas.length; i++) {
            if (notas[i] >= MEDIA_APROVACAO){
                contar++;
            }
        }

        return contar;
    }

    /**
     * Exibe uma mensagem no console.
     * @param mensagem
     */
    private static void imprimirMensagem(String mensagem){
        System.out.println(mensagem);
    }

    /**
     * Retorna a maior nota da coleção.
     * @param notas
     * @return
     */
    private static int obterMaiorNota(int[] notas){
        int maior = notas[0];

        for(int i = 1; i < notas.length; i++){
            maior = Math.max(notas[i], maior);
        }

        return maior;
    }

    /**
     * Retorna a maior nota da coleção.
     * @param notas
     * @return
     */
    private static int obterMenorNota(int[] notas){
        int menor = notas[0];

        for(int i = 0; i < notas.length; i++){
            menor = Math.min(menor, notas[i]);
        }

        return menor;
    }
}
