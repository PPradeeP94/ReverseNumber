package com.pdf_programs;

import java.util.HashMap;
import java.util.Map;

public class Demo {

	public String test(String a) {
		System.out.println(a);
		return a;
	}

	public int test(int c) {
		System.out.println(c);
		return c;

	}

	public static void main(String[] args) {
		Demo dm = new Demo();
		dm.test("hari");
		dm.test(100);
	}

//		String a="hari";
//		
//		String b= "hari";
//		
//		String c = new String("hari");
//		
//		String d = new String("hari");
//		
//		
//		
//		System.out.println(a==b);
//		System.out.println(a.equals(b));
//		System.out.println(a==c);
//		System.out.println(a.equals(c));
//		System.out.println(c==d);
//		
//		System.out.println(c.concat(d));
//		
//		StringBuffer x= new StringBuffer("hari");
//		
//		StringBuffer y= new StringBuffer("hari");
//		
//		
//		System.out.println(x==y);
//		
//		System.out.println(x.equals(y));
//		
//		System.out.println(x.append(y));
//		
//		
//		int ab =10;
//		
//		int bc= 10;
//		
//		System.out.println(ab==bc);
//		
//		Integer cd = new Integer(10);
//		Integer de = new Integer(10);
//		
//		System.out.println(bc==cd);
//		System.out.println(cd==de);
//		
//		String r= "hari";
//		
//		String rev = "";
//		
//		for (int i = r.length()-1; i >=0; i--) {
//			rev=rev+r.charAt(i);
//		}
//		System.out.println(rev);

//    String a= "harikrishna";
//        
//             
//         char[] cs= a.toCharArray();
//         
//         
//        	 Map<Character, Integer> mp = new HashMap<Character, Integer>();
//        	 for(char c:cs) {
//        	        
//            
//            if(mp.containsKey(c)) {
//             int inter  = mp.get(c);
//                mp.put(c,inter+1);
//        
//            }
//             else{
//                 mp.put(c,1);
//             }
//         }
//        System.out.println(mp);
//         

}
