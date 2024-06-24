package lambdaproject;

class LambdaMain{
	public static void main(String args[]) {
		Operation opr;
		opr=(x,y) -> x+y;
		System.out.println(opr.operate(10,20));
		
		
		opr=(x,y) -> x*y;
		System.out.println(opr.operate(10,20));
		
		Converter con;
		
		con=(String s) -> s.toUpperCase();
		System.out.println(con.convert("Omkar"));
		
		
		
		con=(String s) -> s.substring(0,3);
		System.out.println(con.convert("Omkar"));
		
		
		
		con=(String s) ->new StringBuilder(s).reverse().toString();
		System.out.println(con.convert("Omkar"));
		
		
		con=(String s) -> s.substring(s.length()-3);
		System.out.println(con.convert("Omkar"));
	
		Generic<Integer,Integer> gr1 =(a,b) -> a+b ;
		System.out.println(gr1.get(10, 20));
		
		Generic<String,String> gr2 =(a,b) -> a+b ;
		System.out.println(gr2.get("Omkar", "Lohat"));
		
		

	
	}
}