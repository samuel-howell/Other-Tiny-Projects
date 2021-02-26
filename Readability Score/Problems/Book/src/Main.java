class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;   

    //setters
    public void setTitle (String title){
        this.title = title;
    }

    public void setYearOfPublishing (int yearOfPublishing){
        this.yearOfPublishing = yearOfPublishing;
    }

    public void setAuthors (String[] authors){
        this.authors = authors;
    }

    //getters

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public String getTitle() {
        return title;
    }

    public String[] getAuthors() {
        return authors;
    }
}