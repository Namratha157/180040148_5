package encap;

public class Book {
	String name1,author;
	 double price;
int qtyInStock; 
Book(String n1)
{
	name1=n1;
	} void setQtyInStock() 
	{ 
		qtyInStock=10;
		} void setPrice()
		{
			price=100.0;
			}
		double getPrice()
		{
			return price;
			}
	  int getQtyInStock()
	  {
		  return qtyInStock;
		  } 
	  String getName()
	  { 
		  return name1; 
		  } 
	  void getAuthor() 
	  {
		  System.out.println("Author is:"+Author.name);
		  System.out.println("Mail id is:"+Author.email); 
		  System.out.println("Gender is:"+Author.gender);
		  }
}
