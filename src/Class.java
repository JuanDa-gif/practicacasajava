import java.util.Scanner;

public class Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float precioCamisa = 25.0f;
        float precioPantalon = 30.0f;
        float descuento = 0.15f;
        float CamisaDescuento = precioCamisa * (1 - descuento);
        float pantalonDescuento = precioPantalon * (1 - descuento);
        float SegundaCamisa = CamisaDescuento * (1 - 0.05f);
        float total = CamisaDescuento + pantalonDescuento + SegundaCamisa;

        System.out.println("El total de la camisa es: " + total);
        scanner.close();
    }
}
