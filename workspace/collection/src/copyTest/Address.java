package copyTest;

import java.util.Objects;

public class Address {
	private String street;
    private String city;
    private String country;
    
    public Address() {;}

    public Address(Address address) {
    	this(address.getStreet(), address.getCity(), address.getCountry());
    }
    
	public Address(String street, String city, String country) {
		super();
		this.street = street;
		this.city = city;
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", country=" + country + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, country, street);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return city.equals(other.city) && country.equals(other.country)
				&& street.equals(other.street);
	}
	
}












