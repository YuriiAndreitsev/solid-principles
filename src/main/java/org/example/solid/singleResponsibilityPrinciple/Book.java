package org.example.solid.singleResponsibilityPrinciple;

public class Book {
    private String bookName;
    private String author;
    private String content;

    public String replaceWordInContent(String wordToReplace, String newWord){
        return content.replaceFirst(wordToReplace, newWord);
    }
}
