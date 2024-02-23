import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        String passw="requisiti";
        Scanner in =new Scanner (System.in);

        do{
            if (!passw.equalsIgnoreCase("requisiti"))
                System.out.println("\npassword insicura; scegline un'altra (per visualizzare i requisiti digita: requisiti)\n");
            else
                System.out.println("inserisci una password (per visualizzare i requisiti digita: requisiti)\n");
            passw=in.nextLine();

            if (passw.equalsIgnoreCase("requisiti"))
                System.out.println("\n la password deve avere almeno: \n-12 caratteri \n-una maiuscola \n-una minuscola \n-un numero \n-un carattere speciale \n");

        }while(!isPrivate(passw));
        System.out.println("\npassword sicura");
    }

    private static boolean isPrivate(String password){
        boolean minuscola=false;
        boolean maiuscola=false;
        boolean numeri=false;
        boolean charSpeciali=false;
        boolean lunghezza=false;

        //codice ASCII

        for (int i=0; i<password.length();i++){
            
            if (password.charAt(i)>=65 && password.charAt(i)<=90) {
                maiuscola = true;
            }

            if (password.charAt(i) >= 97 && password.charAt(i)<=122){
                minuscola = true;
            }

            if (password.charAt(i)>=48 && password.charAt(i)<=57){
                numeri = true;
            }

            if (password.charAt(i)>=33 && password.charAt(i)<=46){
                charSpeciali = true;
            }
            
        }

        if (password.length()>=12)
            lunghezza=true;

        if (maiuscola && minuscola && numeri && charSpeciali && lunghezza)
            return true;
        else
            return false;

    }
}