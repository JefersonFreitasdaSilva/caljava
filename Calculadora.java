import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        char operador;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        System.out.println("Digite a operação desejada (+, -, *, /): ");
        operador = scanner.next().charAt(0);

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("O resultado da soma é: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("O resultado da subtração é: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("O resultado da multiplicação é: " + resultado);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Não é possível dividir por zero.");
                } else {
                    resultado = num1 / num2;
                    System.out.println("O resultado da divisão é: " + resultado);
                }
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }
        scanner.close();
    }
}