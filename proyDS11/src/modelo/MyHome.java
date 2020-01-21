/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.util.HashMap;
import modelo.database.Conexion;

/**
 *
 * @author nicoleagila
 */
public class MyHome {
    public static HashMap<Integer,Casa> casas_base = new HashMap<>();
    public static Connection bd = Conexion.getInstance().getConexion();
    public static Persona persona;
    public static Cuenta cuenta;
    
    /**
    private void llenarCasas(){
        try (Statement st = bd.createStatement()) {
            String query = "SELECT * FROM casa_modelo;";
            try(ResultSet rs = st.executeQuery(query)){
                while (rs.next()){
                    int idC =rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    double mCuadrados= rs.getDouble("mCuadrados");
                    int nPisos=rs.getInt("nPisos");
                    boolean esquinera= rs.getBoolean("esquinera");
                    int orientacion=rs.getInt("orientacion");
                    boolean patio = rs.getBoolean("patio");
                    int tamanoPatio=rs.getInt("tamanoPatio");
                    int nHabitaciones=rs.getInt("nHabitaciones");
                    int nBanos=rs.getInt("nBanos");
                    float costo_base=rs.getFloat("costo_base");
                    
                    VBox casa = new VBox();
                    Casa casaBase = 
                    casa.getChildren().add(new Label(nombre));
                    
                    cajaCasasBasicas.getChildren().add(casa);                
                }
            }catch(Exception e){   
            }
        } catch (Exception e) {
        }
    }
    */
    
}
