package OOP;

public class Main {
    public static void main(String[] args) {
// Task 15
// Create a class SuperNumber that has one field of any type. Add methods which print the class name of that type. Bound types to extends Numerics and create methods that:

// return double value
// return int value
// check if double value == int value
// check if int value of other SuperNumber object is the same
// check if double value of other SuperNumber object is the same

        SuperNumber<Double> numberOne = new SuperNumber<>(25.0);
        SuperNumber<Integer> numberTwo = new SuperNumber<>(15);
        System.out.println(numberOne.returnDoubleValue());
        System.out.println(numberOne.returnIntegerValue());
        numberOne.showType();

        System.out.println("Generic Number " + numberOne.genericNumber());
        System.out.println(numberOne.checkValueIntSuperNumber(numberTwo));
        System.out.println(numberOne.checkValueDoubleSuperNumber(numberTwo));

// TASK 16
//
// Create a generic class Container that implements Collection interface.
// That class should store a list of objects of a generic type and the number of changes performed on that list.
// Every time you change the list that number has to increase.

        Container<Double> doubleNumbersObj = new Container<>();
        doubleNumbersObj.add(25.0);
        doubleNumbersObj.add(15.0);
        System.out.println("Removing: ");
        doubleNumbersObj.printArray();
        System.out.println(doubleNumbersObj.getNumberOfChange());

// TASK 17
// Extend a Container class to ContainerWithMemory. That class should store every version of your list.
// There should be methods that will allow you to restore a specific version, print specific version,
// print all the history

        ContainerWithMemory<Double> containerWithMemory = new ContainerWithMemory();
        containerWithMemory.add(20.0);
        containerWithMemory.add(20.0);
        containerWithMemory.add(20.0);
        System.out.println(containerWithMemory.version.get(1));
        System.out.println(containerWithMemory.version.get(2));
        System.out.println(containerWithMemory.version.get(3));
        containerWithMemory.add(20.0);
        System.out.println(containerWithMemory.version.get(4));
        containerWithMemory.remove(20.0);
        System.out.println(containerWithMemory.version.get(5));
        containerWithMemory.restoreVersion(1);
        System.out.println(containerWithMemory.containerListMemory);
    }
}