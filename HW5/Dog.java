public class Dog{

    private int weight;
    private int heightAtShoulder;
    private String name;

    public Dog (String name, int w, int h) {
        System.out.println("Just Entered Dog constructor");
        this.name = name;
        this.weight = w;
        this.heightAtShoulder = h;
        System.out.println("Leaving Dog constructor");
    }

    public String getName() {return this.name;}
    public int    getHeight() {return this.heightAtShoulder;}
    public int    getWeight() {return this.weight;} 

    public void   bark() {System.out.println("woof");}

    public String toString() {
        return "Dog: " + name + " , height: " + heightAtShoulder +
                " weight: " + weight;
    }

    @Override
    public boolean equals(Object o) {

        if (o instanceof Dog) {
            //now we can do checks
            Dog tempDogRef = (Dog)(o);
            if (tempDogRef.getName().equals(this.name) &&
                tempDogRef.getHeight() == this.heightAtShoulder &&
                tempDogRef.getWeight() == this.weight)
                return true;
        }
        return false;
    }

} // end class Dog
