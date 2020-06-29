package sample;




import java.util.*;

public class StacksTest {
    /**
     * Reverse a given string
     * @param input
     * @return
     * @throws Exception
     */
    private static String reverseString(String input){
        StringBuffer stringBuffer = new StringBuffer();
        Stack<Character> stack =new Stack<>();
        if (null!=input) {
            for (Character chara : input.toCharArray()) {
                stack.push(chara);
            }
            while (!stack.isEmpty()) {
                stringBuffer.append(stack.pop());
            }
        }
     return stringBuffer.toString();
    }
    /**
     * To check whether provided expression is balanced or not
     */
    private static boolean balanceExpression (String input){

        List<Character> openCharArray=new ArrayList<Character>();
        openCharArray.add('(');
        openCharArray.add('[');
        List<Character> closeCharArray=new ArrayList<Character>();
        closeCharArray.add(')');
        closeCharArray.add(']');
        HashMap<Character,Character> charHashMap= new  HashMap();
        charHashMap.put(')','(');
        charHashMap.put(']','[');

        Stack<Character> characterStack = new Stack<>();
        boolean validArray=false;
        for(char inpuChar:input.toCharArray()){
            if(openCharArray.contains(inpuChar)){
                characterStack.push(inpuChar);
            }else if(closeCharArray.contains(inpuChar)){
                if(!characterStack.isEmpty()){
                    char lastChar=  characterStack.pop();
                    if((lastChar == charHashMap.get(inpuChar))){
                        validArray=true;
                    }
                }

            }
        }
        return validArray;
    }
    /**
     *
     * @param args
     */
    public static void main(String []args){
        //reverse string
       System.out.println("String is valid or not:" +balanceExpression("([])(654767)])"));

    }
}
