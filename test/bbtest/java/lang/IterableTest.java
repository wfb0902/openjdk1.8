package bbtest.java.lang;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterableTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        Iterator<String> strItr = list.iterator();
        ListIterator<String> listItr = list.listIterator(3);
        //list.forEach(it -> System.out.println(it));
        //strItr.forEachRemaining(it -> System.out.println(it));
/*        while (strItr.hasNext()) {
            System.out.println(strItr.next());
        }*/

        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }

    }


}
