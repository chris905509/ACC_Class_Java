import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stackChars=new Stack<Integer>();
        String x="342+*2*";
        char[] a;
        a= x.toCharArray();
        int num1=0;
        int num2=0;
        int total=0;
        stackChars.push(0);

        for(char ch:a)
        {
                if (ch == '+') {

                        num1 = stackChars.pop();
                        num2=stackChars.pop();
                        total=num1 + num2;
                        stackChars.push( num2 + num1);



                } else if (ch == '-') {

                    num1 = stackChars.pop();
                    num2=stackChars.pop();
                    total=num1 - num2;
                    stackChars.push( num1 - num2);

                } else if (ch == '*') {

                    num1 = stackChars.pop();
                    num2=stackChars.pop();
                    total=num1 * num2;
                    stackChars.push( num2 * num1);

                } else if (ch == '/') {
                    num1 = stackChars.pop();
                    num2=stackChars.pop();
                    total=num1 / num2;
                    stackChars.push( num1 / num2);
                } else {
                    stackChars.push(Integer.parseInt(String.valueOf(ch)));
                }

            }

        System.out.println(total);
        }





    }


//Stack<Character> stackChars=new Stack<Character>();
//String x="{()}[]({[]})";
//char[] a;
//a= x.toCharArray();
//
//        for(char ch:a)
//        {
//        if(!stackChars.isEmpty() && ch=='}'&& stackChars.peek()=='{')
//        {
//        stackChars.pop();
//            }else
//                    if(!stackChars.isEmpty() && ch==']'&& stackChars.peek()=='[')
//        {
//        stackChars.pop();
//            }else
//                    if(!stackChars.isEmpty() && ch==')'&& stackChars.peek()=='(')
//        {
//        stackChars.pop();
//            }else{
//                    stackChars.push(ch);
//            }
//                    }
//                    System.out.println(stackChars.isEmpty());

