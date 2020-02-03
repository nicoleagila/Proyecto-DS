/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.acabados;

import modelo.Casa;
import modelo.casas.CasaCieloBuilder;
import modelo.casas.CasaDirector;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nicoleagila
 */
public class AcabadosTest {
    
    public AcabadosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of agregarAcabado method, of class AislanteTermico.
     */
    @Test
    public void testAgregarAcabadoAislante() {
        CasaDirector director= new CasaDirector(new CasaCieloBuilder());
        director.construirCasa();
        Casa casa = director.getCasa();
        AislanteTermico instance = new AislanteTermico(50,"Aislante",casa);
        instance.agregarAcabado(5);
        int cantidad=2000000+(5*50);
        assertEquals(cantidad,casa.getCostoFinal(),0.05);
    }
    
    @Test
    public void testAgregarAcabadoBano() {
        CasaDirector director= new CasaDirector(new CasaCieloBuilder());
        director.construirCasa();
        Casa casa = director.getCasa();
        BanoSincronizado instance = new BanoSincronizado(75,"Bano",casa);
        instance.agregarAcabado(3);
        int cantidad=2000000+(3*75);
        assertEquals(cantidad,casa.getCostoFinal(),0.05);
    }
    
    @Test
    public void testAgregarAcabadoGriferia() {
        CasaDirector director= new CasaDirector(new CasaCieloBuilder());
        director.construirCasa();
        Casa casa = director.getCasa();
        Griferia instance = new Griferia(25,"Griferia",casa);
        instance.agregarAcabado(1);
        int cantidad=2000000+(1*25);
        assertEquals(cantidad,casa.getCostoFinal(),0.05);
    }
    @Test
    public void testAgregarAcabadoIluminacion() {
        CasaDirector director= new CasaDirector(new CasaCieloBuilder());
        director.construirCasa();
        Casa casa = director.getCasa();
        Iluminacion instance = new Iluminacion(50,"Iluminacion",casa);
        instance.agregarAcabado(6);
        int cantidad=2000000+(6*50);
        assertEquals(cantidad,casa.getCostoFinal(),0.05);
    }
    @Test
    public void testAgregarAcabadoPiso() {
        CasaDirector director= new CasaDirector(new CasaCieloBuilder());
        director.construirCasa();
        Casa casa = director.getCasa();
        Piso instance = new Piso(200,"Piso",casa);
        instance.agregarAcabado(2);
        int cantidad=2000000+(2*200);
        assertEquals(cantidad,casa.getCostoFinal(),0.05);
    }
}
