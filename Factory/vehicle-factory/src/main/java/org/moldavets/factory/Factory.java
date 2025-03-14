package org.moldavets.factory;

public interface Factory<T,V> {
    T create(V value);
}
