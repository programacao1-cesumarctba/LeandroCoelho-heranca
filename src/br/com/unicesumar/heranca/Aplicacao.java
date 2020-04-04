package br.com.unicesumar.heranca;

import br.com.unicesumar.heranca.exception.DepositoException;
import br.com.unicesumar.heranca.model.Conta;
import br.com.unicesumar.heranca.model.ContaEspecial;
import br.com.unicesumar.heranca.model.ContaSalario;

public class Aplicacao {
    public static void main(String[] args) throws Exception {
        ContaSalario contaSalario = new ContaSalario("Leandro", "15454", 100.0, "GFT Brasil", 2);

        contaSalario.depositar(100);
        contaSalario.depositar(100);
        System.out.println(contaSalario);

        ContaEspecial contaEspecial = new ContaEspecial("José", "55555", -100.0, 0.1);
        contaEspecial.fazerEmprestimo(1000.0);
        System.out.println(contaEspecial);
    }
}
