package assespp;

import java.util.LinkedHashSet;

public class StringCombine {
public static void main(String[] args) {
	String[]arr= {"Hari","James","Rahul","Hari","manoj"};
	String[]arr1= {"Farooq","Shyam","James","manoj"};
	LinkedHashSet<String> s=new LinkedHashSet<String>();
	for(String s1:arr) {
		s.add(s1);
	}
	for(String s1:arr1) {
		s.add(s1);
	}
//	ArrayList<String> list=new ArrayList<String>(s);
//      String[]arr2=new String[list.size()];
//      for(int i=0;i<list.size();i++) {
//    	  arr2[i]=list.get(i);
//      } 
//      for(String str:arr2) {
//    	  System.out.print(str+" ");
//      }
	for(String str:s) {
 	  System.out.print(str+" ");
    }
}
}
