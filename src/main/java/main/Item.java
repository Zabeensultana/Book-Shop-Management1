package main;
public class Item{
    public String itemName;
    public int mrp;
    public  void addItem(String itemName,int mrpItem){
        //write your code here
    	setItemName(itemName);
    	setMrp(mrpItem);
   System.out.println();

    }
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getMrp() {
		return mrp;
	}
	public void setMrp(int mrp) {
		this.mrp = mrp;
	}
    
}