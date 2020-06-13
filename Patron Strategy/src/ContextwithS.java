


public class ContextwithS {
IStrategy strategy;
public void process(){
	strategy.applyComp();
}

public ContextwithS() {
	strategy= new DefaultStrategyImpl();
}

public void setStrategy(IStrategy s){
	this.strategy=s;
}
}
