public class Animal {
  private String name;
  
  public Animal(String name){
    this.name = name;
  }
  
  public String speak(){
    return "SOUND!";
  }
  
  public String toString(){
     return "I'm a " + this.name + " and I sound like " + this.speak();
  }
}
