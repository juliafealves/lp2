package lab1;

import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * @author Júlia Fernandes Alves (117211383)
 * julia.alves@ccc.ufcg.edu.br
 */
public class AcimaMedia {
    /**
     * Método principal.
     * @param args
     */
    public static void main(String[] args){
        int[] numeros = lerNumeros();
        float media = calcularMedia(numeros);
        imprimirNumerosMaioresMedia(numeros, media);
    }

    /**
     * Calcula a média aritmética de uma lista de números.
     * @param numeros
     * @return
     */
    private static float calcularMedia(int[] numeros){
        float total = 0;

        for (int i = 0; i < numeros.length; i++){
            total += numeros[i];
        }

        return total / numeros.length;
    }

    /**
     * Imprime todos os números da coleção menores que a média.
     * @param numeros
     * @param media
     */
    private static void imprimirNumerosMaioresMedia(int[] numeros, float media){
        String numerosSelecionados = "";

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > media){
                numerosSelecionados += numeros[i] + " ";
            }
        }

        System.out.println(numerosSelecionados.trim());
    }

    /**
     * Ler todos os números via console.
     * @return
     */
    private static int[] lerNumeros(){
        Scanner scanner = new Scanner(System.in);
        String[] entradas = scanner.nextLine().split(" ");
        int[] numeros = new int[entradas.length];

        for(int i = 0; i < entradas.length; i++){
            numeros[i] = Integer.parseInt(entradas[i]);
        }

        return numeros;
    }
}
