package lambdasinaction.chap5;
public  class Trader{
	
	private String name;
	private String city;

	public Trader(String n, String c){
		this.name = n;
		this.city = c;
	}

	public String getName(){
		return this.name;
	}

	public String getCity(){
		return this.city;
	}

	public void setCity(String newCity){
		this.city = newCity;
	}

	public String toString(){
		return "Trader:"+this.name + " in " + this.city;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		final Trader trader = (Trader) o;

		if (name != null ? !name.equals(trader.name) : trader.name != null) return false;
		return city != null ? city.equals(trader.city) : trader.city == null;
	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (city != null ? city.hashCode() : 0);
		return result;
	}
}