package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable {

    private ArrayList<String> simpleStringGroup = new ArrayList<>();

    public SimpleStringGroup() {

    }

    public Integer count() {
        return simpleStringGroup.size();
    }

    public void insert(String string) {
        simpleStringGroup.add(string);
    }

    public Boolean has(String string) {
        return simpleStringGroup.contains(string);
    }

    public String fetch(int indexOfValue) {
        return simpleStringGroup.get(indexOfValue);
    }

    public void delete(String string) {
        simpleStringGroup.remove(string);
    }

    public void clear() {
        simpleStringGroup.clear();
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }
}
