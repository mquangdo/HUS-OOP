package hus.oop.contrymanager;

public class CountryArrayManager {
    public static void main(String[] args) {

    }
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i - 1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population 
     *  using selection sort algorithm.
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */
        for (int i = 0 ; i < newArray.length - 1; i++){
            int minIdx = i;
            for (int j = i + 1; j < newArray.length; j++){
                if (newArray[i].getPopulation() < newArray[minIdx].getPopulation()){
                    minIdx = j;
                }
            }
            Country temp = newArray[i];
            newArray[i] = newArray[minIdx];
            newArray[minIdx] = temp;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population 
     *  using selection sort algorithm.
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */

        for (int i = 0 ; i < newArray.length - 1; i++){
            int minIdx = i;
            for (int j = i + 1; j < newArray.length; j++){
                if (newArray[i].getPopulation() > newArray[minIdx].getPopulation()){
                    minIdx = j;
                }
            }
            Country temp = newArray[i];
            newArray[i] = newArray[minIdx];
            newArray[minIdx] = temp;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing area 
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */
        for (int i = 0 ; i < newArray.length - 1; i++){
            for (int j = i + 1; j < newArray.length; j++){
                if (newArray[i].getArea() > newArray[j].getArea()){
                    Country temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area 
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */
        for (int i = 0 ; i < newArray.length - 1; i++){
            for (int j = i + 1; j < newArray.length; j++){
                if (newArray[i].getArea() < newArray[j].getArea()){
                    Country temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP 
     *  using insertion sort algorithm.
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */

        for(int i = 1; i < newArray.length; i++){
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() > key.getGdp()){
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = key;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP 
     *  sing insertion sort algorithm.
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */
        for(int i = 1; i < newArray.length; i++){
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() < key.getGdp()){
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = key;
        }
        return newArray;

    }

    public AfricaCountry[] filterAfricaCountry() {
        /* TODO */
        AfricaCountry[] africaCountries = new AfricaCountry[this.countries.length];
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] instanceof AfricaCountry) {
                africaCountries[i] = (AfricaCountry) this.countries[i];
            }
        }
        return africaCountries;
    }

    public AsiaCountry[] filterAsiaCountry() {
        /* TODO */
        AsiaCountry[] asiaCountries = new AsiaCountry[this.countries.length];
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] instanceof AsiaCountry) {
                asiaCountries[i] = (AsiaCountry) this.countries[i];
            }
        }
        return asiaCountries;
    }

    public EuropeCountry[] filterEuropeCountry() {
        /* TODO */
        EuropeCountry[] europeCountries = new EuropeCountry[this.countries.length];
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] instanceof EuropeCountry) {
                europeCountries[i] = (EuropeCountry) this.countries[i];
            }
        }
        return europeCountries;
    }

    public NorthAmericaCountry filterNorthAmericaCountry() {
        /* TODO */
        return null;
    }

    public long[] filterOceaniaCountry() {
        /* TODO */
        return null;
    }

    public long[] filterSouthAmericaCountry() {
        /* TODO */
        return null;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        /* TODO */
        sortByDecreasingPopulation();
        Country[] mostPopulousCountries = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            mostPopulousCountries[i] = this.countries[i];
        }
        return mostPopulousCountries;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        /* TODO */
        sortByIncreasingPopulation();
        Country[] leastPopulousCountries = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            leastPopulousCountries[i] = this.countries[i];
        }
        return leastPopulousCountries;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        /* TODO */
        sortByDecreasingArea();
        Country[] largestAreaCountries = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            largestAreaCountries[i] = this.countries[i];
        }
        return largestAreaCountries;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        /* TODO */
        sortByIncreasingArea();
        Country[] smallestAreaCountries = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            smallestAreaCountries[i] = this.countries[i];
        }
        return smallestAreaCountries;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        /* TODO */
        sortByDecreasingGdp();
        Country[] highestGdpCountries = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            highestGdpCountries[i] = this.countries[i];
        }
        return highestGdpCountries;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        /* TODO */
        sortByIncreasingGdp();
        Country[] lowestGdpCountries = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            lowestGdpCountries[i] = this.countries[i];
        }
        return lowestGdpCountries;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }
        
        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
