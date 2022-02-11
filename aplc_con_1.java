import java.util.Scanner;

public class aplc_con_1 {
    public static void main(String[] args) {
        System.out.println("1-média entre os números digitados\n2-diferença do maior pelo menor\n3-multiplicação dos números digitados\n4-divisão do primeiro pelo segundo\n5-Sair");
        int op;
        double n1,n2;
        Scanner entrada = new Scanner(System.in);
        while (true){
            op = entrada.nextInt();
            if (op==5)
                break;
            if (op < 1 || op >5){
                System.out.println("OPÇÃO INVÁLIDA");
                continue;
            }
            switch(op){
                case 1:
                    n1 = entrada.nextDouble(); n2 = entrada.nextDouble();
                    System.out.println((n1+n2)/2);
                    break;
                case 2:
                    n1 = entrada.nextDouble(); n2 = entrada.nextDouble();
                    if (n1>n2) {
                        System.out.println(n1-n2);
                        break;
                    }
                    if (n2>=n1){
                        System.out.println(n2-n1);
                        break;
                    }
                case 3:
                    n1 = entrada.nextDouble(); n2 = entrada.nextDouble();
                    System.out.println(n1*n2);
                    break;
                case 4:
                    n1 = entrada.nextDouble(); n2 = entrada.nextDouble();
                    if (n2==0){
                        System.out.println("NÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO");
                        break;}
                    System.out.println(n1/n2);
                    break;
            }

        }

    }
}
