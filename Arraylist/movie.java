public class movie {
private String name;
private int year;

  movie(String name,int year) {
    this.name=name;
    this.year=year;
  }
  
  public void print()
  {
      System.out.println("Name: "+ this.name+"\tYear: "+ this.year);
  }
}