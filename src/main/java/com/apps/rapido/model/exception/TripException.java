package com.apps.rapido.model.exception;


public class TripException extends RuntimeException {

    TripException() { super(); }
    TripException(String s) { super(s); }
    TripException(String s, Throwable t) { super(s,t); }
    TripException(Throwable t) { super(t); }
};
