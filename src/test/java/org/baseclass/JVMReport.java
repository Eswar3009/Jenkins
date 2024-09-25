package org.baseclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class JVMReport{
	public static void  generateJvmReport( String jsonpath) {
		
		File f=new File("D:\\eclipse\\CucumberClass\\AllReports\\jvmreport");
		
		Configuration c=new Configuration(f,"facebook application");
		c.addClassifications("windows","11");
		c.addClassifications("jdk","1.7");
		c.addClassifications("tools","eclipse photon r");
		
		
		List l=new ArrayList();
		l.add(jsonpath);
		
		ReportBuilder r=new ReportBuilder(l, c);
		r.generateReports();
	}
	}


