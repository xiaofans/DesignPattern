package visitor;

public interface Visitor {
	public void visit(Book book);
	// visit other concreate items
	public void visit(CD cd);
	public void visit(DVD dvd);

}