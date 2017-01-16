/*
 * Copyright (C) 2017 Tamilist
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package textrpg;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tamilist
 */
public class Room 
{
    
    public String roomname;
    private List itemlist = new ArrayList();
    private String roomdescription;
    
    // This is the unique id for the room.
    public int roomid;
    
    // These strings will be the ids of other rooms connected to the current room.
    public int nid;
    public int sid;
    public int eid;
    public int wid;
    public int upid;
    public int downid;
    // Empty constructer for base room object used for instantiating
    // an array of rooms.
    Room()
    {
        
    }
    Room(String Roomname, String RoomDesc, int Nid, int Sid, int Eid, int Wid,
         int Upid, int Downid, int Roomid)
    {
        this.roomname = Roomname;
        this.roomdescription = RoomDesc;
        this.nid = Nid;
        this.sid = Sid;
        this.eid = Eid;
        this.wid = Wid;
        this.upid = Upid;
        this.downid = Downid;
        this.roomid = Roomid;
        
        
    }
    
    public int GetRoomID()
    {
        return roomid;
    }
    
    public String GetRoomName()
    {
        return roomname;
    }
    
    public String GetRoomDesc()
    {
        return roomdescription;
    }
    
    //displays the current rooms description
    
    public void ShowDesc()
    {
        System.out.println(this.roomdescription);
    }
    
    public Room[] CreateRooms()
    {
        // Creates the rooms and stores them in an array to be returned in the main method
        
        Room yourcell = new Room("Cell", "You are standing in a dirty cell.", 1, -1, 0, 0, 0, 0, 0);
        Room jailhall = new Room("Jail Hallway", "You're in a dark hallway.", 2, 0, 0, 0, 0, 0, 1);
        Room jailhall2 = new Room("Jail Hallway", "You're in a dark hallway again. You can see a light up ahead.", 3, 1, 0, 0, 0, 0, 2);
        Room[] roomarray = new Room[] {yourcell, jailhall, jailhall2};
        
        
        return roomarray;
        
        
    }
    
    // Shows the current rooms description
    public void DisplayRoomDesc()
    {
        System.out.println(GetRoomDesc());
    }
}
