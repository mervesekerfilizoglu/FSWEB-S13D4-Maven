package org.example;

public enum Weapon {
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
