package edu.utfpr.cp.dacom.sa.soilcorrection.conversores;

public interface Conversao<T, R> {

  public R converte(T valor);
}
