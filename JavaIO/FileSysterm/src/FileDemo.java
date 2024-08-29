import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File baseDirectory=new File("C:\\Practice Folder\\Java\\JavaIO\\FilesCreatedByIO");
        File directory=new File("C:\\Practice Folder\\Java\\JavaIO\\FilesCreatedByIO\\FirstDirectory");
        File firstFile=new File("C:\\Practice Folder\\Java\\JavaIO\\FilesCreatedByIO\\FirstFile.txt");


        if(!firstFile.isFile()){
            System.out.println("File not Found");
            firstFile.createNewFile();
        }

        String filename=(firstFile.isFile())?firstFile.getName():"Not found";
        System.out.println("File name :"+filename);


        if(!directory.isDirectory()){
            System.out.println("Directory not Found.Creating New");
        }
        directory.mkdir();
        System.out.println("Contents of the Folder FilesCreatedByIO are :\n");
        File[] listOfFilesAndDirectories=baseDirectory.listFiles();


        for(int i=0;i< listOfFilesAndDirectories.length;i++){
            String type=listOfFilesAndDirectories[i].isFile()?" (File) ":listOfFilesAndDirectories[i].isDirectory()?" (Directory)":null;
            System.out.println(listOfFilesAndDirectories[i].getName()+type);
        }

    }
}
