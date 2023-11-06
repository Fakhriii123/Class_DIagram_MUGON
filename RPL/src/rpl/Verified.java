/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpl;

/**
 *
 * @author ridho
 */
public class Verified extends Inspector{
    int UnvItem[] = new int[100];

    public Verified(String InspectorName, String InspectorPass) {
        super(InspectorName, InspectorPass);
    }

    public int[] getUnvItem() {
        return UnvItem;
    }

    public void setUnvItem(int[] UnvItem) {
        this.UnvItem = UnvItem;
    }
    
    public void ratingBarang(){
        
    }
    
    public void uploadtoMarket(){
        
    }
    
}
