import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    private final int filterNumber;
    public Filter (int filterNumber){
        this.filterNumber = filterNumber;
    }
    public List<Integer> filterOut (List<Integer> source){
        Logger logger = Logger.getInstance();
        logger.log("Происходит фильтрация чисел");
        return source.stream().filter(x -> x>filterNumber).collect(Collectors.toList());
    }
}
