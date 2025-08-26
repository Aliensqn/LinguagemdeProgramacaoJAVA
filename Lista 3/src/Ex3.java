import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        int a, b, c, d, e;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor de a: ");
        a = sc.nextInt();
        System.out.println("Informe o valor de b: ");
        b = sc.nextInt();
        System.out.println("Informe o valor de c: ");
        c = sc.nextInt();
        System.out.println("Informe o valor de d: ");
        d = sc.nextInt();
        System.out.println("Informe o valor de e: ");
        e = sc.nextInt();

        //estrutura de repetição
        int aux;
        for(int i = 1; i <= 4; i++){
            if (a > b){
                aux = a; a = b; b = aux;
            }
            if (b > c){
                aux = b; b = c; c = aux;
            }
            if (c > d){
                aux = c; c = d; d = aux;
            }
            if (d > e){
                aux = d; d = e; e = aux;
            }
        } //Fim do for
        System.out.println("Elementos ordenados: " + a + " " + b + " " + c + " " + d + " " + e);


    }
}
