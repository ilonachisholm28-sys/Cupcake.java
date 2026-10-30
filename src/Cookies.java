import javax.swing.*;

public class Cookies {
    public boolean IsChocolateChips;
    public int NumberOfCookies;
    public String KindOfChocolateChips;

    public Cookies (int pNumberOfCookies, boolean pIsChocolateChips, String pKindOfChocolateChips){
        NumberOfCookies = pNumberOfCookies;
        IsChocolateChips = pIsChocolateChips;
        KindOfChocolateChips = pKindOfChocolateChips;
}
    public void printInfo(){
        System.out.println("the cookie's information is ");
        System.out.println("there is " + NumberOfCookies);
        System.out.println("chocolqte chips are in the cookies " + IsChocolateChips);
        System.out.println("the kind of chocolate chips are " + KindOfChocolateChips);
}

}
