
public class VisitorTest {
	public static void main(String[] args) {
		TaxVisitor taxCalc = new TaxVisitor();
		TaxHolidayVisitor taxHolidayCalc = new TaxHolidayVisitor();
		
		Necessity milk = new Necessity(3.47);
		Tabacco cigeratte = new Tabacco(19.11);
		Liquor vodka = new Liquor(11.99);
		
		System.out.println(milk.accept(taxCalc) + "\n");
		System.out.println(cigeratte.accept(taxCalc) + "\n");
		System.out.println(vodka.accept(taxCalc) + "\n");
		
		System.out.println("TAX HOLIDAY PRICES\n");
		
		System.out.println(milk.accept(taxHolidayCalc) + "\n");
		System.out.println(cigeratte.accept(taxHolidayCalc) + "\n");
		System.out.println(vodka.accept(taxHolidayCalc) + "\n");
	}
}
