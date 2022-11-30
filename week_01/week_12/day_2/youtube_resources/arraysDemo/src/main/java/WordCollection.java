public class WordCollection {
    private String[] words;  //this defining the type. In this case a simple ARRAY. The variable called 'words'. This is the property of the class of WordCollection
    private String[] letters; //this is another instance of the class of WordCollection

    public WordCollection() { // this is the constructor, defining its properties of the class WordCollection.
        this.words = new String[5]; //this is where we specify the length of the array. And it can only be 5 words long!! We need to instantiate the array by telling it how long it is
        // [null, null, null, null, null]
        this.letters = new String[0];
    }

    public String get(int index) {
        return this.words[index];
    }

    public void add(String word){
        this.words
    }


    public int getWordCount() {
        return this.words.length;
    }

    public int getLettersCount() {
        return this.letters.length;
    }

}
