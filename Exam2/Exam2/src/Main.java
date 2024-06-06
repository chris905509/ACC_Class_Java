public class Main {
    public static void main(String[] args) {


        String a= "xyz";
        String b= "abc";

        a=a+b;
        b=b+a;
        a=a.substring(b.length()-a.length());
        b=b.substring(a.length(),b.length()-a.length());

       System.out.println(a);
       System.out.println(b);


       recur("ABC","");


    }

    public static void recur(String s,String q)
    {
        if(s.length()==0)
        {
            System.out.println(q);
            return;}

       char[] c= s.toCharArray();

       for(int i=0;i<c.length;i++)
       {
           String r=new String(q+c[i]);
           recur(s.substring(0,i)+s.substring(i+1,c.length),r);
       }

    }

}


//char[] d=new char[c.length-1];
//int count=0;
//
//             for(int j=0;j<c.length;j++)
//        {
//        if(i!=j)
//        {
//d[count]=c[j];
//count++;
//        }
//        }
//String e= new String(d);
//recur(e);
//           System.out.print(c[i]);
//           if(d.length==0)
//        System.out.println();
////