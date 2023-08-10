class EncapTest {

	private String name;
	private int age;
	private int idno;

	public void setName(String name) { this.name = name; }

	public void setAge(int age) { this.age = age; }

	public void setIdno(int idno) { this.idno = idno; }

	public String getName() { return name; }

	public int getAge() { return age; }
 
	public int getIdno() { return idno; }

}

class abc {
	public static void main(String[] args) {
		EncapTest example = new EncapTest();
		example.setName("Kevin");
		example.setAge(19);
		example.setIdno(221078);
		System.out.println("The name of the employee is " + example.getName());
		System.out.println("The age of the employee is " + example.getAge());
		System.out.println("The UID of the employee is " + example.getIdno());
	}
}
