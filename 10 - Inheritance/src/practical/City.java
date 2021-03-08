/**
 * 
 */
package practical;

/**
 * @author Hugh
 *
 */
public class City {

	private String cityName;
	private int population;
	private boolean countryCapital;
	private String country;
	
	/**
	 * default constructor.
	 */
	public City() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * constructor with all args. Business rule in place for population.
	 * @param cityName
	 * @param population
	 * @param countryCapital
	 * @param country
	 */
	public City(String cityName, int population, boolean countryCapital, String country) {
		this.cityName = cityName;
		this.setPopulation(population);
		this.countryCapital = countryCapital;
		this.country = country;
	}

	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}

	/**
	 * method to set population value. population must be > 0  and < 50, otherwise it defaults to 1.
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		if (population > 0 && population < 50) {
			this.population = population;
		} else {
			System.err.println("Invalid population!");
			this.population = 1;
		}
	}

	/**
	 * @return the countryCapital
	 */
	public boolean isCountryCapital() {
		return countryCapital;
	}

	/**
	 * @param countryCapital the countryCapital to set
	 */
	public void setCountryCapital(boolean countryCapital) {
		this.countryCapital = countryCapital;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", population=" + population + ", countryCapital=" + countryCapital
				+ ", country=" + country + "]";
	}
	
	

	
}
