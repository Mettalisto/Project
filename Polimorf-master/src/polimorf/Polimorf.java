/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorf;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Polimorf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Executioner Draven = new Executioner("The big man"," Executioner",90,60);
        Archer Varus = new Archer("The wild arrow ","Archer",75,70);
        Zombie Brand = new Zombie("Brain lover ","Zombie",65,100);
        Oponent Enemy = new Oponent("Ragnarok",150);
        Scanner sc = new Scanner(System.in);
        System.out.print("What kinf of hero you want ?(Archer,Zombie,Executioner)");
        String a = sc.nextLine();
        if(a.equals("Archer"))
        {
            do
            {
                Varus.hit(Enemy);
                if(Enemy.deffence <=0)
                {
                    
                    System.out.print("You win\n");
                    break;
                }
                    Enemy.hitable(a, Draven, Varus, Brand);
                if(Varus.Defence <=0)
                {
                    
                    System.out.print("Game over \n");
                    break;
                }
                
            }while(Varus.Defence > 0 || Enemy.deffence > 0);
        }
        else if(a.equals("Executioner"))
        {
            do
            {
                Draven.hit(Enemy);
                if(Enemy.deffence<=0)
                {
                    
                    System.out.print("You win\n");
                    break;
                }
                    Enemy.hitable(a, Draven, Varus, Brand);
                if(Draven.Defence <=0)
                {
                    
                    System.out.print("Game over \n");
                    break;
                }
                
            }while(Draven.Defence > 0 || Enemy.deffence > 0);
        }
        else if(a.equals("Zombie"))
        {
            do
            {
                Brand.hit(Enemy);
                if(Enemy.deffence <=0)
                {
                    
                    System.out.print("You win\n");
                    break;
                }
                    Enemy.hitable(a, Draven, Varus, Brand);
                if(Brand.Defence <=0)
                {
                    
                    System.out.print("Game over \n");
                    break;
                }
                
            }while(Varus.Defence > 0 || Enemy.deffence > 0);
        }
        
      
}
}
