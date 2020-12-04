
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wasim
 */
public class users {
    ArrayList <User> Allusers = new ArrayList<>();
    
    boolean addUser(User newuser)
    {
    
        this.allusers.add(newuser);
        return true;
    }
    boolean removeUser(user toremove)
    {
        this.allusers.remove(toremove);
        return true;
    }
    {
        boolean authenticateuser(String username, String password)
    }
    for(int i=0; i<allusers.size() i++ )
    {
        if(this.allusers.get(i).getUsername().equals(username) && 
                this.allusers.get(i).getpass().equals(Password))
        {
            return true;
        }
    }
    return false;
    
    
}

