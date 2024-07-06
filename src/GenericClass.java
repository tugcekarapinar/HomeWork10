public class GenericClass<T> {
    private T field;

    public GenericClass(T field) {
        this.field = field;
    }

    public void PrintField() {
        System.out.println("Field: " + field);
    }
}