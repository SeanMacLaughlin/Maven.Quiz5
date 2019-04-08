package rocks.zipcode.io.quiz4.generics;

import javafx.collections.transformation.SortedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_>  implements GroupInterface<_>, Iterable<_>{
    private List<_> list = new ArrayList<>();

    public Group() {
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Integer count() {
        return list.size();
    }

    public void insert(_ value) {
        list.add(value);
    }

    public Boolean has(_ value) {
        return list.contains(value);
    }

    public _ fetch(int indexOfValue) {
        return list.get(indexOfValue);
    }

    public void delete(_ value) {
        list.remove(value);
    }

    public void clear() {
        list.clear();
    }

    public Iterator<_> iterator() {
        return null;
    }

    @Override
    public String toString() {
        return list.toString();
    }

    @Override
    public void forEach(Consumer<? super _> action) {

    }
}

