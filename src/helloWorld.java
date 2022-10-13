public class helloWorld {
    public static void main(String args[]){
        int a=10;
        int b=17;
        System.out.println("la somme est "+somme(a,b)+" la soustraction "+soustraction(a,b)+" multiplication "+multiply(a,b));
    }
    public static int  multiply(int a, int b){
        return a*b;
    }
    public static int  somme(int a, int b){
        return a+b;
    }
    public static int  soustraction(int a, int b){
        if(a>b){
            return a-b;
        }
        else{
            return b-a;

        }
    }

}
