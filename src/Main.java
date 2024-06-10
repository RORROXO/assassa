import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        dinero cuenta=new dinero(0);

        System.out.println("Ingrese e monto inicial: ");
        int monto= in.nextInt();

        cuenta.depositar(100000);

        System.out.println("Cantidad de dinero en la cuenta" + cuenta.getSaldo());

        

    }
}