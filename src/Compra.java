import br.com.alura.screenmatch.modelos.Titulo;

public class Compra implements Comparable<Compra> {
    private String descricao;
    private double valor;

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "descriçao: " + this.getDescricao() + " valor: " + this.getValor() + "\n";
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return  Double.valueOf(this.getValor()).compareTo(Double.valueOf(outraCompra.getValor()));
    }
}
