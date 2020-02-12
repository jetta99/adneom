/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liste.adneom;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author macbookpro
 */
public class ListeTest {


    /**
     * Test of partition method, of class Liste.
     */
    @Test
    public void testPartition() {
        
        //remplir la liste
        ArrayList<Integer> l1 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            l1.add(i);
        }
        
        ///creation  des resultats pour partition([1,2,3,4,5], 2) qui retourne: [ [1,2], [3,4], [5] ]
        ArrayList<ArrayList<Integer>> expected;
        expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList((Integer) 1, (Integer) 2)));
        expected.add(new ArrayList<>(Arrays.asList((Integer) 3, (Integer) 4)));
        expected.add(new ArrayList<>(Arrays.asList((Integer) 5)));
        //assertEquals(expected, Liste.partition(l1, 2));
        //-----------------------------------------
        ///creation  des resultats pour partition([1,2,3,4,5], 3) qui retourne: [ [1,2,3], [4,5] ]
        ArrayList<ArrayList<Integer>> expected2;
        expected2 = new ArrayList<>();
        expected2.add(new ArrayList<>(Arrays.asList((Integer) 1, (Integer) 2,(Integer)3)));
        expected2.add(new ArrayList<>(Arrays.asList( (Integer) 4,(Integer) 5))); 
        assertEquals(expected2, Liste.partition(l1, 3));
        //-----------------------------------------
         ///creation  des resultats pour partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ]
        ArrayList<ArrayList<Integer>> expected3;
        expected3 = new ArrayList<>();
        expected3.add(new ArrayList<>(Arrays.asList((Integer) 1))); 
        expected3.add(new ArrayList<>(Arrays.asList((Integer) 2))); 
        expected3.add(new ArrayList<>(Arrays.asList((Integer) 3))); 
        expected3.add(new ArrayList<>(Arrays.asList((Integer) 4))); 
        expected3.add(new ArrayList<>(Arrays.asList((Integer) 5))); 
        
        assertEquals(expected3, Liste.partition(l1, 1));
        //-----------------------------------------
    }

}
