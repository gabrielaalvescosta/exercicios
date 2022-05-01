package encapsulamento;

public class ContaBancaria {
	
    public String agencia;
    public String numero;
    public double saldo;
   
    ContaBancaria(String agencia, String numero, double saldo){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }
}
