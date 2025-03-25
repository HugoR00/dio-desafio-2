import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contador contador = new Contador();

        System.out.print("Digite o primeiro número: ");
        contador.setNumeroUm(sc.nextInt());
        System.out.print("Digite o segundo número: ");
        contador.setNumeroDois(sc.nextInt());

        try{
            contador.contar(contador.getNumeroUm(),contador.getNumeroDois());
        }catch(ParametrosInvalidosException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}