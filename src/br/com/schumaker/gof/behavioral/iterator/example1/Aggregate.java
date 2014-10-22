package br.com.schumaker.gof.behavioral.iterator.example1;

/**
 *
 * @author Hudson Schumaker
 */
public interface Aggregate {
  public Iterator<String> getIterator();
}
