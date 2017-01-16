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

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Tamilist
 */


public class PCInput 
{
    //Still not sure where the room array needs to be kept
    
    // This is just a simple room object for calling the CreateRooms Function.
    Room roomobj = new Room();
    Room[] roomlist = roomobj.CreateRooms();
    public Room currentroom = roomlist[0];
    
    // This is for checking the contents of an array for testing purposes.
    public void ReturnArrayContents()
    {
        Scanner reader = new Scanner(System.in);
        for(Room r : roomlist)
        {
            System.out.println(r.GetRoomName());
        }
        
        
    }
    public String RecieveInput()
    {
        Scanner reader = new Scanner(System.in);
        String a = reader.nextLine();
        return a;
    }
    
    // Makes decisons based on what the player has entered into the console.
    public Room ProccessDirInput(String currentcmd)
    {
        // If the command equals North, the system will check for a specific string
        // in a N variable. This will be the id for another room and will change
        // the current room to the one thats connected.
        Room curroom = currentroom;
        
        if (currentcmd.matches("N|North|n|north"))
        {
            
            //here for testing. Remove later.
            System.out.println("You entered one of several commands for north");
            
            outerloop1:
            for (Room r : roomlist)
            {
                if(currentroom.nid == r.roomid)
                {
                    curroom = r;
                    break;
                    
                }
                    
            }
            
        }
        
        if (currentcmd.matches("S|South|s|south"))
        {
            //here for testing. Remove later.
            System.out.println("You entered one of several commands for south");
            
            // Checks each of the rooms in the roomlist array to see if the current
            // rooms direction id is equal to one of the rooms roomid in the array.
            // If so it changes curroom to that room and returns it so the current
            // room vaiable in pcinput can be changed to the value in curroom.
            
            for (Room r : roomlist)
            {
                if(currentroom.sid == r.roomid)
                {
                    curroom = r;
                    
                    break;
                    
                }
                    
            }
            
        }
        return curroom;
            
    }
}
    
