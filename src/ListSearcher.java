import java.util.List;
import java.util.Optional;

public class ListSearcher {

    public static <T> T FindElement(List<T> list, T element) {
        Optional<T> foundElement = list.stream().filter(e -> e.equals(element)).findFirst();

        return foundElement.orElse((T) Integer.valueOf(-1));
    }
}