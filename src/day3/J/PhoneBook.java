package day3.J;

import java.util.*;

class SearchContacts{
	static String[] contacts=new String[] {"HelloWorld","Ishita Kumari","Prateek","Niraj","Mamta","Sanju","Priyanka","Saloni","Pratush","Sanju Sardar","Sanju Home"};
	
}

public class PhoneBook {
	static List<String> list = new ArrayList<>();
	static List<String> searchContactsbyName(String name) {
		String curr = name.toLowerCase();
		for(String s:SearchContacts.contacts) {
			int index = s.indexOf(name);
			if(index!=-1)list.add(s);
		}
		return list;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String str = sc.next();
		
		searchContactsbyName(str);
		System.out.println("Below are the matched contacts: ");
		System.out.println(list);
	}
}
