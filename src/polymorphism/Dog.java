public class Dog extends Animal {
  public Dog(){
    super("Dog");
  }
  
  public String speak(){
    return "BARK!";
  }
  
  public String toString(){
    return super.toString() + " plus I like to dig!";
  }
}
