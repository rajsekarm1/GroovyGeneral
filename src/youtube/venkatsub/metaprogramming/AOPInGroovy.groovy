package youtube.venkatsub.metaprogramming

class Person {
	void run(int kms){
		println "Person can run ${kms}"
	}
}

class AOPInGroovy {

	static main(args) {
		def sam = new Person()
		sam.metaClass.invokeMethod = { methodName, argsument ->
			println "running before"
			def method = Person.metaClass.getMetaMethod(methodName, argsument)
			method.invoke(delegate,argsument)
		}
		
		/*def sample = { methodName, argument ->
			println "running before"
			def method = Person.metaClass.getMetaMethod(methodName, argument)
			method.invoke(delegate,km)
		}
		
		sam.metaClass.invokeMethod = sample*/
		
		sam.run(10)
		
	}

}
