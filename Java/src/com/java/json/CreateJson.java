package com.java.json;

import java.io.PrintWriter;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class CreateJson {

	public static void main(String[] args) {

		JsonObject json = new JsonObject();
		json.addProperty("type", "it");

		JsonArray array = new JsonArray();

		JsonObject lan1 = new JsonObject();
		lan1.addProperty("id", 1);
		lan1.addProperty("name", "Java");
		lan1.addProperty("ide", "Eclipse");

		JsonObject lan2 = new JsonObject();
		lan2.addProperty("id", 2);
		lan2.addProperty("name", "C#");
		lan2.addProperty("ide", "VS");

		array.add(lan1);
		array.add(lan2);

		json.add("language", array);
		json.addProperty("oc", true);
		
		System.out.println(json.toString());
	}
}
