package src.generics;

import java.util.Arrays;

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

        testingGenericSwap();
        System.out.println(boundedTypeParamterGenericMethod(1.1f, 2.3f));
        System.out.println(boundedTypeParamterGenericMethod(1, 2));
        System.out.println(boundedTypeParamterGenericMethod(1000L, 2000000L));

        multiParameterGenericMethod(1, "String", 5.55D);
        multiParameterGenericMethod(10000L, 'r', 3.14f);



        // My own Stack Data type implementing LIFO
        MyStack<String> stringLIFO = new MyStack<>();
        System.out.println(stringLIFO.peek());
        System.out.println(stringLIFO.isEmpty());

        stringLIFO.push("First");
        stringLIFO.push("Second");
        stringLIFO.push("Third");
        stringLIFO.push("Fourth");

        System.out.println(stringLIFO.isEmpty());
        System.out.println(stringLIFO.peek());
        System.out.println(stringLIFO.pop());
        
    }

    public static void testingGenericSwap(){
        Integer[] intArr = {1,2,3,4,5,6};
        System.out.println("Array values before swapping: " + Arrays.toString(intArr));
        genericSwapMethod(intArr, 1, 2);
        System.out.println("Array after before swapping: " + Arrays.toString(intArr));

        String[] strArr = {"Apple","Banana", "Cherry"};
        System.out.println("Array values before swapping: " + Arrays.toString(strArr));
        genericSwapMethod(strArr, 1, 2);
        System.out.println("Array after before swapping: " + Arrays.toString(strArr));


    }


    public static <T> void genericSwapMethod(T[] arr, int index1, int index2){
        T temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }

    public static <T,U,V> void multiParameterGenericMethod(T varT, U varU, V varV){
        System.out.println("Variable T: " +  varT + " Is of type: " + varT.getClass().getSimpleName());
        System.out.println("Variable U: " + varU + " Is of type: " + varU.getClass().getSimpleName());
        System.out.println("Variable V: " + varV + " Is of type: " + varV.getClass().getSimpleName());
    }

    public static <T extends Number> double boundedTypeParamterGenericMethod(T num1, T num2){
        return num1.doubleValue() + num2.doubleValue();
    }
}
