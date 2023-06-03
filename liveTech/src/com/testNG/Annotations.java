package com.testNG;

import org.testng.annotations.Test;



public class Annotations
{
	@Test(priority=1)
	public void gmailApplicationLaunch() 
	{
		System.out.println("**successfully navigated to Gmail LogInpage**");
		
	}
@Test(priority=2)
public void gmailInboxTest() 
{
System.out.println("**Inbox Functionality Test Sucessfully**");
}
@Test(enabled=false)
public void gmailDraftTest() 
{
	System.out.println("**Draft Functionality Test sucess**");
}
	@Test(priority=5)
	public void gmailSentmailTest() 
	{
		System.out.println("**Sentmail Functionality Test Sucessfully");
	}
	@Test(priority=3)
	public void gmailComposemailTest() {
		System.out.println("**ComposemailFunctionalityTestSucessfull**");
	}
	@Test(priority=6)
	public void gmailApplicationclose() 
	{
		System.out.println("** Gmail application Close **");
	}}
	

