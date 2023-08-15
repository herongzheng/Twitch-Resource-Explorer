package com.laioffer.twitch.favorite;

public class DuplicateFavoriteException extends Exception{
    private String message;
    public DuplicateFavoriteException() {

    }

    public DuplicateFavoriteException(String message) {
        super(message);
    }
}
