/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorf;


import java.util.Random;

/**
 *
 * @author metta
 */
public class Oponent implements iHit{
    
    protected String type;
    protected int power;
    protected int deffence;
    protected int rand;
    Random random = new Random();
    @Override
    public void hitable(String choice,Executioner Draven,Archer Varus, Zombie Brand) {
            if ("Archer".equals(choice))
            {
                power = random.nextInt(15) + 10;
                Varus.setDefence(Varus.getDefence()- power);
                System.out.printf("U was hited with %d dmg and now u are with %d Health\n",this.power,Varus.Defence);
            }
            if ("Executioner".equals(choice))
            {
                power = random.nextInt(15) + 10;
                Draven.setDefence(Draven.getDefence()-power);
                System.out.printf("U was hited with %d dmg and now u are with %d Health\n",this.power,Draven.Defence);
            }
            if ("Zombie".equals(choice))
            {
                power = random.nextInt(15) + 10;
                Brand.setDefence(Brand.getDefence()-power);
                System.out.printf("U was hited with %d dmg and now u are with %d Health\n",this.power,Brand.Defence);
            }
            
        }
    public Oponent(String type,int deffence){
        this.deffence = deffence;
        this.type = type;
    }
    
     }
    
    

