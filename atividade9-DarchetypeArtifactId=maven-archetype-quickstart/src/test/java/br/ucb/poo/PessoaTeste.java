package br.ucb.poo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PessoaTeste {
    @Test
    public void testDizerOla() {
        Pessoa p = new Pessoa("Gustavo");
        String esperado = "Olá, Gustavo!";
        String atual = p.dizerOla();
        assertEquals(esperado, atual);
    }
}