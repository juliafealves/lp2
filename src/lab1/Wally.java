package lab1;

import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * @author Júlia Fernandes Alves (117211383)
 * julia.alves@ccc.ufcg.edu.br
 */
public class Wally {
    private static final int TAMANHO_NOME = 5;
    private static final String NOME_CORINGA = "wally";

    /**
     * Método principal.
     * @param args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String[] nomes = scanner.nextLine().split(" ");

            if(nomes[0].equals(NOME_CORINGA)){
                break;
            }

            String nomeWally = localizarUltimoNomeTamanhoIgual(nomes);
            imprimirMensagem(nomeWally);
        }
    }

    /**
     * Localiza último nome que possui tamanho igual ao tamanho estabelecido.
     * @param nomes
     * @return
     */
    private static String localizarUltimoNomeTamanhoIgual(String[] nomes){
        String nomeWally = "?";

        for (int i = 0; i < nomes.length; i++) {
            if(nomes[i].length() == TAMANHO_NOME){
                nomeWally = nomes[i];
            }
        }

        return nomeWally;
    }

    /**
     * Exibe uma mensagem no console.
     * @param mensagem
     */
    private static void imprimirMensagem(String mensagem){
        System.out.println(mensagem);
    }
}
