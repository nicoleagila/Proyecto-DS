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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static modelo.PDF.CHAPTERFONT;

/**
 *
 * @author nicoleagila
 */
public class ReportePDF extends PDF{
    Cuenta vendedor;

    public ReportePDF(Casa casa, Cuenta c, Cuenta vendedor) {
        super(casa, c);
        this.vendedor=vendedor;
    }

    @Override
    public String generarPDF() {
        String path = "/recursos/ReporteDisenoPDF".concat(vendedor.getUser()).concat(".pdf");
        escribirPDF(new File(path));
        return path;
    }

    @Override
    public void escribirPDF(File pdfNewFile) {
        try {
            Document document = new Document();
            try {
                PdfWriter.getInstance(document, new FileOutputStream(pdfNewFile));

            } catch (FileNotFoundException fileNotFoundException) {
                Logger.getLogger(ReportePDF.class.getName()).log(Level.SEVERE, null, "(No se encontró el fichero para generar el pdf)" + fileNotFoundException);
            }
            document.open();
            
            document.addTitle("REPORTE DISENO DE CASA");
            
            Chunk chunk = new Chunk("Reporte de recomendacion de diseno de casa", CHAPTERFONT);
            chunk.setBackground(BaseColor.GRAY);
            Chapter chapter = new Chapter(new Paragraph(chunk), 1);
            chapter.setNumberDepth(0);
            Image image;
            try {
                image = Image.getInstance(iTextExampleImage);  
                image.setAbsolutePosition(2, 150);
                chapter.add(image);
            } catch (IOException ex) {
                Logger.getLogger(ReportePDF.class.getName()).log(Level.SEVERE, null, "Image IOException " + ex);
            }
            Paragraph parrafo= new Paragraph();
            parrafo.add(casa.getNombre());
            parrafo.add("Numero de banos: ".concat(Integer.toString(casa.getNumBanos())));
            parrafo.add("Numero de habitaciones: ".concat(Integer.toString(casa.getNumHabitaciones())));
            parrafo.add("Numero de pisos: ".concat(Integer.toString(casa.getNumeroPisos())));
            casa.getAcabados().forEach(a -> {
                parrafo.add("ACABADOS:");
                parrafo.add("> ".concat(a.getNombre()));
            });
            parrafo.add("Reporte enviado por:".concat(vendedor.getUsuario().getNombre().concat(" ").concat(vendedor.getUsuario().getApellido())));
            parrafo.setFont(PARAGRAPHFONT);
            chapter.add(parrafo);
            document.add(chapter);
            document.close();
            Logger.getLogger(ReportePDF.class.getName()).log(Level.FINE, null, "El reporte se ha generado!");
        } catch (DocumentException documentException) {
            Logger.getLogger(ReportePDF.class.getName()).log(Level.SEVERE, null, "Se ha producido un error al generar un documento: " + documentException);
        }
    }
    
}
