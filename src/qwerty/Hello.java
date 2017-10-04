package qwerty;

public class Hello {
    public static void main(String[] args) {
        System.out.print("Hello World");
        System.out.print(" Бұл зертханалық жұмыстың мақсаты");
        System.out.print("GitHub-пен жұмыс жасап үйрену");

        int a=MyMath.kvadrat( 5);
        int b=MyMath.kub( 5);
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("max="+ MyMath.max3( 8,  9, 8));
        System.out.println("min="+ MyMath.min3(12,8,15));
    }
}
