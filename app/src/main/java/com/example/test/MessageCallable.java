package com.example.test;
/**
 *
 *
 * @param <T>
 *          the return type
 * @param <S>
 *          the message type
 */

public interface MessageCallable<T, S> {

    T call(S message);
}