package com.java.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;



/**
 * @author abhishek 
 * 
 * Given two words begin word and end word and a list of words known as library, find out the minimum no of switches needed to move from begin word to end word.
 * Only one switch allowed at a time. Switches should be such that the word being formed after the switch should exist in the word library.
 *
 */
public class WordLadder {
	static class QueItem{
		String word;
		int count;
		
		public QueItem(String s, Integer i){
			word =s;
			count = i;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		String [] wordList = {"a", "b", "c"};
		String beginWord = "a";
		String endWord = "c";
		*/
		String [] wordList = {"hot", 
				 "dot", 
				 "dog", 
				 "lot", 
				 "log", 
				 "cog"};
		String beginWord = "hit";
		String endWord = "cog";
		
		//Set<String> wordSet = new Sorted<String>();
		SortedSet wordSet = new TreeSet<String>(); 
		for(int i=0; i < wordList.length; i++){
			wordSet.add(wordList[i]);
		}
		System.out.println(wordLadder(beginWord, endWord, wordSet));
	}

	static int wordLadder(String beginWord, String endWord, Set<String> wordDict) {
		

        LinkedList<QueItem> queue = new LinkedList<QueItem>();
        queue.add(new QueItem(beginWord, 1));
 
        int counter = 0;
        while(!queue.isEmpty()){
        	QueItem top = queue.remove();
            String word = top.word;
 
            if(word.equals(endWord)){
            	System.out.println(counter);
                return top.count;
            }
 
            char[] arr = word.toCharArray();
            for(int i=0; i<arr.length; i++){
                for(char c='a'; c<='z'; c++){
                    char temp = arr[i];
                    if(arr[i]!=c){
                        arr[i]=c;
                    }
 
                    String newWord = new String(arr);
                    if(wordDict.contains(newWord)){
                        queue.add(new QueItem(newWord, top.count+1));
                        wordDict.remove(newWord);
                    }
 
                    arr[i]=temp;
                    counter++;
                }
            }
        }
        System.out.println(counter);
        return 0;
		
		/**
		//adding a queue to keep track of the DFS way
		Queue<QueItem> q = new LinkedList<QueItem>();
		QueItem obj = new QueItem(beginWord,1);
		q.add(obj);
		while (!q.isEmpty()) {
			QueItem checkWord = q.element();
			q.remove(checkWord);
			
			Iterator<String> ie = wordSet.iterator();
			while(ie.hasNext()){
				String temp = ie.next();
				//if the words are of size 1 in length we need to directly check if its there in the dictionary or not
				if(checkWord.word.length() == 1){
					return wordSet.contains(checkWord.word) ? checkWord.count + 1 : 0;
				}
				if(isAdjacent(temp, checkWord.word)){
					obj.count = checkWord.count + 1;
					obj.word = temp;
					q.add(obj);
				
					ie.remove();
					
					if(temp.equalsIgnoreCase(endWord)){
						return obj.count;
					}
					
				}
			}
		}
		return 0;
		*/
	}
	
	static boolean isAdjacent(String a, String b){
		int len = a.length();
		int count = 0;
		for(int i=0; i < len; i++){
			if(a.charAt(i) != b.charAt(i)){
				count++;
			}
			if(count > 1){
				return false;
			}
		}
		return count ==1 ? true : false;
	}
}
