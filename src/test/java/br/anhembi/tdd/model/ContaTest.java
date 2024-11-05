package br.anhembi.tdd.model;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


public class ContaTest {
 // DadoQue_quando_EsperoQue

 @Test
 void CriarConta_NumeroValido_ContaCriada() 
 {
    int numeroConta = 123;
    Conta conta = new Conta(numeroConta);

    assertThat(conta.getNumero()).isEqualTo(numeroConta);
 }
 @Test
 void CriarConta_NumeroValido_SaldoInicialZero() 
 {
    int numeroConta = 123;
    Conta conta = new Conta(numeroConta);

    assertThat(conta.getSaldo()).isEqualTo(0);
 }

 @Test
 void DepositarConta_NumeroValidoEValorValido_SaldoCorreto()
 {
    int numeroConta = 123;
    int valorDeposito = 200;

    Conta conta = new Conta(numeroConta);
    conta.depositar(valorDeposito);

    assertThat(conta.getSaldo()).isEqualTo(valorDeposito);

    
 }
 @Test
 void DepositarConta_NumeroValidoEValorValido_SaldoSemAlteracao()
 {
    int numeroConta = 123;
    int valorDeposito = -200;

    Conta conta = new Conta(numeroConta);
    conta.depositar(valorDeposito);

    assertThat(conta.getSaldo()).isEqualTo(valorDeposito);

    
 }
}
