package aost.ms;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.StreamTokenizer;
import java.util.LinkedList;
public class Main{
    public static void main(String[] args) throws IOException {
        StreamTokenizer st=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        String str;
        st.nextToken();
        int k=(int)st.nval;
        st.nextToken();
        long n=(long)st.nval;
        n--;

        LinkedList<Long> stack=new LinkedList<>();
        while (n>0){
            stack.addLast(n%9);
            n/=9;
        }

        long ans=0;
        while(!stack.isEmpty()){
            ans*=10;
            if(stack.peekFirst()>=k){
                ans+=stack.pollFirst()+1;
            } else{
                ans+=stack.pollFirst();
            }
        }

        System.out.println(ans);
    }
}