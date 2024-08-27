package mypack;
class author
{
	String Name;
	String email;
	char gender;
	author()
	{
		
	}
	author(String Name,String email,char gender)
	{
		this.Name=Name;
		this.email=email;
		this.gender=gender;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
}
class Book extends author
{
	String Name;
	double price;
	int qtyInStock=0;
	author author1;
	Book()
	{
		
	}
	Book(String Name,double price,int qtyInStock)
	{
		this.Name=Name;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	
}
public class Author1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		author a=new author("Harish","Harish@gmail.com",'M');
		Book b=new Book("Java",120.23,200);
		System.out.println("Author Name: "+a.getName());
		System.out.println("Book Name: "+b.getName());

	}

}
