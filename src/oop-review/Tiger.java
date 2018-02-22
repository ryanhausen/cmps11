public class Tiger extends Cat{
  public Tiger(){
    super("Tiger", "Orange and Black Stripes");
  }

  // Override
  public void meow(){
    System.out.println("ROAR!");
  }

  // new functionality
  public void hunt(){
    System.out.println("Hunting!");
  }
}