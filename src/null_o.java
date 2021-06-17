abstract class Emp 
{ 
    protected String name; 
    public abstract boolean isNull(); 
    public abstract String getName(); 
} 
  
class Coder extends Emp 
{ 
    public Coder(String name)  
    { 
        this.name = name; 
    } 
    @Override
    public String getName()  
    { 
        return name; 
    } 
    @Override
    public boolean isNull()  
    { 
        return false; 
    } 
} 
  
class nullCoder extends Coder{
	
	
	public nullCoder() {
		super("(Zadne jmeno)");
	}
	public boolean IsNull() {
		return true;
	}
	
}
  
class EmpData  
{ 
      
    public static final String[] names = {"Lokesh", "Kushagra", "Vikram"}; 
    public static Emp getClient(String name) 
    { 
        for (int i = 0; i < names.length; i++)  
        { 
            if (names[i].equalsIgnoreCase(name)) 
            { 
                return new Coder(name); 
            } 
        }
		
      return new nullCoder();
    } 
} 
  
