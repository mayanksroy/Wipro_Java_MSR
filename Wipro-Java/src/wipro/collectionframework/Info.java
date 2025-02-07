package wipro.collectionframework;

public class Info implements Comparable<Info> {
	
	public Integer Id;
	public String Name;
	public Info(Integer id, String name) 
	{
		super();
		this.Id = id;
		this.Name = name;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public Info() {
		
	}
	
	@Override
	public String toString() {
		return Id + " " + Name;
	}
	@Override
	public int compareTo(Info o) {
		//to sort int in ascending
//		return this.getId().compareTo(o.getId());
		//to sort int in descending
//		return -this.getId().compareTo(o.getId());
		//to sort string in ascending
//		return this.getName().compareTo(o.getName());
		//to sort string in descending
		return -this.getName().compareTo(o.getName());
	}
	
}
