import java.util.Scanner;

public class BufferOps {
    public static void main(String[] args) {
        String[] subjectArray=new String[3];
        String[] marksArray=new String[3];
        int sum=0;
        for(int i=0;i<3;i++){
            System.out.println("Enter the Subject "+(i+1));
            Scanner sc=new Scanner(System.in);
            subjectArray[i]=sc.next();
            System.out.println("Enter Marks of "+subjectArray[i]+"\n");
            marksArray[i]=sc.next();
            sum+=Integer.parseInt(marksArray[i]);
        }
        System.out.println("=======X=X=X=X=X=======");
        StringBuffer finalString=new StringBuffer();
        for(int j=0;j<3;j++){
            int append=marksArray[j].length()+subjectArray[j].length();
            finalString.append(subjectArray[j]);
            for(int i=0;i<15-append;i++){
                finalString.append(" ");
            }
            finalString.append(marksArray[j]);
            System.out.println("\t"+finalString);
            finalString.delete(0,finalString.length());
        }
        System.out.println("=======X=X=X=X=X=======");
        System.out.println("\tTOTAL        "+sum);
    }
}
