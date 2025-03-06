/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operaciones;

/**
 *
 * @author Yomi
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*//Entero, Flotante, Char, Booleano
       //short, byte, int, long
       byte a = 127;
       short b = 32767;
       int c = 2147483647;
       long d = 9223372036854775807L;

       System.out.println("Byte: "+ a);
       System.out.println("Short:" + b);
       System.out.println("Int:" + c);
       System.out.println("Long:" + d);

       //Punto Flotante
       // float, double
       float e = 3.4028235f;
       double f = 1.7976931348623157;
       final double PI = Math.PI;
       f = 3.76823;
       
         System.out.println("Float: " + e);
         System.out.println("Double: " + f);
         System.out.println("PI: " + PI);

        char letra = '$';
        boolean verdadero = true;
        boolean falso = false;

        System.out.println("Char: " + letra);
        System.out.println("Boolean: " + verdadero);
        System.out.println("Boolean: " + falso);

        //No Primitivos
        // String, Array, Clases, Interfaces
        String nombre = "Java";
        System.out.println("String: " + nombre);*/
       /*int numero1, numero2, suma, resta, multiplicacion;
       double division;
       Scanner teclado = new Scanner(System.in);

       System.out.println("Ingresa un numero entero: ");
       numero1 = teclado.nextInt();
       System.out.println("Ingresa otro numero entero: ");
       numero2 = teclado.nextInt();

       suma = numero1 + numero2;
       resta = numero1-numero2;
       multiplicacion = numero1*numero2;
       division = numero1/numero2;

       System.out.println("La suma es: " + suma);
       System.out.println("La resta es: " + resta);
       System.out.println("La multiplicacion es: " + multiplicacion);
       System.out.println("La division es: " + division);*/

        /*int lado, perimetro;
        double area;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa la medida del lado del cuadrado:");
        lado = teclado.nextInt();

        perimetro = lado*4;
        area = Math.pow(lado, 2);

        System.out.println("El perimetro del cuadrado es: " + perimetro);
        System.out.println("El area del cuadrado es: " + area);*/
        int a = 5, b = 3;
        //Operaciones Relacionales

        boolean identico = (a==b);//false
        boolean mayorque = (a>b);//true
        boolean menorque = (a<b);//false
        boolean mayorigual = (a>=b);//true
        boolean menorigual = (a<=b);//false
        boolean diferente = (a!=b);//true

        System.out.println("\n");
        System.out.println("Identico: " + identico);
        System.out.println("Mayor que: "+ mayorque);
        System.out.println("Menor que: " + menorque);
        System.out.println("Mayor igual que: "+ mayorigual);
        System.out.println("Menor igual que: "+ menorigual);
        System.out.println("Diferente: "+ diferente);

        //Operaciones de Asignación
        
        int suma2 = a+=b; //a = a+b
        int resta2 = a-=b;//a = a-b
        int multiplicacion2 = a*=b;
        int division2 = a/=b;
        int residuo2 = a%=b;

        System.out.println("La suma es: " + suma2);
        System.out.println("La resta es: " + resta2);
        System.out.println("La multiplicación es: " + multiplicacion2);
        System.out.println("La division es: " + division2);
        System.out.println("El residuo es: " + residuo2);

        //Opeaciones Logicas
        a = 5; b=3;
        boolean and = (a>b && a<b);//Si las 2 condiciones son verdaderas(true AND false = false)
        boolean or = (a>b || b<a);//Si una de las condiciones es verdadera(true OR true = true)
        boolean not = (!(a>b));//Da el valor contrario de la condición(true = false)

        System.out.println("AND: " + and);
        System.out.println("OR: " + or);
        System.out.println("NOT: " + not);
    



    }

    
    
}
