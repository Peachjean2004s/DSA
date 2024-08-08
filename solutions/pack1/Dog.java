package solutions.pack1;

public class Dog{
    public int weight ;
    public Breed breed;
    public Dog(Breed b,int w){
        breed = b;
        this.weight = w;
    }
    
    

    public int getWeight() {
        return weight;
    }

    public Breed getBreed() {
        return breed;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + weight;
        result = prime * result + ((breed == null) ? 0 : breed.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dog other = (Dog) obj;
        if (weight != other.weight)
            return false;
        if (breed != other.breed)
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Dog [bleed=" + breed + " weight=" + weight + "]";
    }
    

    
    
}
