public class Hero {
private int heroesHealth;
private int heroesDamage;
private String heroesSuperpower;

public Hero(int heroesHealth, int heroesDamage, String heroesSuperpower){
    this.heroesSuperpower =heroesSuperpower;
    this.heroesHealth=heroesHealth;
    this.heroesDamage=heroesDamage;
    }
public Hero(int heroesHealth, int heroesDamage){
    this.heroesHealth=heroesHealth;
    this.heroesDamage=heroesDamage;
}

    public int getHeroesHealth() {
        return heroesHealth;
    }

    public int getHeroesDamage() {
        return heroesDamage;
    }

    public String getHeroesSuperpower() {
        return heroesSuperpower;
    }
}

