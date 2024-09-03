import java.util.Scanner;

public class BufferOps {
    public static void main(String[] args) {
        String[] subjectArray=new String[3];
        String[] marksArray=new String[3];
        for(int i=0;i<3;i++){
            System.out.println("Enter the Subject "+(i+1)+"\n");
            Scanner sc=new Scanner(System.in);
            subjectArray[i]=sc.nextLine();
            System.out.println("Enter Marks of Subject "+subjectArray[i]+"\n");
            marksArray[i]=sc.nextLine();
        }
        System.out.println("=======X=X=X=X=X=======");
        StringBuffer finalString=new StringBuffer();
        for(int j=0;j<3;j++){
            int append=marksArray[j].length()+subjectArray[j].length();
            finalString=finalString.append(subjectArray[j]);
            for(int i=0;i<15-append;i++){
                finalString=finalString.append(" ");
            }
            finalString=finalString.append(marksArray[j]);
            System.out.println("\t"+finalString);
            finalString.delete(0,finalString.length());
        }
        System.out.println("=======X=X=X=X=X=======");
    }
}
