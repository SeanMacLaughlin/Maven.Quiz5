package rocks.zipcode.io.quiz4.generics;

import javafx.collections.transformation.SortedList;

import java.util.*;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_ extends Comparable> extends Group<_>{
    private List<_> myList = new ArrayList<>();


    public SortedGroup() {
    }

    @Override
    public void insert(_ value) {
        myList.add(value);
        myList.sort(Comparator.naturalOrder());
    }

    @Override
    public void delete(_ value) {
        myList.remove(value);
        myList.sort(Comparator.naturalOrder());
    }

    public Integer indexOf(_ value) {
        myList.sort(Comparator.naturalOrder());
        return myList.indexOf(value);

    }

}
