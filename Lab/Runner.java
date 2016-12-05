class Runner  {
  public static void main(String[] args)  {
    Planet planet = new Planet("Mars", 6779);
    String name = planet.getName();
    System.out.println(name);
    int size = planet.getSize();
    System.out.println(size);
    planet.explode();
    System.out.println(name + " is " + size + "km wide.");
    planet.explode();
  }
}