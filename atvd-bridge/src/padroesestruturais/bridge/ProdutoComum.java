package padroesestruturais.bridge;

public class ProdutoComum extends Produto {
    public ProdutoComum(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase;
    }
}