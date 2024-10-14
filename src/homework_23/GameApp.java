package homework_23;

    public class GameApp {
        public static void main(String[] args) {


            GameCharacter[] characters = new GameCharacter[5];
            characters[0] = new Warrior();
            characters[1] = new Mage();
            characters[2] = new Archer();
            characters[3] = new Dwarf();
            characters[4] = new Necromancer();


            for(int i =0; i < characters.length; i++) {
                characters[i].attack();
            }



            Warrior warrior = new Warrior();
            warrior.attack();

            Mage mage = new Mage();
            mage.attack();

            Archer archer = new Archer();
            archer.attack();

            Dwarf dwarf = new Dwarf();
            dwarf.attack();

            Necromancer necromancer = new Necromancer();
            necromancer.attack();




        }
    }

