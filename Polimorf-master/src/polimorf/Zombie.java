/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorf;

import java.util.Random;

/**
 *
 * @author user
 */
public class Zombie extends Hero{
    private String color;
    private String poison;
    private int rand;
    Random random = new Random();
    
     public int getDefence(){
        return this.Defence;
    }
    public void setDefence(int def){
        this.Defence = def;
    }
    
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public int getPower(){
        return this.Power;
    }
    public void setPower(int Power){
        this.Power = Power;
    }
    
    public String getHeroType(){
        return this.heroType;
    }
    public void setHeroType (String HT){
        this.heroType = HT;
    }
    

    public Zombie(String name,String heroType,int Power,int Defence) {
        super(name,heroType,Power,Defence);
    }

    public void hit(Oponent Enemy) {
        rand = random.nextInt(15)+15;
        Enemy.deffence = Enemy.deffence - rand;
        System.out.printf("%s steal enemy's BRAINNNN and do %d demage to the oponent! Now he is with %d health!\n",super.name,this.rand,Enemy.deffence);      
    }

    
    
}
