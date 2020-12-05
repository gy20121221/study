package aost;

public class Tphone extends Private1 {

    public  boolean getPrime(int a){
        if (a<2) {return false;}
        for (int i = 2; i*i<= a; i++)
        {
            if (a%i==0){return false;} }
        return true;
    }//最简单判断质数的办法。
}
