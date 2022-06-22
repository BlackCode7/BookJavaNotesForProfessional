package numericPrimitiveJava;

public class UsingSetterGetterImplementConstraint {
	
	private String name;
	
	public String getName() {
		if(name.length() > 16) 
			return "Name is very greater";
		else
			return name;
	}
	
	public void setName(String name) {
	if(name!=null && name.length()>2)
	this.name = name;
	}

	public static void main(String[] args) {
		//Setters and Getters allow for an object to contain private variables 
		//which can be accessed and changed with restrictions. For example,
		
		UsingSetterGetterImplementConstraint nome = new UsingSetterGetterImplementConstraint();
		nome.setName("Joao");
		
		System.out.println(nome.getName());

	}

}
