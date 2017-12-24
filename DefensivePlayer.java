/** Program: NFL_PlayerManager Program
* File: NFL_PlayerPManager.java
* Summary: NFL Manager list.
* Author: Shertonia S. Stanley
* Date: December 24, 2017 
**/
public class DefensivePlayer extends NFLPlayer{
public DefensivePlayer()
{
super();
}
public DefensivePlayer(int id, String name, String address)
{
super(id, name, address);
}
public String toString() {
return "DefensivePlayer [id=" + super.getId() + ", name=" + super.getName() + ", address=" + super.getAddress() + "]";
}
}
