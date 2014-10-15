package br.com.schumaker.nogof.creational.objectpool.example1;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 12/09/2014
 * @param <T>
 */
public interface Pool<T> {

    T aquire();
    void release(T t);
}
