package com.pokemon.service;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;
import com.pokemon.model.Specie;
import com.pokemon.model.SpecieDetail;
import com.pokemon.model.Species;

public class CarouselServiceImpl implements CarouselService {

	@Override
	public void register(Specie specie) {
		// TODO Auto-generated method stub
	}

	@Override
	public Species fetch(String sURL) {
		
		Species species = new Species();
		
		try {
			URL oracle = new URL(sURL);
            URLConnection urlConnection = oracle.openConnection();
            urlConnection.addRequestProperty("User-Agent", "Mozilla");
            urlConnection.setReadTimeout(5000);
            urlConnection.setConnectTimeout(5000);
            BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            
            String inputLine;
            JSONParser parser = new JSONParser();
            
            while ((inputLine = in.readLine()) != null) {              
            	JSONObject a = (JSONObject) parser.parse(inputLine);
            	List<JSONObject> results = (ArrayList<JSONObject>) a.get("results");
            	
            	int i = 1;
            	for (JSONObject o : results) {
                	Specie specie = new Specie();
                	specie.setId(i);
                	specie.setName((String) o.get("name"));
                	specie.setUrl((String) o.get("url"));
                	species.addToList().add(specie);
                	i++;
            	}
            }
            in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    
		return species;
	}


	@Override
	public SpecieDetail fetchDetail(String sURL) {
		
		SpecieDetail detail = new SpecieDetail();
		
		try {
			URL oracle = new URL(sURL);
            URLConnection urlConnection = oracle.openConnection();
            urlConnection.addRequestProperty("User-Agent", "Mozilla");
            urlConnection.setReadTimeout(5000);
            urlConnection.setConnectTimeout(5000);
            BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            
            String inputLine;
            JSONParser parser = new JSONParser();
            
            while ((inputLine = in.readLine()) != null) {              
            	JSONObject a = (JSONObject) parser.parse(inputLine);
            	detail = new Gson().fromJson(a.toJSONString(), SpecieDetail.class);
            }
            in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    
		return detail;
	}
}
