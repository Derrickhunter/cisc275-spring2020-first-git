//Derrick Hunter 
//cisc275 sp20
//TA: Vineeth Gutta

public class Animal implements Comparable<Animal>{

	public String name;
	public int legs;

	public Animal(String name, int legs){
		this.name = name;
		this.legs = legs;
	}
	
        public String getName(){
                return name;
        }
        public void setName(String name){
    		this.name = name;
    	}
        public int getLegs(){
                return legs;
        }

		public void setLegs(int legs){
			this.legs = legs;
		}

	
	@Override
	public int compareTo(Animal o){
		return this.getName().compareTo(o.getName());
	}

	public String toString() {
		return "" + name + legs;
	}



}