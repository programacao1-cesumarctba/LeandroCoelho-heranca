package br.com.unicesumar.heranca.model;

import br.com.unicesumar.heranca.exception.DepositoException;

public class ContaSalario extends Conta {

    private String nomeEmpresa;
    private int limiteDeposito;

    public ContaSalario(String titular, String numero, double saldo, String nomeEmpresa, int limiteDeposito) {
        super(titular, numero, saldo);
        this.nomeEmpresa = nomeEmpresa;
        this.limiteDeposito = limiteDeposito;
    }

    public void depositar(double deposito) throws DepositoException {
        if(this.limiteDeposito > 0){
            double saldoAtual = this.getSaldo() + deposito;
            this.setSaldo(saldoAtual);
            --this.limiteDeposito;
        }else{
            throw new DepositoException("Limite de depósito exedido");
        }
    }

    @Override
    public String toString() {
        return " Conta salario{" +
                "titular ='" + this.getTitular() + '\'' +
                ", numero ='" + this.getNumero() + '\'' +
                ", Empresa = R$ '" + this.nomeEmpresa +
                ", saldo = R$ " + this.getSaldo() +
                '}';
    }


}
