package br.com.schumaker.gof.behavioral.iterator.example1;

/**
 *
 * @author Hudson Schumaker
 * @param <T>
 */
public interface Iterator<T> {
  public T first();
  public T next();
  public boolean isDone();
  public T currentItem();
}