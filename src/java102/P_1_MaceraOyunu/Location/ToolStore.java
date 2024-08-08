package java102.P_1_MaceraOyunu.Location;

import java102.P_1_MaceraOyunu.ItemsForSale.Armor;
import java102.P_1_MaceraOyunu.ItemsForSale.Items;
import java102.P_1_MaceraOyunu.ItemsForSale.Weapon;
import java102.P_1_MaceraOyunu.Player;

import static java102.P_1_MaceraOyunu.Game.input;

public class ToolStore extends Location {

    Weapon tabanca = new Weapon(1, "Tabanca", 2, 25);
    Weapon kilic = new Weapon(2, "Kilic", 3, 35);
    Weapon tufek = new Weapon(3, "Tufek", 7, 45);

    Weapon[] weaponry = {tabanca, kilic, tufek};

    Armor hafif = new Armor(1, "Hafif Zirh", 1, 15);
    Armor orta = new Armor(2, "Orta Zirh", 3, 25);
    Armor agir = new Armor(3, "Agir Zirh", 5, 35);
    Armor[] armors = {hafif, orta, agir};

    ToolStore(Player player, String locationName) {
        super(player, locationName);
        super.setPlayer(player);
        super.setLocationName(locationName);
    }

    @Override
    public boolean onLocation() {
        System.out.println("Magza' ya Hos Geldiniz !!");
        menu();
        return true;
    }

    private void menu() {
        do {
            System.out.println("Silah mi zirh mi alacaginizi secin \t Bakiye : " +
                    super.getPlayer().getCharacter().getMoney() );
            System.out.println("1- Silah \n2- Zirh \nCikmak icin 0 girin ");

            int choice = input.nextInt();

            if (choice == 1) {
                selectItemMenu(weaponry); //// silah menusu gosterimi
                choiceItem(input.nextInt() ,weaponry); //// silah secimi

            } else if (choice == 2) {
                selectItemMenu(armors); //// zirh menusu
                choiceItem(input.nextInt() ,armors); //// zirh secimi

            } else if (choice == 0) {
                System.out.println("Cikis");
                break;
            } else {
                System.out.println("Hatali girdi Lutfen tekrar secim yapin");
            }

        } while (true);

    }
    public void selectItemMenu(Items[] items ){
        //// silah menusu
        System.out.println("Silah menusune hos geldiniz \t" + "Bakiye : " +
                super.getPlayer().getCharacter().getMoney() +
                "\nCikmak icin 0 girin \nMevcut Silahlar :");

        for (int i = 0; i < items.length; i++) { // silah listesini gösteriri
            System.out.println((i + 1) + "- " + items[i].getName() + "\tHasar : + " +
                    items[i].getDamageOrDefence() + "\tUcret :" + items[i].getMoney());
        }
    }
    public void choiceItem(int choice ,Items[] items){
        switch (choice) {
            case 0:
                /// geri donme
                break;
            case 1:
                //// tabanca secildi
                buy(items[0]);
                break;
            case 2:
                //// kilic secildi
                buy(items[1]);
                break;
            case 3:
                /// tufek secildi
                buy(items[2]);
                break;
            default:
                ///
                System.out.println("Gecersiz girdi Lutfen tekrar silah secin.");
        }
    }

    private void buy(Items items) {
        /// item alma 1. durum parası yetmez
        // 2. durum bastırır alır
        int totalMoney;
        System.out.println("Bakiyeniz  = " + getPlayer().getCharacter().getMoney());

        if (getPlayer().getCharacter().getMoney() >= items.getMoney()) {

            totalMoney = getPlayer().getCharacter().getMoney() - items.getMoney();
            getPlayer().getCharacter().setMoney(totalMoney);

            System.out.println("Satin alma islemi basarili");
            System.out.println("Aldiginiz item = " + items.getName());
            System.out.println("Kalan Paraniz = " + getPlayer().getCharacter().getMoney());

            if (items.getWarEffect()) { // war effect true ise defans
                getPlayer().getInventory().setArmor(items); // envantere kalkanı gönderdik
                System.out.println(" player envanter : " + getPlayer().getInventory().getArmor().getName());

                getPlayer().printPlayerInformation();

            } else { // war effect false ise saldiri
                getPlayer().getInventory().setWeapon(items); // silah envantere gonderildi
                System.out.println("player envanter : " + getPlayer().getInventory().getWeapon().getName());
                getPlayer().printPlayerInformation();

            }

        } else {
            System.out.println("Bakiyeeniz yetersiz");
        }

    }

}
