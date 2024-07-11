package lastterm.year2223.de4.countrymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();
        testOriginalData();
        testSortIncreasingByPopulation();
        testSortDecreasingByPopulation();
        testSortIncreasingByArea();
        testSortDecreasingByArea();
        testSortIncreasingByGdp();
        testSortDecreasingByGdp();
        testFilterAfricaCountry();
        testFilterAsiaCountry();
        testFilterEuropeCountry();
        testFilterNorthAmericaCountry();
        testFilterOceaniaCountry();
        testFilterSouthAmericaCountry();
        testFilterMostPopulousCountries();
        testFilterLeastPopulousCountries();
        testFilterLargestAreaCountries();
        testFilterSmallestAreaCountries();
        testFilterHighestGdpCountries();
        testFilterLowestGdpCountries();
        

        /* TODO: write code to test program */
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }

                /*
                * TODO: create Country and append countries into 
                * CountryArrayManager here.
                */
                String code = dataList.get(0);
                String name = dataList.get(1);
                int population = Integer.parseInt(dataList.get(2));
                double area = Double.parseDouble(dataList.get(3));
                double gdp = Double.parseDouble(dataList.get(4));
                String continent = dataList.get(5);

                if (continent.equals("Africa")){
                    Country country = new AfricaCountry(code, name, population, area, gdp);
                    countryManager.append(country);
                }else if (continent.equals("Asia")){
                    Country country = new AsiaCountry(code, name, population, area, gdp);
                    countryManager.append(country);
                }else if (continent.equals("Europe")){
                    Country country = new EuropeCountry(code, name, population, area, gdp);
                    countryManager.append(country);
                }else if (continent.equals("Oceania")){
                    Country country = new OceaniaCountry(code, name, population, area, gdp);
                    countryManager.append(country);
                }else if (continent.equals("North America")){
                    Country country = new NorthAmericaCountry(code, name, population, area, gdp);
                    countryManager.append(country);
                }else if (continent.equals("South America")){
                    Country country = new SouthAmericaCountry(code, name, population, area, gdp);
                    countryManager.append(country);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "src/lastterm/year2223/de4/data/countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        System.out.println("testOriginalData:");
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.print(codesString);
        System.out.println();
    }

    public static void testSortIncreasingByPopulation() {
        System.out.println("\ntestSortIncreasingByPopulation:");
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();
    }

    public static void testSortDecreasingByPopulation() {
        /* TODO */
        System.out.println("\ntestSortDecreasingByPopulation:");
        Country[] countries = countryManager.sortByDecreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();
    }

    public static void testSortIncreasingByArea() {
        /* TODO */
        System.out.println("\ntestSortIncreasingByArea:");
        Country[] countries = countryManager.sortByIncreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();

    }

    public static void testSortDecreasingByArea() {
        /* TODO */
        System.out.println("\ntestSortDecreasingByArea:");
        Country[] countries = countryManager.sortByDecreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();

    }

    public static void testSortIncreasingByGdp() {
        /* TODO */
        System.out.println("\ntestSortIncreasingByGdp:");
        Country[] countries = countryManager.sortByIncreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();

    }

    public static void testSortDecreasingByGdp() {
        /* TODO */
        System.out.println("\ntestSortDecreasingByGdp:");
        Country[] countries = countryManager.sortByDecreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();

    }

    public static void testFilterAfricaCountry() {
        /* TODO */
        System.out.println("\ntestFilterAfricaCountry:");
        Country[] countries = countryManager.filterAfricaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();

    }

    public static void testFilterAsiaCountry() {
        /* TODO */
        System.out.println("\ntestFilterAsiaCountry:");
        Country[] countries = countryManager.filterAsiaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();

    }

    public static void testFilterEuropeCountry() {
        /* TODO */
        System.out.println("\ntestFilterEuropeCountry:");
        Country[] countries = countryManager.filterEuropeCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();

    }

    public static void testFilterNorthAmericaCountry() {
        /* TODO */
        System.out.println("\ntestFilterNorthAmericaCountry:");
        Country[] countries = countryManager.filterNorthAmericaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();

    }

    public static void testFilterOceaniaCountry() {
        /* TODO */
        System.out.println("\ntestFilterOceaniaCountry:");
        Country[] countries = countryManager.filterOceaniaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();

    }

    public static void testFilterSouthAmericaCountry() {
        /* TODO */
        System.out.println("\ntestFilterSouthAmericaCountry:");
        Country[] countries = countryManager.filterSouthAmericaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();

    }

    public static void testFilterMostPopulousCountries() {
        /* TODO */
        System.out.println("\ntestFilterMostPopulousCountries:");
        Country[] countries = countryManager.filterMostPopulousCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();

    }

    public static void testFilterLeastPopulousCountries() {
        /* TODO */
        System.out.println("\ntestFilterLeastPopulousCountries:");
        Country[] countries = countryManager.filterLeastPopulousCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();

    }

    public static void testFilterLargestAreaCountries() {
        /* TODO */
        System.out.println("\ntestFilterLargestAreaCountries:");
        Country[] countries = countryManager.filterLargestAreaCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();

    }

    public static void testFilterSmallestAreaCountries() {
        /* TODO */
        System.out.println("\ntestFilterSmallestAreaCountries:");
        Country[] countries = countryManager.filterSmallestAreaCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();

    }

    public static void testFilterHighestGdpCountries() {
        /* TODO */
        System.out.println("\ntestFilterHighestGdpCountries:");
        Country[] countries = countryManager.filterHighestGdpCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();

    }

    public static void testFilterLowestGdpCountries() {
        /* TODO */
        System.out.println("\ntestFilterLowestGdpCountries:");
        Country[] countries = countryManager.filterLowestGdpCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();

    }
}
