package src.generics;

public class BoundedGenericPrinter<T extends Number> {
    private T whatToPrint;

    BoundedGenericPrinter(T whatToPrint){
        this.whatToPrint = whatToPrint;
    }

    public void print(){
        System.out.println(whatToPrint);
    }
}
