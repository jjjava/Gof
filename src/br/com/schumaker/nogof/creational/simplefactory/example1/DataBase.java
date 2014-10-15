package br.com.schumaker.nogof.creational.simplefactory.example1;

import java.util.List;

/**
 *
 * @author Hudson Schumaker
 */
public interface DataBase {
  public boolean save();
  public boolean merge();
  public List<?> search();
  public boolean delete();
}
