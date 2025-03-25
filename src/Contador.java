import java.util.Scanner;

public class Contador {

    private Integer numeroUm;
    private Integer numeroDois;


    public Integer getNumeroUm() {
        return numeroUm;
    }

    public void setNumeroUm(Integer numeroUm) {
        this.numeroUm = numeroUm;
    }

    public Integer getNumeroDois() {
        return numeroDois;
    }

    public void setNumeroDois(Integer numeroDois) {
        this.numeroDois = numeroDois;
    }

    static void contar(Integer numeroUm, Integer numeroDois) throws ParametrosInvalidosException{
        if (numeroUm > numeroDois){
            throw new ParametrosInvalidosException("Primeiro número não pode ser maior que o segundo");
        }
        int contagem = numeroDois - numeroUm;
        for(int i = 0; i <= contagem; i++){
            System.out.println(i);
        }
    }

}
