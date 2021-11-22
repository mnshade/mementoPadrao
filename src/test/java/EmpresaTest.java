import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void deveArmazenarPortes(){
        Empresa empresa = new Empresa();
        empresa.setPorte(EmpresaPorteMe.getInstance());
        empresa.setPorte(EmpresaPorteEPP.getInstance());
        assertEquals(2, empresa.getPortes().size());
    }

    @Test
    void deveRetornarPrimeiroPorte(){
        Empresa empresa = new Empresa();
        empresa.setPorte(EmpresaPorteMe.getInstance());
        empresa.setPorte(EmpresaPorteEPP.getInstance());
        empresa.restaurarPorte(0);
        assertEquals(EmpresaPorteMe.getInstance(), empresa.getPortes());
    }
    @Test
    void deveRetornarEStadoAnterior(){
        Empresa empresa = new Empresa();
        empresa.setPorte(EmpresaPorteMe.getInstance());
        empresa.setPorte(EmpresaPorteEPP.getInstance());
        empresa.setPorte(EmpresaPorteMedio.getInstance());
        empresa.setPorte(EmpresaPorteMedioGrande.getInstance());
        empresa.setPorte(EmpresaPorteGrande.getInstance());
        empresa.restaurarPorte(3);
        assertEquals(EmpresaPorteMedioGrande.getInstance(), empresa.getPorte());
    }

    @Test
    void deveRetornarExcessaoIndiceInvalido(){
        try{
            Empresa empresa = new Empresa();
            empresa.restaurarPorte(0);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}
