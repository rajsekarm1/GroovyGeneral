package com.rajasekar.spock.code;

class Adder {
	
	def add(first,second){
		def strList = ["raja","sekar","sathya"]
		strList.each {
			println it
		}
		return first + second
	}
	

}
