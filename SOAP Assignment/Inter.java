
public class Inter {
	
	Assignment obj=new Assignment();
	public String insertEmp( String name, int age,int id) {

		return obj.addEmployee(name,age,id);

	}

	

	public String updateemployee(int id, String name, int age) {

		return obj.updateemployee(id,name,age);

	}

	

	public String deleteEmployee(int id) {

		return obj.deleteEmployee(id);

	}

	

	public  String showEmployee(int id) {

		return obj.showemployee(id);

	}

	

	public String getAll() {

		return obj.getAll();

	}

}
