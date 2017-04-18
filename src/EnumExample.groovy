import java.awt.font.NumericShaper.Range

enum DaysInWeek{
	Sunday,
	Monday,
	Tuesday,
	Wednesday,
	Thursday,
	Friday,
	Saturday
}

class EnumExample {

	static main(args) {
		ObjectRange enumRange = DaysInWeek.Sunday..DaysInWeek.Friday
		println enumRange
		println enumRange.size()
		println enumRange.getClass().getName()
		println enumRange.contains(DaysInWeek.Wednesday)
		println enumRange.from
		println enumRange.to
		
		List<DaysInWeek> weekList = [DaysInWeek.Sunday,DaysInWeek.Monday,DaysInWeek.Tuesday,DaysInWeek.Wednesday,DaysInWeek.Thursday,DaysInWeek.Friday,DaysInWeek.Saturday]
		weekList.each {
			println it
		}
		println weekList.size()
		weekList = weekList - DaysInWeek.Saturday
		weekList << DaysInWeek.Saturday
		println weekList
		println weekList.indexOf(DaysInWeek.Wednesday)
	}

}
