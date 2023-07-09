package com.regression;

import com.generic.Login;
import com.generic.OnlineBanking;

public class SmokeTestOnlineBanking extends Login {
	
	public static void main(String[] args) throws Throwable {
		OnlineBanking.getLongin();
	}
}
