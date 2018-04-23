package lab1;

import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * @author Júlia Fernandes Alves (117211383) julia.alves@ccc.ufcg.edu.br
 */
public class PassouMedia7 {

    private static final int VALOR_MEDIA = 7;

    /**
     * Média principal.
     * @param args
     */
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        float numero1 = lerNumero(scanner);
        float numero2 = lerNumero(scanner);
        float media = calcularMedia(numero1, numero2);

        String mensagem = "pass: False!";

        if (verificarMedia(media)){
            mensagem = "pass: True!";
        }

        imprimirMensagem(mensagem);
    }

    /**
     * Calcula a média de dois números.
     * @param numero1
     * @param numero2
     * @return
     */
    private static float calcularMedia(float numero1, float numero2){
        return (numero1 + numero2) / 2;
    }

    /**
     * Exibe uma mensagem no console.
     * @param mensagem - mensagem a ser exibida.
     */
    private static void imprimirMensagem(String mensagem){
        System.out.println(mensagem);
    }

    /**
     * Ler um número informado pelo usuário.
     * @return int
     */
    private static float lerNumero(Scanner scanner){
        return scanner.nextFloat();
    }

    /**
     * Verifica se a média é maior que o VALOR_MEDIA para passar.
     * @param media
     * @return
     */
    private static boolean verificarMedia(float media){
        return (media >= VALOR_MEDIA);
    }
}
