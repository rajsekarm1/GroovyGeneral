
class ExpandoExample {

	static main(args) {
		
		Expando e = new Expando()
		e.name = 'Kitty'
		e.speak = { -> println "Java"}
		
		println e.speak.getClass().getName()
		
		e.speak()
	
	}

}
