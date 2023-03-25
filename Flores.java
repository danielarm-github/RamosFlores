import java.util.Scanner;

public class Flores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double dinero;

        System.out.println("Digite su dinero par saber los ramos de flores que puede comprar.");
        dinero = entrada.nextDouble();

        if(dinero >= 70){
            int ramos = (int)dinero / 70;
            double resto = dinero % 70;

            if(ramos > 1){
                System.out.print("Podrá comprar " + ramos + " ramos de 70$ y le quedarán (" + resto + "$) ");
            }else{
                System.out.print("Podrá comprar " + ramos + " ramo de 70$ y le quedarán (" + resto + "$) ");
            }
        }else{
            System.out.println("No le alcanza el dinero para hacer la compra.");
        }

        if(dinero >= 120){
            int ramos = (int)dinero / 120;
            double resto = dinero % 120;

            if(ramos > 1){
                System.out.println("O " + ramos + " ramos de 120$ y le quedarán (" + resto + "$).");
            }else{
                System.out.println("O " + ramos + " ramo de 120$ y le quedarán (" + resto + "$).");
            }

        }else{
            System.out.println("No le alcanza el dinero para hacer la compra de ramos de 120$ .");
        }
        





    }
}
