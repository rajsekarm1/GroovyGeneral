package com.rajasekar.spock.test;

import com.rajasekar.spock.code.Adder
import spock.lang.Specification

class AdderTesting extends Specification{
	
	def "Testing adder method"() {
		given: "a new Adder class is created"
		println "given method"
		def adder = getAdderMethod()
		
		when: "Then two integers"
		println "Then two integers"
		true
		
		
		then: "Then two integers"
		println "Then two integers"
		true
		
		/*expect: "Adding two integers"
		println "Expect Method"
		adder.add("raja","sekar") == "rajasekar"*/
		
		
		
	}	
	

	def static getAdderMethod(){
		return new Adder()
	}
}
