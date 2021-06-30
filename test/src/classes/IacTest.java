package classes;


import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IacTest {
    Iac iac;

    @org.junit.jupiter.api.BeforeEach
    public void setUp() {

        iac = new Iac();
    }

    @org.junit.jupiter.api.Test
    void calculaAbaixoAdiposidadeNormalMasculino() {
        iac.setAltura(1);
        iac.setQuadril(25);
        iac.setSexo("M");
        assertEquals(7,  iac.calculaIac(), 2);
    }

    @org.junit.jupiter.api.Test
    void calculaAdiposidadeNormalMasculino() {
        iac.setAltura(1);
        iac.setQuadril(26);
        iac.setSexo("M");
        assertEquals(8, iac.calculaIac(), 2);
    }

    @org.junit.jupiter.api.Test
    void calculaSobrepesoMasculino() {
        iac.setAltura(1);
        iac.setQuadril(39);
        iac.setSexo("M");
        assertEquals(21, iac.calculaIac(), 2);
    }

    @org.junit.jupiter.api.Test
    void calculaObesidadeMasculino() {
        iac.setAltura(1);
        iac.setQuadril(44);
        iac.setSexo("M");
        assertEquals(26, iac.calculaIac(), 2);
    }

    @org.junit.jupiter.api.Test
    void calculaAbaixoAdiposidadeNormalFeminino() {
        iac.setAltura(1);
        iac.setQuadril(38);
        iac.setSexo("F");
        assertEquals(20, iac.calculaIac(), 2);
    }

    @org.junit.jupiter.api.Test
    void calculaAdiposidadeNormalFeminino() {
        iac.setAltura(1);
        iac.setQuadril(39);
        iac.setSexo("F");
        assertEquals(21, iac.calculaIac(), 2);
    }

    @org.junit.jupiter.api.Test
    void calculaSobrepesoFeminino() {
        iac.setAltura(1);
        iac.setQuadril(51);
        iac.setSexo("F");
        assertEquals(33, iac.calculaIac(), 2);
    }

    @org.junit.jupiter.api.Test
    void calculaObesidadeFeminino() {
        iac.setAltura(1);
        iac.setQuadril(57);
        iac.setSexo("F");
        assertEquals(39, iac.calculaIac(), 2);
    }


    @org.junit.jupiter.api.Test
    void resultadoAdiposidadeAbaixoMasculino() {
        Iac iac = new Iac();
        iac.setSexo("M");
        Interface imcMock = createMock(Interface.class);
        expect(imcMock.calculaIac()).andReturn(7.0);
        replay(imcMock);
        assertEquals("Abaixo da Adiposidade Normal", iac.resultadoFinal(imcMock));
    }

    @org.junit.jupiter.api.Test
    void resultadoAdiposidadeNormalMasculino() {
        Iac iac = new Iac();
        iac.setSexo("M");
        Interface imcMock = createMock(Interface.class);
        expect(imcMock.calculaIac()).andReturn(8.0);
        replay(imcMock);
        assertEquals("Adiposidade Normal", iac.resultadoFinal(imcMock));
    }

    @org.junit.jupiter.api.Test
    void resultadoSobrepesoMasculino() {
        Iac iac = new Iac();
        iac.setSexo("M");
        Interface imcMock = createMock(Interface.class);
        expect(imcMock.calculaIac()).andReturn(21.0);
        replay(imcMock);
        assertEquals("Sobrepeso", iac.resultadoFinal(imcMock));
    }

    @org.junit.jupiter.api.Test
    void resultadoObesidadeMasculino() {
        Iac iac = new Iac();
        iac.setSexo("M");
        Interface imcMock = createMock(Interface.class);
        expect(imcMock.calculaIac()).andReturn(26.0);
        replay(imcMock);
        assertEquals("Obesidade", iac.resultadoFinal(imcMock));
    }

    @org.junit.jupiter.api.Test
    void resultadoAdiposidadeAbaixoFeminino() {
        Iac iac = new Iac();
        iac.setSexo("F");
        Interface imcMock = createMock(Interface.class);
        expect(imcMock.calculaIac()).andReturn(20.0);
        replay(imcMock);
        assertEquals("Abaixo da Adiposidade Normal", iac.resultadoFinal(imcMock));
    }

    @org.junit.jupiter.api.Test
    void resultadoAdiposidadeNormalFeminino() {
        Iac iac = new Iac();
        iac.setSexo("F");
        Interface imcMock = createMock(Interface.class);
        expect(imcMock.calculaIac()).andReturn(21.0);
        replay(imcMock);
        assertEquals("Adiposidade Normal", iac.resultadoFinal(imcMock));
    }

    @org.junit.jupiter.api.Test
    void resultadoSobrepesoFeminino() {
        Iac iac = new Iac();
        iac.setSexo("F");
        Interface imcMock = createMock(Interface.class);
        expect(imcMock.calculaIac()).andReturn(33.0);
        replay(imcMock);
        assertEquals("Sobrepeso", iac.resultadoFinal(imcMock));
    }

    @org.junit.jupiter.api.Test
    void resultadoObesidadeFeminino() {
        Iac iac = new Iac();
        iac.setSexo("F");
        Interface imcMock = createMock(Interface.class);
        expect(imcMock.calculaIac()).andReturn(39.0);
        replay(imcMock);
        assertEquals("Obesidade", iac.resultadoFinal(imcMock));
    }

}