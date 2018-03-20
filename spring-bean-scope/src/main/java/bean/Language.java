package bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.ScopedProxyMode;

@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class Language {
	private String language="Enlish";
 
	public Language() {
		System.out.println("Create new Language: " + this.language);
	}
 
	public String getLanguage() {
		return language;
	}
 
	public String setLanguage(String language) {
		this.language = language;
		return this.language;
	}
 
}
