package com.java.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s, find and return the first instance of a non-repeating
 * character in it. If there is no such character, return '_'
 * 
 * Note: Write a solution that only iterates over the string once and uses O(1)
 * additional memory, since this is what you would be asked to do during a real
 * interview.
 * 
 * 
 * 
 * For s = "abacabad", the output should be firstNotRepeatingCharacter(s) = 'c'.
 * 
 * @author abhishek
 *
 */
public class FindFirstNonRepeatingCharacterInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abacabad";
		System.out.println(firstNonRepeatingCharacter(s));

	}
	
	static char firstNonRepeatingCharacter(String s){
		Map<Character, CountIndex> countMap = new HashMap<Character, CountIndex>();
		for(int i=0; i < s.length(); i++){
			if(countMap.containsKey(s.charAt(i))){
				countMap.get(s.charAt(i)).incCount();
			}else{
				countMap.put(s.charAt(i),new CountIndex(i));
			}
		}
		
		int firstIndex = Integer.MAX_VALUE;
		char returnChar = '_';
		for(Map.Entry<Character, CountIndex> entry : countMap.entrySet()){
			if(entry.getValue().count == 1 && entry.getValue().index < firstIndex){
				firstIndex = entry.getValue().index;
				returnChar = s.charAt(firstIndex);
			}
		}
		return returnChar;
	}
	
}

class CountIndex
{
    int count,index;
     
    // constructor for first occurrence
    public CountIndex(int index) {
        this.count = 1;
        this.index = index;
    }
     
    // method for updating count
    public void incCount() {
        this.count++;
    }
}
