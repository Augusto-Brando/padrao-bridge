package padroesestruturais.bridge;

public abstract class Produto {
    protected TipoDesconto tipoDesconto;
    protected float precoBase;

    public Produto(float precoBase) {
        this.precoBase = precoBase;
    }

    public void setTipoDesconto(TipoDesconto tipoDesconto) {
        this.tipoDesconto = tipoDesconto;
    }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }

    public abstract float calcularPreco();
}