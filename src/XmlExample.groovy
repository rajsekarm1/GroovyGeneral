import groovy.transform.TupleConstructor
import groovy.xml.MarkupBuilder

@TupleConstructor
class Book {
	String isbn
	String title
	String author
	Float price;
}

class XmlExample {

	static main(args) {
		
		Book book1 = new Book("234523-2452345","Grroovy1","Rajasekar",34.5f)
		Book book2 = new Book("234523-2452346","Grroovy2","Rajasekar",35.5f)
		Book book3 = new Book("234523-2452347","Grroovy3","Rajasekar",36.5f)
		Book book4 = new Book("234523-2452348","Grroovy4","Rajasekar",37.5f)
		Book book5 = new Book("234523-2452349","Grroovy5","Rajasekar",38.5f)
		
		List bookList = [book1,book2,book3,book4,book5]
		
		File f = new File("/Users/rajsekarm/Documents/Java/eclipse-workspace/GroovyGeneral/src/Rajasekar.xml")
		PrintWriter pw = new PrintWriter(f)
		MarkupBuilder builder = new MarkupBuilder(pw)
		builder.mkp.xmlDeclaration(version: "1.0", encoding: "utf-8")
		builder.books{
			bookList.each{ bookEach ->  
				book(isbn:bookEach.isbn){
					title bookEach.title
					author bookEach.author
					price bookEach.price
				}
			}
		}
		//println builder.toString
		
		
		/*Person p = new Person()
		p.setId(100)
		p.setFirstName("Rajasekar")
		p.setLastName("Muthusamy")
		File f = new File("/Users/rajsekarm/Documents/Java/eclipse-workspace/GroovyGeneral/src/Rajasekar.xml")
		PrintWriter pw = new PrintWriter(f)
		MarkupBuilder builder = new MarkupBuilder(pw)
		builder.mkp.xmlDeclaration(version: "1.0", encoding: "utf-8")
		builder.persons{
			person(id:p.getId()){
				firstname p.getFirstName()
				lastname p.getLastName()
			}
			
		}
		
		println builder
	*/	
		
		
	
	}

}
