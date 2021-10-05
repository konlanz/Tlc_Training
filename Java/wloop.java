import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class wloop {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String IsOnRepeat;
       Boolean repeat = true;

       IsOnRepeat = input.nextLine();
       while(repeat){
           System.out.println("this is on repeat");
           System.out.println("Do you want to exit the loop");
           IsOnRepeat = input.nextLine();
           input.close();
           if(IsOnRepeat.equals("yes")){
               System.out.println("next song bro");
               break;
           }
           
       }

    }
}
