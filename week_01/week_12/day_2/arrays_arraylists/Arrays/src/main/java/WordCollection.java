public class WordCollection {
private String[] words;  //syntax for creating an array

public WordCollection(){
    this.words = new String[5];
}

    public String[] getWords() {
        return this.words;
    }

    public int getWordCount(){
    return this.words.length;
}

}
