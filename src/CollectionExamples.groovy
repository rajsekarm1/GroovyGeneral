
class CollectionExamples {

	static main(args) {
		List favNums = [2,3,4,5,12,39,22,31]
		for (num in favNums){
			println num
		}
		println favNums.getClass().getName()
		favNums.each{
			println it
		}
		
		favNums.eachWithIndex { num,idx -> 
			println "$idx:$num"
		}
	}

}
