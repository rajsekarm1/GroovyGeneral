class MetaProgramming implements GroovyObject{
	
	String strValue
	
	def getProperty(String name){
		println "getProperty Method called"
		return strValue;
	}
	
	void setProperty(String name,Object value){
		println "setProperty method called"
		this.strValue = value
	}
	
	def invokeMethod(String name, args){
		println "Method name:$name"
	}
	def dynamicMethodInClass(){
		println "dynamicMethodInClass"
	}
	
}

class RunningPerson {
	
	void run(kms){
		println "Person can run ${kms}"
	}
}


class MetaProgrammingExample {

	static main(args) {
		
		def person = new RunningPerson()
		def method = person.metaClass.getMetaMethod('run',10)
		method.invoke(person,2)
		
		
		
		
		
		
		def user = new Expando();
		user.email = "rajsekarm@gmail.com"
		user.userName = "rajsekarm"
		user.firstName  = "Rajasekar"
		println user.firstName
		
		
		user.printUser = {
			println "User Details $user.email Username $user.userName"
		}
		user.printUser()
		/*MetaProgramming metaProgram = new MetaProgramming()
		metaProgram.dynamicMethodInClass()
		metaProgram.strValue="10"
		println metaProgram.strValue
*/	
		
		Integer integer = 40
		
		println integer.getClass().getName()
		integer.metaClass.twoTimes {
				integer = integer.multiply(2)
		}
			
		integer.twoTimes()
			 
		println integer
			
		
		
		}

}
