package com.example.spring.demo.pdf;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.BarcodeQRCode;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;


public class BarCode
{
        public static void main(String[] args)
        {
                try
                {
                        Document document = new Document();
                        PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("HelloWorld2.pdf"));

                        document.open();
                        BarcodeQRCode qrcode = new BarcodeQRCode("23456", 1, 1, null);
                        Image qrcodeImage = qrcode.getImage();
                        qrcodeImage.setAbsolutePosition(20, 500);
                        qrcodeImage.scalePercent(200);
                        document.add(qrcodeImage);

                        document.close();
                }
                catch (FileNotFoundException e)
                {
                        e.printStackTrace();
                }
                catch (DocumentException e)
                {
                        e.printStackTrace();
                }
        }
}
