/** Program: NFL_PlayerManager Program
* File: NFL_PlayerPManager.java
* Summary: NFL Manager list.
* Author: Shertonia S. Stanley
* Date: December 24, 2017 
**/
public class OffensivePlayer extends NFLPlayer {
public OffensivePlayer()
{
super();
}
public OffensivePlayer(int id, String name, String address)
{
super(id, name, address);
}
public String toString() {
return "OffensivePlayer [id=" + super.getId() + ", name=" + super.getName() + ", address=" + super.getAddress() + "]";
}
}


