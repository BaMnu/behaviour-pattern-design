package ru.netology;

import java.util.*;

public class Randoms implements Iterable<Integer> {
    public List<Integer> numbers;

    public Randoms(int min, int max) {
        numbers = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomsIterator();
    }

    private class RandomsIterator implements Iterator<Integer> {
        private Iterator<Integer> it = numbers.iterator();

        @Override
        public boolean hasNext() {
            return !numbers.isEmpty();
        }

        @Override
        public Integer next() {
            if (!it.hasNext()) {
                it = numbers.iterator();
            }
            return it.next();
        }
    }
}