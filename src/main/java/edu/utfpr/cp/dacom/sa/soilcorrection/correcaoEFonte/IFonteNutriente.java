package edu.utfpr.cp.dacom.sa.soilcorrection.correcaoEFonte;

import java.util.Set;

public interface IFonteNutriente {

  public double getTeorFonte();

  public Set<NutrienteAdicional> getNutrientesAdicionais();
}
