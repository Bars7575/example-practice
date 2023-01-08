public class Player {
    private Weapon [] weaponSlots;

    public Player() {
        Weapon[] weaponSlots = {
                new Pistolet(),
                new Avtomat(),
                new Rogatka(),
                new Bazuka()
        };
        this.weaponSlots = weaponSlots;
    }

    public int getSlotsCount(){
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot){
        if (slot >= getSlotsCount() || slot < -1){
            System.out.println("Невозможное значение");
        } else {
            Weapon weapon = weaponSlots[slot];
            weapon.shot();
        }
    }
}
