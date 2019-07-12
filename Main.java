import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter email");
        String s = in.nextLine();

        while(!s.equals("q")){
            MailValidator mv=new MailValidator(s);
            if(mv.check()){
                System.out.println("Email is accepted.");
                break;
            }
            else{
                System.out.println("\nWrong format. Try again!");
                s = in.nextLine();
            }

        }

        System.out.println("BYE");
    }


}
