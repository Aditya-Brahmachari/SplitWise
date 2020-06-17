package Model;

import java.util.UUID;


public class User {
	
	private String name;
	private UUID uuid;
	private String email;
	private boolean isDeleted;
	private double totalAmountOwed;
	//expenses mapping to be done
	public User(String name, String email)
	{
		this.name = name;
		this.email= email;
		this.isDeleted = false;
		this.uuid = UUID.randomUUID();//random key for primary key
		totalAmountOwed=0.0;

	}
	public UUID getUuId()
	{
		return uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
}
