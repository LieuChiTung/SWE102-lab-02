package refactoring_guru.behavioral_patterns.iterator.example.social_networks;

import refactoring_guru.behavioral_patterns.iterator.example.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}