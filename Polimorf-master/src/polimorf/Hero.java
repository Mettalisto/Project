/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorf;

/**
 *
 * @author user
 */
public abstract class Hero {
    protected String name;
    protected String heroType;
    protected int Power;
    protected int Defence;
    public void move(int len, String d){
        System.out.printf("%s moved with %d blocks to %s", this.name,len,d);
        System.out.println();
    }
    public Hero(String name,String heroType,int Power,int Defence){
        this.name = name;
        this.heroType = heroType;
        this.Power = Power;
        this.Defence = Defence;
    }
}
