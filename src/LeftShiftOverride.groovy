
class StringUtility{
	String str
	
    void leftShift(String newString){
		str += " "+ newString
	}
	
	String rightShift(String delString){
		int lastChIndex = str.indexOf(delString)
		String prefixText = str.substring(0,lastChIndex)
		String lastText = str.substring(lastChIndex+delString.length(),str.length()-1)
		str = prefixText + lastText
		str
	}
	
	void printString(){
		println str
	}
}



class LeftShiftOverride {

	static main(args) {
		StringUtility strUtility = new StringUtility(str:"Rajasekar")
		strUtility << "Sathya"
		strUtility.printString()
		strUtility >> "Raja"
		strUtility.printString()
		//println strUtility
	}

}
