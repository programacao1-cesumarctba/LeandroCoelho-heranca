package br.com.unicesumar.heranca.model;

public class ContaEspecial extends Conta {

    private double juros;

    public ContaEspecial(String titular, String numero, double saldo, double juros) {
        super(titular, numero, saldo);
        this.juros = juros;
    }

    public void fazerEmprestimo(double valorEmprestimo){

        double total = super.getSaldo() + valorEmprestimo;
        this.setJuros(this.juros, valorEmprestimo);
        super.setSaldo(total);
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros, double valorEmprestimo) {
        this.juros = valorEmprestimo + (valorEmprestimo * juros);
    }

    @Override
    public String toString() {
        return "Conta especial{" +
                "titular ='" + this.getTitular() + '\'' +
                ", numero ='" + this.getNumero() + '\'' +
                ", saldo = R$ '" + this.getSaldo() +
                ", Valor do emprestimo com juros = R$ " + this.getJuros() +
                '}';
    }
}
