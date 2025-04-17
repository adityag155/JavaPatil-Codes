//In HashMap we used put method to add item in the list.
//And in HashSet we used add method to add item in the list.


import java.util.*;
class Contain2
{
public static void main(String args[])
{
HashMap<String,Integer>map=new HashMap<String,Integer>();
map.put("Mumbai",30);
map.put("Pune",43);
map.put("Banglore",38);
map.put("Delhi",28);

System.out.println(map);

System.out.println(map.containsKey("Mumbai"));		//t

map.remove("Mumbai");
System.out.println(map.containsKey("Mumbai"));		//f
}
}

/*
O/P:
{Delhi=28, Banglore=38, Pune=43, Mumbai=30}
true
false
*/