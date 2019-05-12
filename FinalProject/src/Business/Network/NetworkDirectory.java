/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Donor.Donor;
import java.util.ArrayList;

/**
 *
 * @author sharw
 */
public class NetworkDirectory {
    
    private ArrayList<Network> networklist;
    
    public NetworkDirectory(){
    
        networklist = new ArrayList<>();
    } 

    public ArrayList<Network> getNetworklist() {
        return networklist;
    }

    public void setNetworklist(ArrayList<Network> networklist) {
        this.networklist = networklist;
    }

    
    
    public Network addNetwork() {
    Network network=new Network();
    networklist.add(network);
    return network;
    }
    
    public void removeNetwork (Network network) {
        networklist.remove(network);
    }
    
}
