public class Cat extends Animal {
  public Cat(){
    super("Cat");
  }
  
  public String speak(){
    return "MEOW!";
  }
  
  public String toString(){
    return super.toString() + " plus I have claws!";
  }
}
