package Sustezanie;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Организация_в_код {
	public static Scanner kb = new Scanner(System.in);
	public static boolean isValid(String s, HashMap<Character, Character> map) {
		Stack<Character> stack = new Stack<Character>();
		for (char character : s.toCharArray()) {
			if (map.containsValue(character)) {
				stack.push(character);
			} else if(map.containsKey(character)){
				if(stack.isEmpty() || map.get(character) != stack.pop()) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		int n = kb.nextInt();
		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');
        kb.nextLine();
		for (int i = 0; i < n; i++) {
			String s = kb.next();
			if(isValid(s, map)) {
				System.out.println("Valid");
			}else {
				System.out.println("Invalid");
			}
		}
	}

}
