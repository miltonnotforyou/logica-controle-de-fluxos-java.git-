public class Exercico1 {
    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5F;
        float f2 = 3.5F;
        double d1 = 59.6D;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "fulano";
        String s2 = "fulano";
        String s3 = "cicrano";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1597L;
        long l2 = 8997L;
        byte y1 = 1;
        short h1 = 25;

        System.out.println(i1 == i2);
        System.out.println(i1 != i2);
        System.out.println(i1 > i2);
        System.out.println(i1 <= i2);

        System.out.println(f1 == f2);
        System.out.println(f1 != f2);
        System.out.println(f1 > f2);
        System.out.println(f1 <= f2);

        System.out.println(c1 == c2);
        System.out.println(c1 != c2);
        System.out.println(c1 > c2);
        System.out.println(c1 <= c2);


        System.out.println(s1 == s2);
        System.out.println(s1 != s2);
        //System.out.println(s1 > s2); -> tipo string não pode ser comparado em tamanho
        //System.out.println(s1 <= s2); -> tipo string não pode ser comparado em tamanho

        System.out.println(b1 == b2);
        System.out.println(b1 != b2);
        //System.out.println(b1 > b2); //-> tipo boolean não pode ser comparado em tamanho
        //System.out.println(b1 <= b2); -> tipo boolean não pode ser comparado em tamanho

        System.out.println(i2 > f1);
        System.out.println(d1 == h1 );
        //System.out.println(s2 != c1); //-> tipos de dados muito diferentes não pode ser comparados em similaridade
        //System.out.println(s3 <= i1); //-> tipos de dados muito diferentes não pode ser comparado em tamanho

        System.out.println(l1 == i2 ); // -> long e inteiro podem ser comparados
        System.out.println(l2 >= i1); // -> long e inteiro podem ser comparados
        System.out.println(y1 != h1); // -> byte e short podem ser comparados


    }
}