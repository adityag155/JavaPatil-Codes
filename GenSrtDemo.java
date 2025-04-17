//Generic & Sorting

//Collections.sort(list);  with the help of this syntax list will be sorted alphabetically

import java.util.*;
class GenSrtDemo
{
public static void main(String args[])
{
ArrayList<String> list=new ArrayList<String>();
//ArrayList<String> list=new ArrayList<String>();

list.add("Tushar");
list.add("Kedar");
list.add("Avinash");
list.add("Rohan");
list.add("Omkar");

System.out.println(list);			//[Tushar, Kedar, Avinash, Rohan, Omkar]

Collections.sort(list);
System.out.println(list);			//[Avinash, Kedar, Omkar, Rohan, Tushar]
}
}