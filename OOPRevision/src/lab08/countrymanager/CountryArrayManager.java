package lab08.countrymanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.*;

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
        for (int i = 0; i < newArray.length; i++){
            int minIdx = i;
            for (int j = i + 1; j < newArray.length; j++){
                if (newArray[j].getPopulation() < newArray[minIdx].getPopulation()){
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
        for (int i = 0; i < newArray.length; i++){
            int minIdx = i;
            for (int j = i + 1; j < newArray.length; j++){
                if (newArray[j].getPopulation() > newArray[minIdx].getPopulation()){
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
        for (int i = 0; i < newArray.length - 1; i++){
            for (int j = 0; j < newArray.length - 1 - 1; j++){
                if (newArray[j + 1].getArea() < newArray[j].getPopulation()){
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
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
            for (int j = 0; j < newArray.length - 1 - 1; j++){
                if (newArray[j + 1].getArea() > newArray[j].getPopulation()){
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
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
        for (int i = 1; i < newArray.length - 1; i++){
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
        for (int i = 1; i < newArray.length - 1; i++){
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
        List<AfricaCountry> africa = new ArrayList<>();
        for (Country country: countries){
            if (country instanceof AfricaCountry){
                africa.add((AfricaCountry)country);
            }
        }
        AfricaCountry[] africaCountries = new AfricaCountry[africa.size()];
        for (int i = 0; i < africaCountries.length; i++){
            africaCountries[i] = africa.get(i);
        }
        return africaCountries;
    }

    public AsiaCountry[] filterAsiaCountry() {
        /* TODO */
        List<AsiaCountry> asia = new ArrayList<>();
        for (Country country: countries){
            if (country instanceof AsiaCountry){
                asia.add((AsiaCountry)country);
            }
        }
        AsiaCountry[] asiaCountries = new AsiaCountry[asia.size()];
        for (int i = 0; i < asiaCountries.length; i++){
            asiaCountries[i] = asia.get(i);
        }
        return asiaCountries;
    }

    public EuropeCountry[] filterEuropeCountry() {
        /* TODO */
        List<EuropeCountry> europe = new ArrayList<>();
        for (Country country: countries){
            if (country instanceof EuropeCountry){
                europe.add((EuropeCountry) country);
            }
        }
        EuropeCountry[] europeCountries = new EuropeCountry[europe.size()];
        for (int i = 0; i < europeCountries.length; i++){
            europeCountries[i] = europe.get(i);
        }
        return europeCountries;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        /* TODO */
        List<NorthAmericaCountry> northAmerica = new ArrayList<>();
        for (Country country: countries){
            if (country instanceof NorthAmericaCountry){
                northAmerica.add((NorthAmericaCountry) country);
            }
        }
        NorthAmericaCountry[] northAmericaCountries = new NorthAmericaCountry[][northAmerica.size()];
        for (int i = 0; i < northAmericaCountries.length; i++){
            northAmericaCountries[i] = northAmerica.get(i);
        }
        return northAmericaCountries;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        /* TODO */
        List<OceaniaCountry> asia = new ArrayList<>();
        for (Country country: countries){
            if (country instanceof OceaniaCountry){
                asia.add((OceaniaCountry) country);
            }
        }
        OceaniaCountry[] oceaniaCountries = new OceaniaCountry[asia.size()];
        for (int i = 0; i < oceaniaCountries.length; i++){
            oceaniaCountries[i] = asia.get(i);
        }
        return oceaniaCountries;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        /* TODO */
        List<SouthAmericaCountry> asia = new ArrayList<>();
        for (Country country: countries){
            if (country instanceof SouthAmericaCountry){
                asia.add((SouthAmericaCountry) country);
            }
        }
        SouthAmericaCountry[] southAmericaCountries = new SouthAmericaCountry[][asia.size()];
        for (int i = 0; i < southAmericaCountries.length; i++){
            southAmericaCountries[i] = asia.get(i);
        }
        return southAmericaCountries;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        /* TODO */
        Country[] countriesSorted = sortByDecreasingPopulation();
        Country[] mostPopulousCountries = null;
        int size = Math.min(howMany, countriesSorted.length);
        if (size > 0) {
            mostPopulousCountries = new Country[size];
            for (int index = 0; index < size; index++) {
                mostPopulousCountries[index] = countriesSorted[index];
            }
        }
        return mostPopulousCountries;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        /* TODO */
        Country[] countriesSorted = sortByIncreasingPopulation();
        Country[] mostPopulousCountries = null;
        int size = Math.min(howMany, countriesSorted.length);
        if (size > 0) {
            mostPopulousCountries = new Country[size];
            for (int index = 0; index < size; index++) {
                mostPopulousCountries[index] = countriesSorted[index];
            }
        }
        return mostPopulousCountries;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        /* TODO */
        Country[] countriesSorted = sortByDecreasingArea();
        Country[] mostPopulousCountries = null;
        int size = Math.min(howMany, countriesSorted.length);
        if (size > 0) {
            mostPopulousCountries = new Country[size];
            for (int index = 0; index < size; index++) {
                mostPopulousCountries[index] = countriesSorted[index];
            }
        }
        return mostPopulousCountries;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        /* TODO */
        Country[] countriesSorted = sortByIncreasingArea();
        Country[] mostPopulousCountries = null;
        int size = Math.min(howMany, countriesSorted.length);
        if (size > 0) {
            mostPopulousCountries = new Country[size];
            for (int index = 0; index < size; index++) {
                mostPopulousCountries[index] = countriesSorted[index];
            }
        }
        return mostPopulousCountries;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        /* TODO */
        Country[] countriesSorted = sortByDecreasingGdp();
        Country[] mostPopulousCountries = null;
        int size = Math.min(howMany, countriesSorted.length);
        if (size > 0) {
            mostPopulousCountries = new Country[size];
            for (int index = 0; index < size; index++) {
                mostPopulousCountries[index] = countriesSorted[index];
            }
        }
        return mostPopulousCountries;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        /* TODO */
        Country[] countriesSorted = sortByIncreasingGdp();
        Country[] mostPopulousCountries = null;
        int size = Math.min(howMany, countriesSorted.length);
        if (size > 0) {
            mostPopulousCountries = new Country[size];
            for (int index = 0; index < size; index++) {
                mostPopulousCountries[index] = countriesSorted[index];
            }
        }
        return mostPopulousCountries;
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
