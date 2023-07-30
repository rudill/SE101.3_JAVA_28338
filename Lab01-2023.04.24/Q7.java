//main method
package com.mycompany.q7;

public class Q7 
{
    public static void main(String[] args) 
    {
        // Create an instance of the Item class
        item item = new item(1, "book");
        // Get and set location and description
        int itemLocation = item.getlocation();
        String itemDescription = item.getdescription();
        System.out.println("Item location: " + itemLocation);
        System.out.println("Item description: " + itemDescription);
        // Create an instance of the Monster class
        monster monster = new monster(3, "Some monster");
        // Get and set location and description inherited from Item class
        int monsterLocation = monster.getlocation();
        String monsterDescription = monster.getdescription();
        System.out.println("Monster location: " + monsterLocation);
        System.out.println("Monster description: " + monsterDescription);
        monster.setlocation(4);
        monster.setdescription("Updated monster");
        System.out.println("Updated monster location: " + monster.getlocation());
        System.out.println("Updated monster description: " + monster.getdescription());
    }
}
