package rocks.zipcode.io.quiz4.generics;

import javafx.collections.transformation.SortedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> implements Comparable<_>{
    private List<_> myList = new ArrayList<>();

    public SortedGroup() {
//        myList.sort(Comparator.naturalOrder());
    }


    @Override
    public void insert(_ value) {
        myList.add(value);
    }

    @Override
    public void delete(_ value) {
        myList.remove(value);
    }

    public Integer indexOf(_ value) {
        return myList.indexOf(value);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
