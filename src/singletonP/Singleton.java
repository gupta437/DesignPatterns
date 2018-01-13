package singletonP;

import java.util.Arrays;
import java.util.LinkedList;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class Singleton {
	private static Singleton firstInstance = null;
	
	String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", 
								"b", "b", "c", "c", "d", "d", "d", "e", "e", "e", "e","e",
								"f", "f", "f", "f", "f", "g", "g", "g", "h", "h", "h","h",
								"i", "i", "i", "j", "j", "k", "l", "l", "l", "m", "m","m",
								"n", "n", "n", "n", "o", "o", "o", "p", "p", "p", "q","q",
								"r", "s", "s", "t", "u", "v", "v", "v", "v", "x", "y","z",};
	
	private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters)); 
	
	static boolean firstThread = true;
	private Singleton() {}
	
	public static synchronized Singleton getInstance() {
		if(firstInstance == null) {
			if(firstThread) {
				firstThread = false;
				Thread.currentThread();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			firstInstance = new Singleton();
			
			//Collections.shuffle(firstInstance.letterList);
		}
		
		return firstInstance;
	}
	
	public LinkedList<String> getLetterList(){
		return firstInstance.letterList;
	}
	
	public LinkedList<String> getTiles(int howManyTiles){
		LinkedList<String> tilesToSend = new LinkedList<String>();
		for(int i=0; i<= howManyTiles; i++) {
			tilesToSend.add(firstInstance.letterList.remove(0));
		}
		
		return tilesToSend;
	}
}
