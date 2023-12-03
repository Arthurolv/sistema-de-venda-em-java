 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javavendass;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import formulario.frmRelatoriosVendas;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.Document;







public class Relatorio {
    public static void relatorioFatura(String arquivo, ResultSet rs){
        com.itextpdf.text.Document documento = new com.itextpdf.text.Document();
    try {
        //com.itextpdf.text.Document documento = new com.itextpdf.text.Document();
        PdfWriter.getInstance(documento, new FileOutputStream(arquivo));
        String texto = "relatorio de venda";
        
        
        documento.open();
        Paragraph paragrafo = new Paragraph(texto);
        documento.add(paragrafo);
        
        paragrafo = new Paragraph(" ");
        documento.add(paragrafo);
        boolean haRegistro = rs.next();
        PdfPTable tabela;
        
        int totQuantFat =0;
        int totValFat =0;
        int totQuantGer =0;
        int totValger =0;
        
        while(haRegistro){
        tabela = new PdfPTable(2);
        tabela.addCell("venda #:");
        tabela.addCell(rs.getString( "idFatura"));
        
        tabela.addCell("id usuario");
        tabela.addCell(rs.getString( "idUsuario"));
        
        tabela.addCell("nome");
        tabela.addCell(rs.getString( "nomeFull"));
        
        paragrafo = new Paragraph();
        paragrafo.add(tabela);
        documento.add(paragrafo);
        
        paragrafo = new Paragraph(" ");
        documento.add(paragrafo);
        
        totQuantFat =0;
        totValFat =0;
         tabela = new PdfPTable(6);
         tabela.addCell("Linha");
         tabela.addCell("Id Produto");
         tabela.addCell("descricao");
         tabela.addCell("preco");
         tabela.addCell("comissão");
         tabela.addCell("valor");
        
          paragrafo = new Paragraph();
        paragrafo.add(tabela);
        documento.add(paragrafo);
         
        int faturaAtual = rs.getInt("idFatura");
        
        
        
        while(haRegistro && faturaAtual == rs.getInt("idFatura")){
        
         tabela = new PdfPTable(6);
         tabela.addCell(rs.getString("idLinha"));
         tabela.addCell(rs.getString("idProduto"));
         tabela.addCell(rs.getString("descricao"));
         tabela.addCell(rs.getString("preco"));
         tabela.addCell(rs.getString("quantidade"));
         tabela.addCell(rs.getString("valor"));
         
         paragrafo = new Paragraph();
        paragrafo.add(tabela);
        documento.add(paragrafo);
          totQuantFat += rs.getInt("quantidade");
          totValFat += rs.getInt("valor");
            haRegistro = rs.next();
        
        
        }
         tabela = new PdfPTable(6);
         tabela.addCell("");
         tabela.addCell("");
         tabela.addCell("");
         tabela.addCell("total vendas");
         tabela.addCell("" + totQuantFat);
         tabela.addCell("" + totValFat);
         
         paragrafo = new Paragraph();
        paragrafo.add(tabela);
        documento.add(paragrafo);
        
        totQuantGer += totQuantFat;
         totValger += totValFat;
        
         paragrafo = new Paragraph(" ");
        documento.add(paragrafo);
        
        
        }
        
         tabela = new PdfPTable(6);
         tabela.addCell(" ");
         tabela.addCell("");
         tabela.addCell("");
         tabela.addCell("total Geral");
         tabela.addCell(""+ totQuantGer);
         tabela.addCell(""+ totValger);
         
         paragrafo = new Paragraph();
        paragrafo.add(tabela);
        documento.add(paragrafo);
            
            
            
        documento.close();
        

           
    } catch (Exception ex) {
        Logger.getLogger(frmRelatoriosVendas.class.getName()).log(Level.SEVERE, null, ex);
    }finally{
        documento.close();
    }
    
    
    
        }
    }

