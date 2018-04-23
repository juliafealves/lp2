package lab1;

import java.util.Scanner;

public class FuncaoMonotona {
    private static final int QUANTIDADE_PADRAO = 4;
    /**
     * Classe principal.
     * @param args
     */
    public static void main(String[] args){
        int quantidadeNumeros = QUANTIDADE_PADRAO;
        /**
         * Caso usuário informe uma quantidade números a serem lidos.
         */
        if(args.length != 0 ){
            quantidadeNumeros = Integer.parseInt(args[0]);
        }

        int[] numeros = lerNumeros(quantidadeNumeros);
        String mensagem = "FUNCAO NAO ESTRITAMENTE CRES/DECR";

        if(verificarCrescente(numeros)){
            mensagem = "POSSIVELMENTE ESTRITAMENTE CRESCENTE";
        } else if(verificarDecrescente(numeros)){
            mensagem = "POSSIVELMENTE ESTRITAMENTE DECRESCENTE";
        }

        imprimirMensagem(mensagem);
    }

    /**
     * Verifica se um conjunto de números é crescente.
     * @param numeros
     * @return
     */
    private static boolean verificarCrescente(int[] numeros){
        for(int i = 0; i < (numeros.length - 1); i++){
            if(!(numeros[i] < numeros[i + 1])){
                return false;
            }
        }

        return true;
    }

    /**
     * Verifica se um conjunto de números é descrecente.
     * @param numeros
     * @return
     */
    private static boolean verificarDecrescente(int[] numeros){
        for(int i = 0; i < (numeros.length - 1); i++){
            if(!(numeros[i] > numeros[i + 1])){
                return false;
            }
        }

        return true;
    }

    /**
     * Ler todos os números via console.
     * @param quantidadeNumeros
     * @return
     */
    private static int[] lerNumeros(int quantidadeNumeros){
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[quantidadeNumeros];

        for(int i = 0; i < quantidadeNumeros; i++){
            numeros[i] = scanner.nextInt();
        }

        return numeros;
    }

    /**
     * Exibe uma mensagem no console.
     * @param mensagem
     */
    private static void imprimirMensagem(String mensagem){
        System.out.println(mensagem);
    }
}
