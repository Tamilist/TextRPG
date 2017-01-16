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
import java.util.Scanner;

/**
 * A Text RPG written in Java. I'll probably end up 
 * changing the title in the future.
 * @author Tamilist
 */
public class TextRpg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        //The Game object keeps track of the current progress of the player
        Game game = new Game();

        //The PCInput object handles the players input
        PCInput pcinput = new PCInput();

        game.DisplayTitle();
        String currentcmd;
        

        while (true) 
        {
            currentcmd = pcinput.RecieveInput();
            pcinput.currentroom = pcinput.ProccessDirInput(currentcmd);
            pcinput.currentroom.DisplayRoomDesc();
        }

//        while(true)
//        {
//            String currentcmd = pcinput.RecieveInput();
//            pcinput.ReturnArrayContents();
//            pcinput.ProccessInput(currentcmd);
//            currentcmd = pcinput.RecieveInput();
//        }
                
    }
    
}
