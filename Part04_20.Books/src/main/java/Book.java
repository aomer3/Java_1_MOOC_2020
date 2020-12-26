public class Book {
 private String title;
 private int pages;
 private int yearPub;
 
 public Book(String title, int pages, int yearPub){
     this.title = title;
     this.pages = pages;
     this.yearPub = yearPub;
 }
 
 public String getTitle(){
     return this.title;
 }
 
 public String toString(){
     return this.title + ", " + this.pages + " pages, " + this.yearPub;
 }
}