class SecondJava{
	
	public static void main(String[] args){
		
		double variable=50.25;
		long part=(int)variable;
		double fractional= variable-part;

		System.out.println( "variable ="+variable);
		System.out.println("Integral part ="+part);
		System.out.println("Fractional value ="+fractional);
	}
}