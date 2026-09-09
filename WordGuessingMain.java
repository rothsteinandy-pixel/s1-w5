public class WordGuessingMain{
    public static void main(String[] args){
      WordGuessing w = new WordGuessing( "witch");
      w.update("i");
      w.update("w");
      w.update("c");
      w.update("h");
      w.update("t");
      System.out.println(w.getUserString());
    }
    
}