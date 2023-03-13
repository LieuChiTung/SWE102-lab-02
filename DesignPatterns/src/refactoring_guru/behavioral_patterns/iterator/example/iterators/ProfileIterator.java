package refactoring_guru.behavioral_patterns.iterator.example.iterators;

import refactoring_guru.behavioral_patterns.iterator.example.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}