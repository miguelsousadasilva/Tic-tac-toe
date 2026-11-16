//tres en raya contra ia
//puedes elegir entre tres dificultades facil, normal, dificil.
//en el modo facil la ia juegas movimientos aleatorios.
//en el modo normal la ia solo predice unas jugadas por delante
//en el modo dificil la ia predice todas las jugadas hasta el final

import java.util.Scanner;
improt java.util.Random;

public class tictactoe{

  public static void main(String[]args){
    juego(menu());
  }
  
  public static int menu(){
    System.out.println("DIFICULTAD");
    System.out.println("==========");
    System.out.println("1.FACIL   ");
    System.out.println("2.NORMAL  ");
    System.out.println("3.DIFICIL ");
    return imput();
  }
  
  public static void game(int dificultad){
    
    String [] tablero = new String [9]; 
    System.out.println(""+tablero[1]+""+"|"+""+tablero[2]+""+"|"+""+tablero[3]+"");
    System.out.println(""+tablero[4]+""+"|"+""+tablero[5]+""+"|"+""+tablero[8]+"");
    System.out.println(""+tablero[7]+""+"|"+""+tablero[8]+""+"|"+""+tablero[9]+"");
    if(turno==1){
      tablero[ia]="x";
      turno--;
    }
    if(turno==0){
      tablero[imput()];
      turno++;
    }
  }
  
  public static int ia(){
    
  }
  
   public static int imput(){
    Scanner sc = new scanner(System.in);
    do{
      int imp="";
      imp=sc.nextInt();
    }while(imp>=10);
    return imp;
  }
  
}
