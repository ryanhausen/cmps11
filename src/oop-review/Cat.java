public class Cat{
  String name;
  String color;

  public Cat(String name, String color){
      this.name = name;
      this.color = color;
  }

  public void meow(){
      System.out.println("MEOW!");
  }

  public String getName(){
    return this.name;
  }
}