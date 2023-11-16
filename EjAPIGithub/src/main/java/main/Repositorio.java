package main;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Repositorio {
	private String name;
	private String description;
	private String html_url;
	
	public Repositorio() {
		
	}
	public Repositorio(String name, String description, String html_url) {
		super();
		this.name = name;
		this.description = description;
		this.html_url = html_url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHtml_url() {
		return html_url;
	}
	public void setHtml_url(String html_url) {
		this.html_url = html_url;
	}
	@Override
	public String toString() {
		return "Repositorio [name=" + name + ", description=" + description + ", html_url=" + html_url + "]";
	}
	
}
