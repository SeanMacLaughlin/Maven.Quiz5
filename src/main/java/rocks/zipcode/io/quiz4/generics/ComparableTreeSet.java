package rocks.zipcode.io.quiz4.generics;

import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class    ComparableTreeSet<_> implements Comparable<_>{
    private TreeSet<_> treeSet = new TreeSet<>();
    public ComparableTreeSet(_... arr) {
    }


    public ComparableTreeSet() {
        this.treeSet = treeSet;
    }

    public int compareTo(ComparableTreeSet<_> o) {
        return Integer.valueOf(null);
    }

    @Override
    public int compareTo(_ o) {
        return 0;
    }
}
