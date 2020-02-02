/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.diseno;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import modelo.Casa;
import modelo.Cliente;
import modelo.DisenoPDF;
import static modelo.MyHome.cuenta;
import static modelo.MyHome.persona;
import modelo.acabados.Acabado;
import modelo.acabados.AislanteTermico;
import modelo.acabados.BanoSincronizado;
import modelo.acabados.Griferia;
import modelo.acabados.Iluminacion;
import modelo.acabados.Piso;

/**
 * FXML Controller class
 *
 * @author nicoleagila
 */
public class AddAcabadosFXMLController implements Initializable {

    @FXML
    private AnchorPane paneChooseAcabados;
    @FXML
    private Label lbltitulo;
    @FXML
    private ImageView imgviewcasa;
    @FXML
    private Label lblnombrecasa;
    @FXML
    private Label lblbase;
    @FXML
    private Label lblfinal;
    @FXML
    private Label valorbase;
    @FXML
    private Label valorfinal;
    @FXML
    private HBox listvaracteristicas;
    @FXML
    private VBox paneopcionesacabados;
    @FXML
    private Label lblacabados;
    @FXML
    private Button btguardar;
    @FXML
    private Button btenviar;
    @FXML
    private VBox listvaracteristicas1;
    static Casa casaescogida;
    static final Cliente CLIENTE = (Cliente) persona;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        imgviewcasa.setImage(new Image("/recursos/".concat(Integer.toString(casaescogida.getId())+".jpg")));
        lblnombrecasa.setText(casaescogida.getNombre());
        valorbase.setText(Float.toString(casaescogida.getCostoFinal()));
        llenarCaracteristicas();
        llenarAcabados();
        paneopcionesacabados.setSpacing(25);
        
    }    
    
    private void llenarCaracteristicas(){
        Label l1= new Label("Metros cuadrados: ".concat(Double.toString(casaescogida.getMetrosCuadrados())));
        Label l2= new Label("Cantidad de banos: ".concat(Integer.toString(casaescogida.getNumBanos())));
        Label l3= new Label("Numero de habitaciones: ".concat(Integer.toString(casaescogida.getNumHabitaciones())));
        Label l4= new Label("Numero de pisos: ".concat(Integer.toString(casaescogida.getNumeroPisos())));
        Label l5= new Label("Ubicacion: ".concat(casaescogida.getOrientacion().toString()));
        Label l6= new Label("Tamano del patio: ".concat(casaescogida.getTamanoPatio().toString()));

        listvaracteristicas1.getChildren().addAll(l1,l2,l3,l4,l5,l6);
    }
    
    private void llenarAcabados(){
        HBox caja1 = acabado1();
        HBox caja2 =acabado2();
        HBox caja3 =acabado3();
        HBox caja4 =acabado4();
        HBox caja5 =acabado5();
        
        paneopcionesacabados.getChildren().addAll(caja1,caja2,caja3,caja4,caja5);
    }
    
    private HBox acabado1(){
        Spinner<Integer> s = new Spinner<>(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,5));
        s.setMaxWidth(60);
        s.setVisible(false);
        Label l = new Label();
        HBox caja = new HBox(25);
        CheckBox  aislante= new CheckBox("Agregar aislante Termico");
        Acabado aislantet= new AislanteTermico(10.05f,"Aislante Termico", casaescogida);
        aislante.setOnAction(e->acabadoEscogido(s,e,l,aislantet));
        s.setOnMouseClicked(e->sum(e,l,aislantet));
        caja.getChildren().addAll(aislante,s,l);
        return caja;
    }
    
    private HBox acabado2(){
        Spinner<Integer> s = new Spinner<>(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,5));
        s.setMaxWidth(60);
        s.setVisible(false);
        Label l = new Label();
        HBox caja = new HBox(25);
        CheckBox  bano= new CheckBox("Agregar bano sincronizado");
        Acabado banos= new BanoSincronizado(20.5f,"Bano Sincronizado",casaescogida);
        bano.setOnAction(e->acabadoEscogido(s,e,l,banos));
        s.setOnMouseClicked(e->sum(e,l,banos));
        caja.getChildren().addAll(bano,s,l);
        return caja;
        
    }
    
    private HBox acabado3(){
        Spinner<Integer> s = new Spinner<>(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,5));
        s.setMaxWidth(60);
        s.setVisible(false);
        Label l = new Label();
        HBox caja = new HBox(25);
        CheckBox  griferia= new CheckBox("Agregar griferia");
        Acabado grif=new Griferia(19.5f,"Griferia",casaescogida);
        griferia.setOnAction(e->acabadoEscogido(s,e,l,grif));
        s.setOnMouseClicked(e->sum(e,l,grif));
        caja.getChildren().addAll(griferia,s,l);
        return caja;
    }
    
    private HBox acabado4(){
        Spinner<Integer> s = new Spinner<>(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,5));
        s.setMaxWidth(60);
        s.setVisible(false);
        Label l = new Label();
        HBox caja = new HBox(25);
        CheckBox  iluminacion= new CheckBox("Agregar iluminacion");
        Acabado ilu= new Iluminacion(5.5f,"Iluminacion",casaescogida);
        iluminacion.setOnAction(e->acabadoEscogido(s,e,l,ilu));
        s.setOnMouseClicked(e->sum(e,l,ilu));
        caja.getChildren().addAll(iluminacion,s,l);
        return caja;
    }
    
    private HBox acabado5(){
        Spinner<Integer> s = new Spinner<>(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,5));
        s.setMaxWidth(60);
        s.setVisible(false);
        Label l = new Label();
        HBox caja = new HBox(25);
        CheckBox  piso= new CheckBox("Agregar un piso");
        Acabado pisoe= new Piso(100.5f,"Piso extra",casaescogida);
        piso.setOnAction(e->acabadoEscogido(s,e,l,pisoe));
        s.setOnMouseClicked(e->sum(e,l,pisoe));
        caja.getChildren().addAll(piso,s,l);
        return caja;
    }
    
    private void acabadoEscogido (Spinner<Integer> s,Event e, Label precio, Acabado acabado){
        CheckBox check = (CheckBox) e.getSource();
        if(check.isSelected()){
            s.setVisible(true);
            s.getValueFactory().setValue(1);
            //acabado.agregarAcabado(s.getValue());
            
            if(CLIENTE.isRegistrado()){
                precio.setVisible(true);
                precio.setText("$".concat(Float.toString(acabado.getCosto()*s.getValue())));
                valorfinal.setText(Float.toString(casaescogida.getCostoFinal()));
            }
        }else {
            s.setVisible(false);
        }
    }
    
    private void sum(Event e, Label precio,Acabado acabado){
        if(CLIENTE.isRegistrado()){
                precio.setVisible(true);
                Spinner<Integer> spinner = (Spinner) e.getSource();
                precio.setText(Float.toString(acabado.getCosto()*spinner.getValue()));
        }
    }

    @FXML
    private void guardarDiseno(ActionEvent event) {
        if(CLIENTE.isRegistrado()){
            CLIENTE.getDisenos().add(casaescogida);
        }else {
            System.out.println("No se ha registrado");
        }
        
    }

    @FXML
    private void enviarDiseno(ActionEvent event) {
        if(CLIENTE.isRegistrado()){
            DisenoPDF diseno = new DisenoPDF(casaescogida,cuenta);
            diseno.enviarPDF();
        }else {
            System.out.println("No esta registrado");
        }
    }

}
