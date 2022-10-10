/*
 * Crie um programa que gera um exception sempre que executado,
 * pegue essa exception em um Catch e print a mensagem de erro.
 * */
public class Exercicio7 {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = a / a; // throw-> acontece quando temos erros
            System.out.println("aa");
        } catch (Exception e) {
            System.out.println("Erro na divisão");
            throw e;
        }
    }
}
    