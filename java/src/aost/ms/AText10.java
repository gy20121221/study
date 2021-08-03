package aost.ms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @author aost
 * @version 1.0
 * @description:
 * @date 2021/8/2 14:07
 */
public class AText10  {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        String str;
        st.nextToken();
        int k=(int)st.nval;
        st.nextToken();
        long n=(long)st.nval;
        n--;
        System.out.println(n);
        System.out.println(k);
    }

}
