/*Contains method;
It returns true if the collection contains the specified object, and false otherwise.
*/

import java.util.*;
class ContinDemo
{
public static void main(String args[])
{
HashSet <String>set=new HashSet<String>();

set.add("Satish");
set.add("Anil");
set.add("Uma");
set.add("Saket");

System.out.println(set);

System.out.println(set.contains("Uma"));		//true

set.remove("Uma");
System.out.println(set.contains("Uma"));		//false
}
}

/*
O/P:
[Saket, Satish, Uma, Anil]
true
false
*/