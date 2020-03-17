import java.util.ArrayList;

//Our class IS-A Comparable, otherwise we cannot override the compareTo() method
public class Country implements Comparable
{
	private String name;
    private String nationalDish;
    private int powerLevel;
    private ArrayList<Country> adjacencies;

    public Country(String name)
    {
        this.name = name;
        this.nationalDish = null;
        this.powerLevel = 0;
        this.adjacencies = new ArrayList<Country>();
    }

    public void setNationalDish(String playerName)
    {
        this.nationalDish = playerName;
    }

    public void setPowerLevel(int number)
    {
        this.powerLevel = number;
    }

    public void addAdjacencies(ArrayList<Country> adjacencies)
    {
        this.adjacencies = adjacencies;
    }
    
    public void addAdjacentCountry(Country adjacent) {
    	this.adjacencies.add(adjacent);
    }

    public String getName()
    {
        return this.name;
    }

    public String getNationalDish()
    {
        return this.nationalDish;
    }

    public int getPowerLevel()
    {
        return this.powerLevel;
    }

    public ArrayList<Country> getAdjacencies()
    {
    	return this.adjacencies;
    }
    
    //Override equals()
    //If the name, powerLevel and nationalDish of this Country are equal to the name,
    //powerLevel, and nationalDish of otherCountry (the country we are comparing this
    //Country to), return true (ie, the countries are logically equal)
    //Otherwise, return false
    @Override
    public boolean equals(Object obj) {
    	Country otherCountry = (Country)obj;
    	
    	//#TODO
        if( (this.name.equals(otherCountry.getName()))
            && (this.powerLevel == otherCountry.getPowerLevel())
            && (this.nationalDish == otherCountry.getNationalDish()) ){
            return true;
        }
            else {
                return false;
            }
    }
    
    //Override hashCode() to return a constant, like 0
    //In certain conditions, if we call the .equals() method to compare two objects and
    //they do not return the same hashcode, Java will not consider them equal, even
    //if the values of all their instance variables are the same
    @Override
	public int hashCode() {
		//#TODO
        return 0;
	}
    
    //Override compareTo() such that:
    //if otherCountry (the Country we are comparing this Country to) has the same name,
    //compareTo() returns 0. If this country's name comes before otherCountry's name
    //alphabetically, return -1. If otherCountry's name comes first alphabetically,
    //return 1.
    //
    //Note, to compare Strings alphabetically, simply call compareTo() on a String.
    //The String class's compareTo() method is already implemented in such a way that
    //it will test for alphabetical ordering between two Strings when it is called.
    //For example, given string1 and string2, calling:
    //string1.compareTo(string2)
    //will compare string1 to string2. If the strings are the same, it will return 0.
    //If string1 comes before string2 alphabetically, it will return some negative number.
    //If string1 comes after string2 alphabetically, it will return some positive number.
    @Override
    public int compareTo(Object arg0) {
    	Country otherCountry = (Country)arg0;
    	
        if(this.getName().compareTo(otherCountry.getName()) == 0){
            return 0;
        }
        else if(this.getName().compareTo(otherCountry.getName()) > 0){
            return 1;
        }
            else {
                return -1;
            }
    }
    
    @Override
    public String toString(){
    	String toString = null;
    	toString = "" + this.getName() + "    "  + this.getNationalDish() + "   " + this.getPowerLevel()
    	+ System.lineSeparator() + "Countries adjacent to " + this.getName() + " are ";
    	if (this.getAdjacencies() != null) {
    		for (int i = 0; i < this.getAdjacencies().size(); i++) {
    			toString = toString + this.getAdjacencies().get(i).getName() + " ";
    		}
    	} else {
    		toString = toString + "None";
    	}
		return toString + System.lineSeparator();
    	
    }
}
