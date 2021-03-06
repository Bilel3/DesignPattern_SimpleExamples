package p1.designPattern.command;

public class SellStock implements Order {
	   private Stock abcStock;

	   public SellStock(Stock abcStock){
	      this.abcStock = abcStock;
	   }

	   public void execute() {
	      abcStock.sell();
	   }
	}
