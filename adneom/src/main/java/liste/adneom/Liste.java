/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liste.adneom;

import java.util.ArrayList;

/**
 *
 * @author macbookpro
 */
public class Liste {
    //
    public static ArrayList<ArrayList<Integer>> partition(ArrayList<Integer> liste, Integer taille){
 
		ArrayList<ArrayList<Integer>> listR = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();
 
		int i=0,j=0,k=0;
		while (i<liste.size())
		{
			list.clear();
			for ( j = 0; j < taille; j++) 
			{
				if((j+i)<liste.size())
					list.add(liste.get(i+j));
			}
			listR.add((ArrayList<Integer>) list.clone());
			i+=taille;
			k++;
		}
 
		return listR;
	}
}
