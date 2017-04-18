
class MapExample {

	static main(args) {
		def weekMap = [1:"Monday",2:"Tuesday",3:"Wednesday",4:"Thursday",5:"Friday",6:"Saturday",7:"Sunday"]
		println weekMap
		println weekMap.getClass().getName()
		println weekMap.size()
		weekMap.each {
			println it.value
		}
		weekMap.each {
			k,v -> println "${v}"
		}
		
	}

}
