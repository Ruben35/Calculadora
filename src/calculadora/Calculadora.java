
package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        numeros n = new numeros();
        System.out.println("---------Bienvenido a la calculadora------");
        int op1=0;
        String op2="S";
        do{
            System.out.println("==========================================");
            System.out.println("¿Que operación desea hacer?");
            System.out.println("1.-Sumar");
            System.out.println("2.-Restar");
            System.out.println("3.-Multiplicar");
            System.out.println("4.-Dividir");
            System.out.println("5.-Salir");
            do{
                System.out.print("X: ");
                op1=s.nextInt();
                if(op1==0 || op1>5){
                    System.out.println("Ingrese una opcion valida...");
                }
            }while(op1==0 || op1>5);
            switch(op1){
                case 1:
                    System.out.println("==========================================");
                    System.out.println("Ingrese primer sumando...");
                    System.out.print("X: ");
                    n.setNum1(s.nextInt());
                    System.out.println("==========================================");
                    System.out.println("Ingrese segundo sumando...");
                    System.out.print("X: ");
                    n.setNum2(s.nextInt());
                    n.sumar();
                    System.out.println("==========================================");
                    System.out.println("Resultado: "+n.getResult());
                    System.out.println("==========================================");
                    System.out.println("¿Desea hacer alguna otra operacion? (S/N)");
                    do{
                        System.out.print("X: ");
                        op2=s.next();
                        if(!op2.equalsIgnoreCase("N") && !op2.equalsIgnoreCase("S")){
                            System.out.println("Ingrese una opcion valida...");
                        }
                    }while(!op2.equalsIgnoreCase("N") && !op2.equalsIgnoreCase("S"));
                break;
                case 2:
                    System.out.println("==========================================");
                    System.out.println("Ingrese minuendo...");
                    System.out.print("X: ");
                    n.setNum1(s.nextInt());
                    System.out.println("==========================================");
                    System.out.println("Ingrese sustraendo...");
                    System.out.print("X: ");
                    n.setNum2(s.nextInt());
                    n.restar();
                    System.out.println("==========================================");
                    System.out.println("Resultado: "+n.getResult());
                    System.out.println("==========================================");
                    System.out.println("¿Desea hacer alguna otra operacion? (S/N)");
                    do{
                        System.out.print("X: ");
                        op2=s.next();
                        if(!op2.equalsIgnoreCase("N") && !op2.equalsIgnoreCase("S")){
                            System.out.println("Ingrese una opcion valida...");
                        }
                    }while(!op2.equalsIgnoreCase("N") && !op2.equalsIgnoreCase("S"));
                break;            
                case 3:
                    System.out.println("==========================================");
                    System.out.println("Ingrese primer factor...");
                    System.out.print("X: ");
                    n.setNum1(s.nextInt());
                    System.out.println("==========================================");
                    System.out.println("Ingrese segundo factor...");
                    System.out.print("X: ");
                    n.setNum2(s.nextInt());
                    n.multi();
                    System.out.println("==========================================");
                    System.out.println("Resultado: "+n.getResult());
                    System.out.println("==========================================");
                    System.out.println("¿Desea hacer alguna otra operacion? (S/N)");
                    do{
                        System.out.print("X: ");
                        op2=s.next();
                        if(!op2.equalsIgnoreCase("N") && !op2.equalsIgnoreCase("S")){
                            System.out.println("Ingrese una opcion valida...");
                        }
                    }while(!op2.equalsIgnoreCase("N") && !op2.equalsIgnoreCase("S"));
                break;
                case 4:
                    System.out.println("==========================================");
                    System.out.println("Ingrese dividendo...");
                    System.out.print("X: ");
                    n.setNum1(s.nextInt());
                    System.out.println("==========================================");
                    System.out.println("Ingrese divisor...");
                    System.out.print("X: ");
                    n.setNum2(s.nextInt());
                    n.divide();
                    System.out.println("==========================================");
                    System.out.println("Resultado: "+n.getResult());
                    System.out.println("==========================================");
                    System.out.println("¿Desea hacer alguna otra operacion? (S/N)");
                    do{
                        System.out.print("X: ");
                        op2=s.next();
                        if(!op2.equalsIgnoreCase("N") && !op2.equalsIgnoreCase("S")){
                            System.out.println("Ingrese una opcion valida...");
                        }
                    }while(!op2.equalsIgnoreCase("N") && !op2.equalsIgnoreCase("S"));
                break;
                case 5:
                    op2="N";
                break;
            }
        }while(op2.equalsIgnoreCase("S"));{
            System.out.println("==========================================");
            System.out.println("¡Vuelva Pronto!");
        }
    }
}

