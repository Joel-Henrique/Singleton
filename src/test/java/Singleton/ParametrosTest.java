package Singleton;

import org.example.Parametros;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ParametrosTest {
    @Test
    public void deveRetornarNomeLocadoraVeiculos(){
        Parametros.getInstance().setNomeLocadoradeVeiculos("Veiculos JF City");
        assertEquals("Veiculos JF City", Parametros.getInstance().getNomeLocadoradeVeiculos());
    }
    @Test
    public void deveRetornarQntVeiculo(){
        Parametros.getInstance().setQntVeiculos(17);
        assertEquals(17, Parametros.getInstance().getQntVeiculos());
    }
}
