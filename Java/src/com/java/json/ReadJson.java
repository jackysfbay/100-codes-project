package com.java.json;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.JsonArray;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class ReadJson {
	
	public static void main(String[] args) throws JsonIOException, JsonSyntaxException, FileNotFoundException  {
		 JsonParser parser = new JsonParser();
		 JsonObject object =(JsonObject) parser.parse(new FileReader("test.json"));	
		 System.out.println("type="+object.get("type").getAsString());
		 System.out.println("oc="+object.get("oc").getAsBoolean());
		 
		JsonArray array = object.get("language").getAsJsonArray();
		
		for (int i = 0; i < array.size(); i++) {
			System.out.println("-----------Array----------------");
			JsonObject subObj = array.get(i).getAsJsonObject();
			System.out.println("id="+subObj.get("id").getAsString());
			System.out.println("name="+subObj.get("name").getAsString());
			System.out.println("ide="+subObj.get("ide").getAsString());
			
		}
		
		 
	}


	
}
