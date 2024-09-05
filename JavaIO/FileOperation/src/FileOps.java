import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOps {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            File fileInput=new File("C:\\Practice Folder\\Java\\JavaIO\\FilesCreatedByIO\\ByteStreamInput.txt");
            File fileOutput=new File("C:\\Practice Folder\\Java\\JavaIO\\FilesCreatedByIO\\ByteStreamOutput.txt");
            if(!fileOutput.isFile()){
                fileOutput.createNewFile();
            }
            FileInputStream inputStream=new FileInputStream(fileInput);
            FileOutputStream outputStream=new FileOutputStream(fileOutput);

            //Byte by Byte
            byte[] inputBytes=new byte[1024];
            while(inputStream.read()!=-1){
                System.out.println("Available Bytes :"+inputStream.available());
                inputStream.read(inputBytes);
                outputStream.write(inputBytes);
            }

        }catch (Exception e){
            System.out.println("Exception");
        }

    }
}
