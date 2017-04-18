
class ClosureExample {

	static main(args){
		List list = [1,2,3,4,5,6,7,8,10,9,14,12]
		
		list.sort{ Integer i1, Integer i2 ->
			i1 <=> i2
			
		}
		
		println list
		
		println "Example 1"
		//Example 1: using it variable.
		list.each {
			print it +","
		}
		
		//Example 2: Using explicit variable.
		println "\n\nExample 2"
		list.each { data ->
			print data	+ ","
		}
		
		//Example 3: Using explicit variable with argument type defined explictily
		println "\n\nExample 2"
		list.each { Integer data ->
			print data	+ ","
		}
	}
	
	
}
