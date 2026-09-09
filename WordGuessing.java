public class WordGuessing {
  private String wordToBeGuessed;
  private String userString = "_____";// 5 underscores

  // we will say that secret must be five characters
  public WordGuessing(String secret) {
    wordToBeGuessed = secret;
  }

  // letter is in word, no duplicates
  // substring (1 param): substring (2 param),indexOf, length
  public void update(String letter) {
    int letPosition = wordToBeGuessed.indexOf(letter);
    userString = userString.substring(0,letPosition) + letter + userString.substring(letPosition + 1);
  }

  public String getUserString() {
    return userString;
  }
}
 