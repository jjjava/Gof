package br.com.schumaker.nogof.structural.mvc.example1.controller;

import br.com.schumaker.nogof.structural.mvc.example1.view.AbstractView;
import br.com.schumaker.nogof.structural.mvc.example1.model.AbstractModel;

/**
 *
 * @author Hudson Schumaker
 */
public abstract class AbstractController {

  public abstract void init(AbstractModel model, AbstractView view);

}