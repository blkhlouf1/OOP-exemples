/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exceptionse;

/**
 *
 * @author Bilal
 */
public class attrape{
    public static int moyenne(String[] liste){
        int somme=0,nbEntiers=0;
        
        for (String chaine:liste){
            
            try{
                somme+=Integer.parseInt(chaine);
                
                nbEntiers++;
                
            }
                catch (NumberFormatException e){
                    
                    System.out.println(chaine+ "non Entier");
                }
                
            }
            
            
            return somme/nbEntiers;
            
        }
        
    }
