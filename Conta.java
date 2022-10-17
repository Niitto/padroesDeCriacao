public class Conta{
    public enum Categoria{NORMAL, ADVANCED, PREMIUM}

    private long numero;
    private String nomeCorrentista;
    private int saldoLivreInicial;
    private int salAplicacaoInicial;
    private double taxaRemuneracao;
    private double taxaSaldoNegativo;
    private Categoria categoriaInicial;

    public static class Builder{
            private long numero = 210000;
            private String nomeCorrentista = "Cléberson Holandês";
            private int saldoLivreInicial = 2000;
            private int salAplicacaoInicial = 1000;
            private double taxaRemuneracao = 10.000;
            private double taxaSaldoNegativo = 5.000;
            private Categoria categoriaInicial = Categoria.NORMAL;  

        public Builder() {
        }

        public Builder categoria(Conta.Categoria categoriaInicial) {
            this.categoriaInicial = categoriaInicial;
            return this;
        }
        public Builder numero(){
            this.numero = numero;
            return this;
        }
        public Builder nome(){
            this.nomeCorrentista = nomeCorrentista;
            return this;
        }
        public Builder saldoLivre(){
            this.saldoLivreInicial = saldoLivreInicial;
            return this;
        }
        public Builder saldoAplicacao(){
            this.salAplicacaoInicial = salAplicacaoInicial;
            return this;
        }
        public Builder taxaRemuneracao(){
            this.taxaRemuneracao = taxaRemuneracao;
            return this;
        }
        public Builder taxaSaldoNegativo(){
            this.taxaSaldoNegativo = taxaSaldoNegativo;
            return this;
        }
        public Builder categoria(){
            this.categoriaInicial = categoriaInicial;
            return this;
        }
        public Conta build(){
            return new Conta(this);
        }
    }

    private Conta(Builder builder) {
        this.categoriaInicial = builder.categoriaInicial;
        this.numero = builder.numero;
        this.nomeCorrentista = builder.nomeCorrentista;
        this.saldoLivreInicial = builder.saldoLivreInicial;
        this.salAplicacaoInicial = builder.salAplicacaoInicial;
        this.taxaRemuneracao = builder.taxaRemuneracao;
        this.taxaSaldoNegativo = builder.taxaSaldoNegativo;
        this.categoriaInicial = builder.categoriaInicial;

    }
}