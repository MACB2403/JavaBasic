package package_01;

public class Clase09Operadores {

    public static void main(String[] args) {
        int a=7, b=3, c;
        c=a+b;
        System.out.println("*** OPERADORES ***");
        System.out.println("\tOPERADORES ARITMÉTICOS");
        System.out.println("\t\ta+b: "+c);
        c=a-b;
        System.out.println("\t\ta-b: "+c);
        c=a*b;
        System.out.println("\t\ta*b: "+c);
        c=a/b;
        System.out.println("\t\ta/b: "+c);
        c=a%b;
        System.out.println("\t\ta%b: "+c);
        System.out.println("\tOPERADORES UNARIOS");
        System.out.println("\t\tOperador unario positivo +a = " + (+a));
        System.out.println("\t\tOperador unario negativo -a = " + (-a));
        System.out.println("\t\tOperador unario de pre-incremento ++a = " + (++a));//primero se incrementa el valor
        a=7;
        System.out.println("\t\tOperador unario de post-incremento a++ = " + (a++));//primero se el valor y despues se incrementa
        System.out.println("\t\tDespues del post-incremento a: "+a);
        a=7;
        System.out.println("\t\tOperador unario de pre-decremento --a = " + (--a));//primero se incrementa el valor
        a=7;
        System.out.println("\t\tOperador unario de post-decremento a-- = " + (a--));//primero se el valor y despues se incrementa
        System.out.println("\t\tDespues del post-decremento a: "+a);

        System.out.println("\tOPERADORES ASIGNACION");
        c=5;
        System.out.println("\t\tc = " + c);
        System.out.println("\t\tc -=4 " + (c+=4));
        c=5;
        System.out.println("\t\tc -=4 " + (c-=4));
        c=5;
        System.out.println("\t\tc *=4 " + (c*=4));
        c=5;
        System.out.println("\t\tc /=4 " + (c/=4));
        c=5;
        System.out.println("\t\tc %=4 " + (c%=4));

        System.out.println("\tOPERADORES DE COMPARACION");
        c=5;
        a=7;
        b=3;
        System.out.println("\t\ta==c " + (a==c));
        System.out.println("\t\ta!=c " + (a!=c));
        System.out.println("\t\ta>c " + (a>c));
        System.out.println("\t\ta>=c " + (a>=c));
        System.out.println("\t\ta<c " + (a<c));
        System.out.println("\t\ta<=c " + (a<=c));

        System.out.println("\tOPERADORES LÓGICOS");
        System.out.println("\t\t(a>b)&&(b>c) = " + ((a>b)&&(b>c)));
        System.out.println("\t\t(a>b)||(b>c) = " + ((a>b)||(b>c)));
        System.out.println("\t\t!(a>b) = " + (!(a>b))
}
