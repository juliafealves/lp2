package lab1;

import java.util.Scanner;
/**
 * Laboratório de Programação 2 - Lab 1
 * @author Júlia Fernandes Alves (117211383) julia.alves@ccc.ufcg.edu.br
 */
public class Calculadora {
    private static final String SOMA = "+";
    private static final String SUBSTRACAO = "-";
    private static final String DIVISAO = "/";
    private static final String MULTIPLICACAO = "*";

    /**
     * Classe principal.
     * @param args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String operacao = scanner.nextLine();

        if(!verificarOperacaoValida(operacao)){
            imprimirMensagem("ENTRADA INVALIDA");
        }else{
            try{
                float numero1 = lerNumero(scanner);
                float numero2 = lerNumero(scanner);
                float resultado = calcular(operacao, numero1, numero2);
                imprimirMensagem("RESULTADO: " + resultado);
            }catch (ArithmeticException arithmeticException){
                imprimirMensagem("ERRO");
            }
        }
    }

    /**
     * Calcula de acordo com a operação informada.
     *
     * @param operacao
     * @param numero1
     * @param numero2
     * @return
     */
    private static float calcular(String operacao, float numero1, float numero2){
        float resultado;

        switch (operacao){
            case SOMA:
                resultado = calcularSoma(numero1, numero2);
                break;
            case SUBSTRACAO:
                resultado = calcularSubtracao(numero1, numero2);
                break;
            case DIVISAO:
                resultado = calcularDivisao(numero1, numero2);
                break;
            default:
                resultado = calcularMultiplicacao(numero1, numero2);
                break;
        }

        return resultado;
    }

    /**
     * Verifica se a operação informada é válida.
     * @param operacao
     * @return
     */
    private static boolean verificarOperacaoValida(String operacao){
        return (operacao.equals(SOMA)) || (operacao.equals(SUBSTRACAO)) || (operacao.equals(DIVISAO)) || (operacao.equals(MULTIPLICACAO));
    }

    /**
     * Calcula a divisão entre dois números.
     * @param numero1
     * @param numero2
     * @return
     */
    private static float calcularDivisao(float numero1, float numero2){
        if(numero2 == 0){
            throw new ArithmeticException("Não pode dividir por zero.");
        }

        return numero1 / numero2;
    }

    /**
     * Calcula a multiplicação entre dois números.
     * @param numero1
     * @param numero2
     * @return
     */
    private static float calcularMultiplicacao(float numero1, float numero2){
        return numero1 * numero2;
    }

    /**
     * Calcula a soma entre dois números.
     * @param numero1
     * @param numero2
     * @return
     */
    private static float calcularSoma(float numero1, float numero2){
        return numero1 + numero2;
    }

    /**
     * Calcula a subtração entre dois números.
     * @param numero1
     * @param numero2
     * @return
     */
    private static float calcularSubtracao(float numero1, float numero2){
        return numero1 - numero2;
    }

    /**
     * Ler um número Float via console.
     * @param scanner
     * @return
     */
    private static float lerNumero(Scanner scanner){
        return scanner.nextFloat();
    }

    /**
     * Exibe uma mensagem no console.
     * @param mensagem
     */
    private static void imprimirMensagem(String mensagem){
        System.out.println(mensagem);
    }
}
