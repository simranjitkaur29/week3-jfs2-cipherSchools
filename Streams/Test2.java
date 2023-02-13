import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.lang.model.element.Element;

public class Test2 {
    public static void main(String[] args) {
        List<Integer>myList=Arrays.asList(1,2,3,4,5,6,7,8,9);

       List<Integer>result= myList.stream().map(e->e*e).collect(Collectors.toList());
        System.out.println(result);

       
    }
    
}
