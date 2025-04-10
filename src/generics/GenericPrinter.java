package src.generics;

public class GenericPrinter <T>{
    private T whatToPrint;

    GenericPrinter(T whatToPrint){
        this.whatToPrint = whatToPrint;
    }

    public void print(){
        System.out.println(whatToPrint);
    }
}
