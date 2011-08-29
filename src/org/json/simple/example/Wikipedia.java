package org.json.simple.example;

import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONValue;

/**
 * This example will try to mimic the JSON representation you can find
 * in JSON page on Wikipedia[1].
 * 
 *	{
 *	     "firstName": "John",
 *	     "lastName": "Smith",
 *	     "age": 25,
 *	     "address":
 *	     {
 *	         "streetAddress": "21 2nd Street",
 *	         "city": "New York",
 *	         "state": "NY",
 *	         "postalCode": "10021"
 *	     },
 *	     "phoneNumber":
 *	     [
 *	         {
 *	           "type": "home",
 *	           "number": "212 555-1234"
 *	         },
 *	         {
 *	           "type": "fax",
 *	           "number": "646 555-4567"
 *	         }
 *	     ]
 *	 }
 * 
 * [1]http://en.wikipedia.org/wiki/JSON
 * 
 * @author Piero Ottuzzi <piero.ottuzzi@brucalipto.org>
 *
 */

public class Wikipedia 
{
	public static void main(String[] args) 
	{
		new Wikipedia();
	}
	
	public Wikipedia()
	{
		Map addressMap = new LinkedHashMap();
		addressMap.put("streetAddress", "21 2nd Street");
		addressMap.put("city", "New York");
		addressMap.put("state", "NY");
		addressMap.put("postalCode", "10021");
		
		Map phone1 = new LinkedHashMap();
		phone1.put("type", "home");
		phone1.put("number", "212 555-1234");
		
		Map phone2 = new LinkedHashMap();
		phone2.put("type", "fax");
		phone2.put("number", "646 555-4567");
		
		JSONArray phones = new JSONArray();
		phones.add(phone1);
		phones.add(phone2);
		
		Map userMap = new LinkedHashMap();
		userMap.put("firstName", "John");
		userMap.put("lastName", "Smith");
		userMap.put("age", new Integer(25));
		userMap.put("address", addressMap);
		userMap.put("phoneNumber", phones);
		
		System.out.println(JSONValue.toJSONString(userMap));
	}

}
