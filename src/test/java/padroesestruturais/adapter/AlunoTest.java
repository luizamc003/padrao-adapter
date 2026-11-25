package padroesestruturais.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LojaTest {

    @Test
    void deveRetornarValorCompraLoja() {
        Loja loja = new Loja();
        loja.setValorCompra(49.90f);

        assertEquals(49.90f, loja.getValorCompra());
    }

    @Test
    void deveRetornarValorCentavosLoja() {
        Loja loja = new Loja();
        loja.setValorCompra(49.90f);

        assertEquals(4990, loja.getValorCentavos());
    }

    @Test
    void deveFinalizarCompraLoja() {
        Loja loja = new Loja();
        loja.setValorCompra(49.90f);

        assertEquals("Cobrança de 4990 centavos em BRL aprovada", loja.finalizarCompra());
    }

}