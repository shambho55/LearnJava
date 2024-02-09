class Book implements Comparable<Book>{

private String title;

public Book(String t){

title = t;

}

public int compareTo(Book book){

return title.compareTo(book.getTitle());

}


public String getTitle(){

return title;

}


public String toString(){

return title;

}

}
