package esercise.university.package01.exec07;

public enum TriangleType {

	EQUILATERO( "EQUILATERO" , 3 ),
	ISOSCELE( "ISOSCELE" , 2 ),
	SCALENO( "SCALENO" , 1 )
	;
	
	private String type;
	private Integer numberOfEquals;
	
	private TriangleType(String type, Integer numberOfEquals) {
		this.type = type;
		this.numberOfEquals = numberOfEquals;
	}
	
	public String getType() { return type; }
	public void setType(String type) { this.type = type; }

	public Integer getNumberOfEquals() { return numberOfEquals; }
	public void setNumberOfEquals(Integer numberOfEquals) { this.numberOfEquals = numberOfEquals; }

	public static boolean compare(String type, TriangleType triangleType) {
		return type.equals( triangleType.getType() );
	}
	
	public static boolean compare(int numberOfEquals, TriangleType triangleType) {
		return numberOfEquals == triangleType.getNumberOfEquals().intValue();
	}
	
	public static boolean compare(TriangleType tt1, TriangleType tt2) {
		return tt1.getType().equals( tt2.getType() );
	}
	
	public static TriangleType parseByType(String type) {
		if( type == null ) { return null; }
		else if( compare( type , TriangleType.EQUILATERO ) ) { return TriangleType.EQUILATERO; }
		else if( compare( type , TriangleType.ISOSCELE ) ) { return TriangleType.ISOSCELE; }
		else if( compare( type , TriangleType.SCALENO ) ) { return TriangleType.SCALENO; }
		else { return null; }
	}
	
	public static TriangleType parseByType(Integer numberOfEquals) {
		if( numberOfEquals == null ) { return null; }
		else if( compare( numberOfEquals , TriangleType.EQUILATERO ) ) { return TriangleType.EQUILATERO; }
		else if( compare( numberOfEquals , TriangleType.ISOSCELE ) ) { return TriangleType.ISOSCELE; }
		else if( compare( numberOfEquals , TriangleType.SCALENO ) ) { return TriangleType.SCALENO; }
		else { return null; }
	}
	
}
