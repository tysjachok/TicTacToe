
import java.util.*;

public class Player extends Field  {

    Scanner paste = new Scanner(System.in);

    public static String name;
    public static char symbol;
    private static final int MAX_LENGTH = 10;
    private static final int MIN_LENGTH = 3;


    public Player(char newSymbol) {
        symbol = newSymbol;
    }

    public String getName(){
        return name;
    }

    public void setName() {
        name = paste.next();
        if (name.length() < MIN_LENGTH) {
             System.out.println("Ім'я " + getName() + " - надто коротке! Довжина повинна бути не менше 3 символів!");
             setName();
                   }

             if (name.length() > MAX_LENGTH) {
                 System.out.println("Ім'я " + getName() + " -  надто довге! Довжина повинна бути не більше 10 символів!");
                 setName();

             }
    }



}
