import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ange vad 10 ska delas");
        int var1 = 10;
        int var2 = 0;
        try{
            var2 = scan.nextInt();
        }
        catch(Exception e){
            System.out.println("Felaktig inmatning, använd siffror");
        }

        double svar = ((double)var1) / var2;
        System.out.println("10 delat med "+var2+" är "+ svar);
        scan.close();
        System.out.println();

        int[] fält = {6,3,5,9};
        
        for (int i = 0; i < fält.length; i++) {
            System.out.println("element nr "+i+" har värdet "+fält[i]);
        }

        /* //enligt uppgift
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("element nr "+i+" har värdet "+fält[i]);
            }
        }
        catch (Exception e){
            System.out.println("Du måste ändra till fält.lenght istället för 10.");
        }
         */
    }
}
