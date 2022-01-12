package com.dio;

import java.util.Objects;

public class Banco {
    private final String name;
    private final String codigoBancario;
    protected final String numeroAgencia;


    public Banco(String name, String codigoBancario, String numeroAgencia) {
        this.name = name;
        this.codigoBancario = codigoBancario;
        this.numeroAgencia = numeroAgencia;
    }

    protected String getName() {  return name;   }

    protected String getCodigoBancario() {  return codigoBancario;  }

    protected String getNumeroAgencia() {  return numeroAgencia;   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Banco banco = (Banco) o;
        return name.equals(banco.name) && codigoBancario.equals(banco.codigoBancario) && numeroAgencia.equals(banco.numeroAgencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, codigoBancario, numeroAgencia);
    }

    @Override
    public String toString() {
        return "Banco " + name + ", codigo Bancário " + codigoBancario +
                ", numeroAgencia " + numeroAgencia + '.';
    }
}
