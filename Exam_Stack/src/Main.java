import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Integer[] arr={1,5,7,8,9};
        Stac a=new Stac(arr,5);
        Integer[] tem=new Integer[a.size()];
        Stac temp=new Stac(tem,a.size());
        temp.clear();
        a=reverseStac(a,temp);
        a.display();




    }

    public static Stac reverseStac(Stac s,Stac temp)
    {
        if(s.isEmpty())
            return s;

        Integer first=s.pop();
        temp.push(first);

        reverseStac(s,temp);

        return temp;
    }
}



