package ru.netology;

import java.util.Iterator;

public interface Iterable<Integer> {
    Iterator<Integer> getIterator();
}
