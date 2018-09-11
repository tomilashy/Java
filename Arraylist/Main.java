/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
import java.util.ArrayList;


class Main {
  public static void main(String[] args) {
    ArrayList<movie> arr= new ArrayList<movie>();

    Scanner input= new Scanner(System.in);
    System.out.println("How many movies do you want to store?");
    double num=input.nextDouble();
    for (int i=0; i<num;i++)
    {
        System.out.println("What is the name of the movie?");
        String name=input.next();
        System.out.println("what year was it released?");
        int year=input.nextInt();
        movie mov=new movie(name,year);
        arr.add(mov);
    }
    
   System.out.println("Here are your list of movies");
      for (int i=0; i<num;i++)
    {
        arr.get(i).print();
    }
  }
}