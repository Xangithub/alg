package home.local.dz5;

public class Dz5 {

    public static void main(String[] args) {
        System.out.println(raise(3,4));
    }

    static int raise(int number, int n){
        n--;
        if(n>0) return  number * raise(number,n);
        else return number;
    }

}
