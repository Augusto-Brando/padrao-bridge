package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUnitarioBridge {

    @Test
    public void testProdutoComumSemDesconto() {
        Produto produto = new ProdutoComum(100f);
        assertEquals(100f, produto.calcularPreco());
    }

    @Test
    public void testProdutoPromocionalDescontoEstudante() {
        Produto produto = new ProdutoPromocional(100f);
        produto.setTipoDesconto(new DescontoEstudante());
        assertEquals(90f, produto.calcularPreco());
    }

    @Test
    public void testProdutoPromocionalDescontoVip() {
        Produto produto = new ProdutoPromocional(100f);
        produto.setTipoDesconto(new DescontoVip());
        assertEquals(70f, produto.calcularPreco());
    }

    @Test
    public void testProdutoPromocionalDescontoIdoso() {
        Produto produto = new ProdutoPromocional(100f);
        produto.setTipoDesconto(new DescontoIdoso());
        assertEquals(80f, produto.calcularPreco());
    }

    @Test
    public void testTrocaDescontoEmTempoDeExecucao() {
        Produto produto = new ProdutoPromocional(100f);
        produto.setTipoDesconto(new DescontoVip());
        assertEquals(70f, produto.calcularPreco());
        produto.setTipoDesconto(new DescontoIdoso());
        assertEquals(80f, produto.calcularPreco());
    }
}