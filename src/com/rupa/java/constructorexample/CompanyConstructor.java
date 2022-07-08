package com.rupa.java.constructorexample;

public class CompanyConstructor {
	String domainName;

	CompanyConstructor() {
		domainName = "developer";
		System.out.println("your domain name is" + domainName);

	}

	public static void main(String[] args) {
		new CompanyConstructor();
		// cc.domainName();
			}


}
