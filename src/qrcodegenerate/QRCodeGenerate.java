package qrcodegenerate;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QRCodeGenerate {
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
       String details = "QR Code";
       ByteArrayOutputStream out = QRCode.from(details).to(ImageType.PNG).stream();
       File f = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\QRCodeGenerate\\MyPic.png");
       FileOutputStream fos = new FileOutputStream(f);
       fos.write(out.toByteArray());
       fos.flush();
    }
    
}
