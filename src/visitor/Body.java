package visitor;

public class Body implements ICarElement{

	@Override
	public void accept(ICarElementVisitor visitor) {
		visitor.visit(this);
	}

}
