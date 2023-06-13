import java.util.Scanner;

public class Iva {
    public static void main(String[] args){
        Scanner lee = new Scanner(System.in);
        double iva = 1.21;
        System.out.println("De el precio del producto: ");
        double precio = lee.nextDouble();
        double res = precio * iva;
        System.out.println("El precio final es de:" +res);
    }
}
