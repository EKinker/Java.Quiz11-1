package rocks.zipcode.io.quiz4.generics;

import java.util.Collections;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T extends Comparable<T>> extends Group<T> {

    @Override
    public void insert(T value) {
        super.insert(value);
        Collections.sort(list);
    }

    @Override
    public void delete(T value) {
        super.delete(value);
        Collections.sort(list);
    }

    public Integer indexOf(T value) {
        return list.indexOf(value);
    }
}
