public class Pumpkin {
    public String color;
    public int size;
    public boolean isJackolantern;

    //special method: constructor
    //name has to match the class name
    //do not use void
    //strings - hold words, puncutation, sentences
    //clases r also similar to variabkes w big container that has smaller tupperware inside of it
    //constructer put value into boxes

    public Pumpkin (int pSize, boolean pIsJackolantern, String pColor){
        color = pColor;
        size = pSize;
        isJackolantern = pIsJackolantern;
    }


    //class is like blueprints that will make things

    //instance variables
    //todo: turn these ideas into varaibles. What data types we need?
    //color
    //size
    //is Jackolantern
    public void printInfo(){
        System.out.println("the pumpkin's information is  ");
        System.out.println(size);
        System.out.println("the pumpkin's color is " + color); //readable
        System.out.println("isJackolantern " + isJackolantern);
    }
}
