import java.lang.reflect.Method;
import java.util.*;

public class Test0 {
    public static void main(String[] args) {
        //forEach-this method helps us in accessing all the elements of a
        //given collection.

        //stream is a wrapper
        //bulk processing conveniently and fast.

        ArrayList<String>lang=new ArrayList<String>();

        lang.add("Java");
        lang.add("CSharp");
        lang.add("Python");
        lang.add("PHp");
        lang.forEach(System.out::println);

        // lang.foreach(Class::Method);

    }

}
