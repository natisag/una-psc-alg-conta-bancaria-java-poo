package ContaBancaria;

public class Dados {
    private String nomeDaPessoa;
    private String opcaoDesejada;
    private int numeroDaConta;
    private int saldoInicial;
    private int valorDeposito;
    private int saldoAtual;
    private int valorSaque;

    public void setNomeDaPessoa(String novoNomeDaPessoa) {
        nomeDaPessoa = novoNomeDaPessoa;
    }
    public String getNomeDaPessoa() {
        return nomeDaPessoa;
    }

    public void setNumeroDaConta(int novoNumeroDaConta) {
        numeroDaConta = novoNumeroDaConta;
    }
    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setSaldoInicial(int novoSaldoInicial) {
        saldoInicial = novoSaldoInicial;
        saldoAtual = novoSaldoInicial; 
    }
    public int getSaldoInicial() {
        return saldoInicial;
    }

    public void setOpcaoDesejada(String novoOpcaoDesejada) {
        opcaoDesejada = novoOpcaoDesejada;
    }
    public String getOpcaoDesejada() {
        return opcaoDesejada;
    }

    public void setValorDeposito(int novoValorDeposito) {
        valorDeposito = novoValorDeposito;
    }
    public int getValorDeposito() {
        return valorDeposito;
    }

    public int getSaldoAtual() {
        return saldoAtual;
    }

    public void calcularSaldoAtual() {
        if (opcaoDesejada.equals("1")) {
            saldoAtual += valorDeposito; 
        } else if (opcaoDesejada.equals("2")) {
            saldoAtual -= valorSaque; 
        }
    }

    public void setValorSaque(int novoValorSaque) {
        valorSaque = novoValorSaque;
    }

    public int getValorSaque() {
        return valorSaque;
    }

    public boolean realizarSaque() {
        if (saldoAtual >= valorSaque) {
            saldoAtual -= valorSaque;
            System.out.println("Saque realizado com sucesso.");
            return true;
        } 
        else if (valorSaque > 5000) {
            System.out.println("Valor do saque acima do permitido.");
        } 
        else {
            System.out.println("Saldo insuficiente para realizar a operação.");
        }
        return false;
    }

}
