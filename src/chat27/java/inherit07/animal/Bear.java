package chat27.java.inherit07.animal;

public class Bear {

	private  boolean omnnivre;
	private boolean likesHoney;
	private String habitay;
	private String species;
	public boolean isOmnnivre() {
		return omnnivre;
	}
	public void setOmnnivre(boolean omnnivre) {
		this.omnnivre = omnnivre;
	}
	public boolean isLikesHoney() {
		return likesHoney;
	}
	public void setLikesHoney(boolean likesHoney) {
		this.likesHoney = likesHoney;
	}
	public String getHabitay() {
		return habitay;
	}
	public void setHabitay(String habitay) {
		this.habitay = habitay;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public Bear(int age,int size, int legCnt,boolean hasWing,boolean omnnivre, boolean likesHoney, String habitay, String species) {
		super();
		this.omnnivre = omnnivre;
		this.likesHoney = likesHoney;
		this.habitay = habitay;
		this.species = species;
	}
	
}
