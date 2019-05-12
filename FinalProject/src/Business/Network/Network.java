/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author Sanskruti
 */
public class Network 
{
private String Name;    
private EnterpriseDirectory ep;

    public Network() {
        ep=new EnterpriseDirectory();
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public EnterpriseDirectory getEp() {
        return ep;
    }

    public void setEp(EnterpriseDirectory ep) {
        this.ep = ep;
    }
    public String toString()
    {
        return Name;
    }
    
}
