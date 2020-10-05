import cse360assignment02.AddingMachine;

public class main {
    public static void main(String[]args){
        AddingMachine myCalc = new AddingMachine();
        myCalc.add(4);
        myCalc.subtract(2);
        myCalc.add(5);
        System.out.println(myCalc.toString());
    }
}
