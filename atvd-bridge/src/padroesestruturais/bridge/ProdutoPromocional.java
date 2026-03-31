package padroesestruturais.bridge;

public class ProdutoPromocional extends Produto {
    public ProdutoPromocional(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase * (1 - this.tipoDesconto.percentualDesconto());
    }
}