/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException
	{		
            int zahl = zaehleText(1,"C:\\Users\\andreasjuen\\Desktop\\test.txt");
            System.out.println(zahl);
            zahl = zaehleText(2,"C:\\Users\\andreasjuen\\Desktop\\test.txt");
            System.out.println(zahl);               
	}
    
    /**
     * 
     * @param wortOderBuchstabe 1 fuer Woerter, 2 fuer Buchstaben zaehlen
     * @param phad eingabe des Pfads
     * @return gibt Anzahl von Buchstaben oder Woerter aus 
     * @throws IOException
     */
    public static int zaehleText(int wortOderBuchstabe, String phad) throws IOException
    {
        FileReader fr = new FileReader(phad);
        BufferedReader br = new BufferedReader(fr);
		 
        String zeile = "";
        String tempWort;
        int zahl = 0;
        int zahlBuchstaben = 0;
		 
        while( (zeile = br.readLine()) != null )
        {
            String[] parts = zeile.split("\\s+");
		      
            for(int i = 0; i < parts.length; i++)
            {

                tempWort = parts[i].trim();
                zahlBuchstaben += tempWort.length();
            }

            zahl += parts.length;
        }

        br.close();
	
        if(wortOderBuchstabe == 1)            
            return zahl;
        else if(wortOderBuchstabe == 2)
            return zahlBuchstaben;
        
        return -1;
    }
}