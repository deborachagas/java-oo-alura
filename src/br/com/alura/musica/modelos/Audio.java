package br.com.alura.musica.modelos;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalReproducao;
    private int curtidas;
    private int classificacao;

    public Audio() {
        curtidas = 0;
        classificacao = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }


    public int getTotalReproducao() {
        return totalReproducao;
    }

    public void reproduzir() {
        this.totalReproducao++;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void curtir() {
        this.curtidas++;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
}
