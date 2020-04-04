package br.com.unicesumar.heranca.model;

import br.com.unicesumar.heranca.exception.ContaInvalidaException;

public abstract class Conta {

    private String titular;
    private String numero;
    private double saldo;

    public Conta(){}

    public Conta(String titular, String numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) throws Exception {
        if(this.numero.length() == 5)
            this.numero = numero;
        throw new ContaInvalidaException("Numero de conta inválido");

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
