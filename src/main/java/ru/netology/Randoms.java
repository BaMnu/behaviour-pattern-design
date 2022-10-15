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
    public Iterator<Integer> getIterator() {
        return new RandomsIterator();
    }

    private class RandomsIterator implements Iterator<Integer> {
        private int index;

        @Override
        public boolean hasNext() {
            return index < numbers.size();
        }

        @Override
        public Integer next() {
            return numbers.get(index++);
        }
    }
}