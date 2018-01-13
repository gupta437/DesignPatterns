package visitor;

public interface Visitor {
	public double visit(Liquor liquorItem);
	public double visit(Tabacco tabaccoItem);
	public double visit(Necessity necessityItem);
}
