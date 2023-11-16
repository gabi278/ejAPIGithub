package main;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataJson {
	public static void parsear(String jsonText) {
		ObjectMapper objectMapper = new ObjectMapper();
		Repositorio repo = null;
		try {
			repo = objectMapper.readValue(jsonText, Repositorio.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(repo);
	}

	public static void parsearMap(String jsonText) {
		//Parseamos un json a un Map ( clave: valor)
		ObjectMapper objectMapper = new ObjectMapper();
		Map<String,Object> map = null ; //String clave, Object valor
		try {
			map = objectMapper.readValue(jsonText, new TypeReference<Map<String,Object>>(){});
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(map.get("name"));
		System.out.println(map.get("description"));
		System.out.println(map.get("html_url"));
	}
}
