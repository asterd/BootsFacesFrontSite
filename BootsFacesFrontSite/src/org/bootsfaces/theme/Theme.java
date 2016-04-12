package org.bootsfaces.theme;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Theme implements Serializable {
	private static final long serialVersionUID = -3503081656623751490L;

	private String currentTheme = "custom"; //"default";

	private String internalTheme = "custom"; //"default";

	private String customTheme="";

	public String getCurrentTheme() {
		return currentTheme;
	}
	public String getInternalTheme() {
		return internalTheme;
	}
	public String getCustomTheme() {
		return customTheme;
	}

	public void setCurrentTheme(String currentTheme) {
		this.currentTheme = currentTheme;
		if (currentTheme.equalsIgnoreCase("Freelancer")) {
			internalTheme="other";
			customTheme=currentTheme;
		} else if (currentTheme.equalsIgnoreCase("Grayscale")) {
			internalTheme="other";
			customTheme=currentTheme;
		} else {
			internalTheme = currentTheme;
			customTheme="";
		}
	}

	public void selectTheme() {
	}
}
