package jspider;

public interface Bank {
	void deposite(int amt);
	void withDraw(int amt);
	int getBal();
	String errorMessage();
}

// All the above methods are automatically public and abstract
