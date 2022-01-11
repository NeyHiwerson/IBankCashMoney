package com.dio;

import java.util.Objects;

public class Banco {
    public String name;
    public String codigoBancario;
    public String numeroAgencia;
    public Conta conta;

    public Banco(String name, String codigoBancario, String numeroAgencia) {
        this.name = name;
        this.codigoBancario = codigoBancario;
        this.numeroAgencia = numeroAgencia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodigoBancario() {
        return codigoBancario;
    }

    public void setCodigoBancario(String codigoBancario) {
        this.codigoBancario = codigoBancario;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

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
