package lastterm.year2223.de4.countrymanager;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class CountryArrayManager {
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
            this.countries[i] = this.countries[i-1];
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
        for (int i = 0; i < newArray.length - 1; i++){
            for (int j = i + 1; j < newArray.length; j++){
                if (newArray[i].getPopulation() > newArray[j].getPopulation()){
                    Country temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
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
        for (int i = 0; i < newArray.length - 1; i++){
            for (int j = i + 1; j < newArray.length; j++){
                if (newArray[i].getPopulation() < newArray[j].getPopulation()){
                    Country temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
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
        for (int i = 0; i < newArray.length - 1; i++){
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
        for (int i = 0; i < newArray.length - 1; i++){
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
        for (int i = 0; i < newArray.length - 1; i++){
            for (int j = i + 1; j < newArray.length; j++){
                if (newArray[i].getGdp() > newArray[j].getGdp()){
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
     *  sing insertion sort algorithm.
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */
        for (int i = 0; i < newArray.length - 1; i++){
            for (int j = i + 1; j < newArray.length; j++){
                if (newArray[i].getGdp() < newArray[j].getGdp()){
                    Country temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }

        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        /* TODO */
        List<AfricaCountry> country = new ArrayList<>();
        for (int i = 0; i < countries.length; i++){
            if (countryAt(i) instanceof AfricaCountry){
                country.add((AfricaCountry)countryAt(i));
            }
        }
        AfricaCountry[] res = new AfricaCountry[country.size()];
        for (int i = 0; i < res.length; i++){
            res[i] = country.get(i);
        }
        return res;
    }

    public AsiaCountry[] filterAsiaCountry() {
        /* TODO */
        List<AsiaCountry> country = new ArrayList<>();
        for (int i = 0; i < countries.length; i++){
            if (countryAt(i) instanceof AsiaCountry){
                country.add((AsiaCountry)countryAt(i));
            }
        }
        AsiaCountry[] res = new AsiaCountry[country.size()];
        for (int i = 0; i < res.length; i++){
            res[i] = country.get(i);
        }
        return res;
    }

    public EuropeCountry[] filterEuropeCountry() {
        /* TODO */
        List<EuropeCountry> country = new ArrayList<>();
        for (int i = 0; i < countries.length; i++){
            if (countryAt(i) instanceof EuropeCountry){
                country.add((EuropeCountry) countryAt(i));
            }
        }
        EuropeCountry[] res = new EuropeCountry[country.size()];
        for (int i = 0; i < res.length; i++){
            res[i] = country.get(i);
        }
        return res;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        /* TODO */
        List<NorthAmericaCountry> country = new ArrayList<>();
        for (int i = 0; i < countries.length; i++){
            if (countryAt(i) instanceof NorthAmericaCountry){
                country.add((NorthAmericaCountry) countryAt(i));
            }
        }
        NorthAmericaCountry[] res = new NorthAmericaCountry[country.size()];
        for (int i = 0; i < res.length; i++){
            res[i] = country.get(i);
        }
        return res;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        /* TODO */
        List<OceaniaCountry> country = new ArrayList<>();
        for (int i = 0; i < countries.length; i++){
            if (countryAt(i) instanceof OceaniaCountry){
                country.add((OceaniaCountry) countryAt(i));
            }
        }
        OceaniaCountry[] res = new OceaniaCountry[country.size()];
        for (int i = 0; i < res.length; i++){
            res[i] = country.get(i);
        }
        return res;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        /* TODO */
        List<SouthAmericaCountry> country = new ArrayList<>();
        for (int i = 0; i < countries.length; i++){
            if (countryAt(i) instanceof SouthAmericaCountry){
                country.add((SouthAmericaCountry) countryAt(i));
            }
        }
        SouthAmericaCountry[] res = new SouthAmericaCountry[country.size()];
        for (int i = 0; i < res.length; i++){
            res[i] = country.get(i);
        }
        return res;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        /* TODO */
        Country[] countries = sortByDecreasingPopulation();
        Country[] res = new Country[howMany];
        for (int i = 0; i < res.length; i++){
            res[i] = countries[i];
        }
        return res;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        /* TODO */
        Country[] countries = sortByIncreasingPopulation();
        Country[] res = new Country[howMany];
        for (int i = 0; i < res.length; i++){
            res[i] = countries[i];
        }
        return res;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        /* TODO */
        Country[] countries = sortByDecreasingArea();
        Country[] res = new Country[howMany];
        for (int i = 0; i < res.length; i++){
            res[i] = countries[i];
        }
        return res;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        /* TODO */
        Country[] countries = sortByIncreasingArea();
        Country[] res = new Country[howMany];
        for (int i = 0; i < res.length; i++){
            res[i] = countries[i];
        }
        return res;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        /* TODO */
        Country[] countries = sortByDecreasingGdp();
        Country[] res = new Country[howMany];
        for (int i = 0; i < res.length; i++){
            res[i] = countries[i];
        }
        return res;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        /* TODO */
        Country[] countries = sortByIncreasingGdp();
        Country[] res = new Country[howMany];
        for (int i = 0; i < res.length; i++){
            res[i] = countries[i];
        }
        return res;
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
