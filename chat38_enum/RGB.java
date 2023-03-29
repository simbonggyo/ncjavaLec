package chat38_enum;

public enum RGB {
	RED("red",255,0,0),GREEN("green",0,255,0),BLUE("blue",0,0,255);
	private String color; 
	private int memoney;
	private int width;
	private int weight;
	
	private RGB(String color,int memoney,int width,int weight) {
		this.color = color;
		this.memoney = memoney;
		this.width = width;
		this.weight = weight;
		
	}

	public String getColor() {
		return color;
	}

	public int getMemoney() {
		return memoney;
	}

	public int getWidth() {
		return width;
	}

	public int getWeight() {
		return weight;
	}

}
