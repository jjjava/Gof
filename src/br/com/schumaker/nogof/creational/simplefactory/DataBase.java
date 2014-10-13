package br.com.schumaker.nogof.creational.simplefactory;

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
