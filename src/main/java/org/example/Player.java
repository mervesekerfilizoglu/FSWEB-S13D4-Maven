package org.example;

  enum Weapon {
    SWORD(50, 1.2),
    AXE(60, 1.0),
    BOW(40, 1.5);


      private final int damage;
      private final double attackSpeed;


 Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}



public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = Math.max(0, Math.min(healthPercentage, 100));
        this.weapon = weapon;
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void loseHealth(int damage) {
        healthPercentage -= damage;
        if (healthPercentage <= 0) {
            healthPercentage = 0;
            System.out.println(name + " player has been knocked out of game");
        }
    }

    public void restoreHealth(int healthPotion) {
        healthPercentage = Math.min(100, healthPercentage + healthPotion);
    }
}