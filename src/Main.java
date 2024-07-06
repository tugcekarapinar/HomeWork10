import java.util.List;

public class Main {
    public static void main(String[] args) {
        GenericClass<String> stringClass = new GenericClass<>("Hello, World!");
        stringClass.PrintField();

        GenericClass<Integer> integerClass = new GenericClass<>(123);
        integerClass.PrintField();

        GenericClass<Boolean> booleanClass = new GenericClass<>(true);
        booleanClass.PrintField();

        System.out.println("--------------------------------");

        int elementToFindInt = 2;
        List<Integer> integers = List.of(1, 2, 3, 4, 5);

        int resultInt = ListSearcher.FindElement(integers, elementToFindInt);
        System.out.println(resultInt);

        elementToFindInt = 9;
        resultInt = ListSearcher.FindElement(integers, elementToFindInt);
        System.out.println(resultInt);
    }
}