/** Program: NFL_PlayerManager Program
* File: NFL_PlayerPManager.java
* Summary: NFL Manager list.
* Author: Shertonia S. Stanley
* Date: December 24, 2017 
**/
import java.util.ArrayList;
import java.util.Scanner;
public class NFL_PlayerManager {
static ArrayList <NFL_PlayerManager> player = new ArrayList<>(); // change the array list name (player) with the actual name in the question
public static void createPlayers()
{
String name, address;
int id;
String playerType = "1";
Scanner kybd = new Scanner(System.in);
while(true){
System.out.println("Select Player Type:\n");
System.out.println("Enter 1 for Defensive Players.");
System.out.println("Enter 2 for Offensive Players.");
System.out.println("Enter Q to exit");
System.out.print("Enter your choice: ");
playerType = kybd.nextLine();
if(playerType.equalsIgnoreCase("Q"))
return;
if(!(playerType.equals("1") || playerType.equals("2")))
{
System.out.println("Invalid Choice!\n");
continue;
}
System.out.println();
System.out.print("Enter the player's name: ");
name = kybd.nextLine();
System.out.print("Enter the player's id: ");
id = Integer.parseInt(kybd.nextLine());
System.out.print("Enter the Player's address: ");
address = kybd.nextLine();
if(playerType.equals("1"))
{
// add new Defensive player into the same array list
player.add(new NFL_PlayerManager());
System.out.println("\nDefensive Player added");
}
else if(playerType.equals("2"))
{
 // add new offensive players into the same aaray list
player.add(new NFL_PlayerManager());
System.out.println("\nOffensive Player added");
}
}
}
public static void main(String args[])
{
createPlayers();
}
}

