import java.io.*;

public class SequenceDemo {
    public static void main(String[] args) throws IOException {
        File firstFile=new File("C:\\Practice Folder\\Java\\JavaIO\\FilesCreatedByIO\\FirstSequence.txt");
        File secondFile=new File("C:\\Practice Folder\\Java\\JavaIO\\FilesCreatedByIO\\SecondSequence.txt");
        FileInputStream firstFileInputStream=new FileInputStream(firstFile);
        FileInputStream secondFileInputStream=new FileInputStream(secondFile);
        SequenceInputStream sequenceInputStream=new SequenceInputStream(firstFileInputStream,secondFileInputStream);
        int stream=0;
        FileReader fileReader=new FileReader(firstFile);
        BufferedReader buferedReader=new BufferedReader(fileReader);
        while(buferedReader.read()!=-1){
            stream= buferedReader.read();;
            char charStream=(char)stream;
            System.out.print(charStream);
        }

    }
}
