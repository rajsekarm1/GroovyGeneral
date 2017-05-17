
class Mailer {
	
	def to(toAddress){ println "To Address ${toAddress}" }
	
	def from(fromAddress) { println "From ${fromAddress}" }
	
	def subject(subject) { println "Subject ${subject}"}

	def body(body) {println "Body ${body}"}
	
	def static send (Closure closure){
		Mailer mail = new Mailer()
		closure.delegate = mail
		closure()
	}
	
	static main(args) {
		Mailer.send{
			to "rajasekar@gmail.com"
			from "rajesh@gmail.com"
			subject "Not at all good"
			body "Non sense code which never make sense"
		}
	}
}


