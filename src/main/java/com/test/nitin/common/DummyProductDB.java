package com.test.nitin.common;

import java.util.HashMap;
import java.util.Map;

public class DummyProductDB {
public static DummyProductDB prodDB = null;
public static Map<String, Object > map;
private DummyProductDB(){
	map = new HashMap<String, Object>();
}
public static DummyProductDB getInstance(){
	if(prodDB == null)
		prodDB  = new DummyProductDB();
		return prodDB;
	
}
}
