package maptype;

import java.util.Map;

public class Country {
	private String countryname;
	private Map<String,String> stateandlanguge;
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public Map<String, String> getStateandlanguge() {
		return stateandlanguge;
	}
	public void setStateandlanguge(Map<String, String> stateandlanguge) {
		this.stateandlanguge = stateandlanguge;
	}
	@Override
	public String toString() {
		return "Country [countryname=" + countryname + ", stateandlanguge=" + stateandlanguge + "]";
	}
	

}
