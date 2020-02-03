/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.*; 
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author nicoleagila
 */
public class DisenoPDF extends PDF{

    public DisenoPDF(Casa casa, Cuenta c) {
        super(casa, c);
    }


    
    @Override
    public void escribirPDF(File pdfNewFile){
        try{
            Document document = null;
            try {
                document = new Document();
                PdfWriter.getInstance(document, new FileOutputStream(pdfNewFile));

            } catch (FileNotFoundException fileNotFoundException) {
                Logger.getLogger(DisenoPDF.class.getName()).log(Level.SEVERE, null, "(No se encontró el fichero para generar el pdf)" + fileNotFoundException);
            }
            document.open();
            
            document.addTitle("DISENO DE CASA PREDETERMINADA");
            
            // First page
            Chunk chunk = new Chunk(casa.getNombre(), CHAPTERFONT);
            chunk.setBackground(BaseColor.GRAY);
            Chapter chapter = new Chapter(new Paragraph(chunk), 1);
            chapter.setNumberDepth(0);
            // We add an image (Añadimos una imagen)
            Image image;
            try {
                image = Image.getInstance(iTextExampleImage);  
                image.setAbsolutePosition(2, 150);
                chapter.add(image);
            } catch (IOException ex) {
                Logger.getLogger(DisenoPDF.class.getName()).log(Level.SEVERE, null, "Image IOException: " +  ex);
            }
            Paragraph parrafo= new Paragraph();
            parrafo.add("Numero de banos: ".concat(Integer.toString(casa.getNumBanos())));
            parrafo.add("Numero de habitaciones: ".concat(Integer.toString(casa.getNumHabitaciones())));
            parrafo.add("Numero de pisos: ".concat(Integer.toString(casa.getNumeroPisos())));
            casa.getAcabados().forEach((a) -> {
                parrafo.add("ACABADOS:");
                parrafo.add("> ".concat(a.getNombre()));
            });
            parrafo.setFont(PARAGRAPHFONT);
            chapter.add(parrafo);
            document.add(chapter);
            document.close();
            
            Logger.getLogger(DisenoPDF.class.getName()).log(Level.FINE, null, "El reporte se ha generado!");
        } catch (DocumentException documentException) {
            Logger.getLogger(DisenoPDF.class.getName()).log(Level.SEVERE, null, "Se ha producido un error al generar un documento: " + documentException);
        }
    } 

    @Override
    public String generarPDF() {
        String path = "/recursos/DisenoPDF".concat(cuentaDestino.getUser()).concat(".pdf");
        escribirPDF(new File(path));
        return path;
    }

}
