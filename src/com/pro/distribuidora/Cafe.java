package com.pro.distribuidora;

/**
 *
 * @author JESSI
 */
public class Cafe {
    
    private String tipo;
    private int valor;

    public Cafe(String tipo, int valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}