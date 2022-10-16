public class Person implements Comparable<Person>{
    ...
    // Esempio di implementazione di compareTo:
    // - ordine di anno di nascita, e poi per nome..
    public int compareTo(Person p){
    	return (this.year != p.year)
    		  ? this.year - p.year
    		  : this.name.compareTo(p.name);
    }
}
