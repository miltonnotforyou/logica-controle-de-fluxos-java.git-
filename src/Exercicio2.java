public class Exercicio2 {
    public static void main(String[] args){

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2 " + (b1 && b2));//-> && conjunção
        System.out.println("b1 && b3 " + (b1 && b3));//-> && conjunção

        System.out.println("b2 || b3 " + (b2 || b3));//-> || disjunção
        System.out.println("b2 || b4 " + (b2 || b4));//-> || disjunção

        System.out.println("b1 ^ b3 " + (b1 ^ b3));//-> ^ disjunção exclusiva
        System.out.println("b4 ^ b1 " + (b4 ^ b1));//-> ^ disjunção exclusiva

        System.out.println(!b1);//-> ! negação
        System.out.println(!b2);//-> ! negação

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;
        System.out.println("((i1 + i2) < (f2 - f1)) && true " + ((i1 + i2 < (f2 - f1)) && true));
        System.out.println("(i1 > i2) || (f2 < f1)) " + ((i1 > i2) || (f2 < f1)));

        double salarioMensal = 10893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitoaDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitoaDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitoaDependentes);//-> simplificado
        System.out.println("Recebe Auxilio: " + recebeAuxilio);//-> simplificado
    }

}
