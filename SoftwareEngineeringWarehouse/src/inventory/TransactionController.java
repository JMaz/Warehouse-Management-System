package inventory;

public class TransactionController {

	private AddNewItemGUI addNewItemGui;
	private TransactionModel transactionModel;
	
	TransactionController(TransactionModel model, AddNewItemGUI view){
		addNewItemGui = view;
		transactionModel = model;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
