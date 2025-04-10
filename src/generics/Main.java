package src.generics;

public class Main {
    public static void main(String[] args){
        GenericPrinter<String> stringPrinter = new GenericPrinter<>("This is a string");
        GenericPrinter<Integer> integerPrinter = new GenericPrinter<>(1995);
        GenericPrinter<Float> floatPrinter = new GenericPrinter<>(5.8f);
        GenericPrinter<Double> doublePrinter = new GenericPrinter<>(1234.66);

        stringPrinter.print();
        integerPrinter.print();
        floatPrinter.print();
        doublePrinter.print();

        BoundedGenericPrinter<Integer> bIntergerPrinter = new BoundedGenericPrinter<>(1999);
        bIntergerPrinter.print();
    }
}
