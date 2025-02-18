package com.nimma.jersey.server.clientdatum;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement
public class ClientDatum {
	
	private int id;
	private String data;
	
	//Dummy ctor 
	public ClientDatum(){
		
	}
	
	@JsonCreator
	public ClientDatum (@JsonProperty("id") int id, @JsonProperty("data") String s){ //stupid java doesn't have a default ctor
		this.id = id;
		this.data = s;
	}
	
	public void setid(int id){
		this.id = id;
	}
	
	public int getid() {
		return id;
	}
	
	public String getdata(){
		return data;
	}
	
	public void setdata(String s){
		this.data = s;
	}
	
	@Override
	public String toString(){
		return "{ \"id\": " + id + "," + "\"data\": \"" + data + "\"}";
	}
	

}
