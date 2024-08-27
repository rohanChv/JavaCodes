public class StringDemo {
    public static void stringOperation(StringOps stringOpsObject,String inputString){
        System.out.println(stringOpsObject.operation(inputString));
    }
    public static void main(String[] args) {
        String input="This is Lambda Function converted to Upper Case";
        String inputTwo="This is Lambda Function      is used to remove Spaaces in String";
        String inputThree="Malayalam is a palindrome. So is AKA";

        StringOps upperCaseOperation= (inputString) -> inputString.toUpperCase();

        stringOperation(upperCaseOperation,input);
        StringOps removeSpaces=(inputString)->{
            String result="";
            for(int i=0;i<inputString.length();i++){
                if(inputString.charAt(i)!=' '){
                    result+=inputString.charAt(i);
                }
            }
            return result;
        };
        stringOperation(removeSpaces,inputTwo);

        StringOps reverseString=(inputString)->{
            String result="";
            for(int i=inputString.length()-1;i>=0;i--){
                    result+=inputString.charAt(i);
            }
            return result;
        };
        stringOperation(reverseString,inputThree);
    }
}
