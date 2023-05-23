package OverloadingPackage;

public class Multiplication {

    public int multiply(int a, int b){
        return a*b;
    }

    public int multiply(int a, int b, int c){
        return a*b*c;
    }

    public int multiply(int a, int b, int c, int d){
        return a*b*c*d;
    }
    public int multiply(int ...a){
        int result = 1;
        for(int w : a){
            result *=w;
        }
        return result;
    }
}
