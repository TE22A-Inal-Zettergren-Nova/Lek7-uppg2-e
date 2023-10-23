import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        System.out.println("Hur gammal är du?");
        int ålder = tb.nextInt();
        System.out.println("Är du medlem? true/false");
        boolean medlem = tb.nextBoolean();
        

        if(ålder>=18 || medlem==true){
            System.out.println("Välkommen, du får komma in");
        }
        else{
            System.out.println("Du får inte komma in");
        }
    }
}
