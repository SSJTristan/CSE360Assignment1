package cse360assignment02;


public class AddingMachine {
    private int total;
    private String memory;


    public AddingMachine () {
        total = 0;  // not needed - included for clarity
        memory = "0 "; //instantiates memory to hold the orig value of total
    }

    public int getTotal () {
        return 0;
    }

    public void add (int value) {
        total += value; //adds the value
        memory += " + " + value;
    }

    public void subtract (int value) {
        total -= value; //adds the value
        memory += " - " + value;
    }

    public String toString () {
        return memory;
    }

    public void clear() {
        memory = "0 ";
    }
}
