public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр босса и задаем ему свойства
        Boss boss = new Boss();
        boss.setBossHealth(1000);
        boss.setBossDamage(150);
        boss.setBossDefence("Щит");

        // Распечатываем информацию о боссе
        System.out.println("Информация о боссе:");
        System.out.println("Здоровье: " + boss.getBossHealth());
        System.out.println("Урон: " + boss.getBossDamage());
        System.out.println("Тип защиты: " + boss.getBossDefence());

        // Создаем героев и распечатываем их информацию
        Hero[] heroes = createHeroes();
        System.out.println("\nИнформация о героях:");
        for (Hero hero : heroes) {
            System.out.println("Здоровье: " + hero.getHeroesHealth() + ", Урон: " + hero.getHeroesDamage() + ", Суперспособность: " + hero.getHeroesSuperpower());
        }
    }

    // Метод для создания героев
    public static Hero[] createHeroes() {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Hero(300, 50, "Ледяной шторм");
        heroes[1] = new Hero(250, 60  );
        heroes[2] = new Hero(400, 40, "Огненная волна");
        return heroes;
    }
}