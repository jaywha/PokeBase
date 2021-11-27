import java.util.List;

public class ListUtils {
    public static <T> String join(List<T> list, String delimiter) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (T element : list) {
            sb.append(element.toString());
            if(++counter < list.size()) {
                sb.append(delimiter);
            }
        }                
        return sb.toString();
    }
}
