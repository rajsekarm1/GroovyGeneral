
import java.util.regex.*;

class StringExamples {

	static main(args) {
		String name = "Rajasekar"
		
		println(" Hello ${name}")
		
		def multiLineString = '''
		Rajasekar
		'''
		
		println(multiLineString)
		
		Pattern pattern = Pattern.compile("a\bc")
		println pattern
		println pattern.class
		
		
	}

}
