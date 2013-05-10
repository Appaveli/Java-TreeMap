/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package treemapexample;
import java.util.*;

/**
 *
 * @author dominque
 */
public class TreeMapExample {

   
    public static void main(String[] args) 
    {
        TreeMap <String, Integer> myTree = new TreeMap <String, Integer>();
        myTree.put("Dominque",new Integer(0));
        myTree.put("Terry", new Integer(1));
        
        for(String myString: myTree.keySet())
        {
            System.out.println(myString);
            
        }
        for(Integer myInt:myTree.values())
        {
            System.out.println(myInt);
        }
        
        Set <String> mySet = myTree.keySet();
        Iterator itr = mySet.iterator();
        
        while(itr.hasNext())
        {
          String keys = itr.next().toString();
          System.out.println(myTree.get(keys));
        }
        
    }
}
