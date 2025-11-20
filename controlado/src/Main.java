import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int popochos;

        System.out.println("¿Cuántos popochos tienes en casa?");
        popochos = scan.nextInt();

        if(popochos==0){
            System.out.println("Te recomiendo que consigas alguno...");
        } else if (popochos==1) {
            System.out.println("Ese popocho está muy mimado.");
        } else if (popochos==2 || popochos==3) {
            System.out.println("La familia de popochos está bien equilibrada.");
        } else if (popochos>3) {
            System.out.println("¡Son demasiados popochos! No quedará espacio para ti en la cama...");
        } else{
            System.out.println("Número de popochos no válido");
        }

        for (int i = 1; i <= popochos; i++) {
            System.out.println( "El popocho número " + i + " está: Zzz...Zzzzzzzzzz");
        }
    }
}