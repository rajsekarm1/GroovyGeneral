
class ClosureExample {
	
	static checkMethod1(arg1, Closure c1){
		println "Called CheckMethod1"
		c1()
	}
	
	

	static main(args){
		
		def firstClosure = { list ->
			println "The delegate object ${toUpperCase()}"
			list.get(0)
		}
		List list = [1,2,3,4,5,6,7,8,10,9,14,12]
		
		list.each {
			println it
		}
		list.each {println it }
		
		firstClosure.delegate = "Rajasekar"
		println "The first number is: ${firstClosure(list)}"
		
		list.sort{ Integer i1, Integer i2 ->
			i1 <=> i2
			
		}
		checkMethod1("raja"){
			println "Inside Closure"
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
