package com.amdocs.covidapi.util;

import java.util.ArrayList;
import java.util.List;

import com.amdocs.covidapi.pojo.CovidCareCentres;

public class Tester {
	
	List<CovidCareCentres> list=new ArrayList<CovidCareCentres>();
	
	public List<CovidCareCentres> getCentres()
	{
		list.add(new CovidCareCentres(1,"First Centre", 123456));
		list.add(new CovidCareCentres(2,"Second Centre", 789123));
		list.add(new CovidCareCentres(3,"Third Centre", 198762));
		list.add(new CovidCareCentres(4,"Fourth Centre", 987132));
		
		return list;
	}
	
	public CovidCareCentres getCentreByPin(long pin)
	{
		for (CovidCareCentres c : list) {
			if(c.getPinCode()==pin)
			{
				return c;
			}
		}
		return null;
	}
	
	public String addCentre(CovidCareCentres centre)
	{
		list.add(centre);
		return "Added";
	}
}


