package hus.oop.contrymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();
        /* TODO: write code to test program */
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

                if (dataList.get(5).equals("Europe")) {
                    countryManager.append(new EuropeCountry(code, name, population, area, gdp));
                } else if (dataList.get(5).equals("Asia")) {
                    countryManager.append(new AsiaCountry(code, name, population, area, gdp));
                } else if (dataList.get(5).equals("Africa")) {
                    countryManager.append(new AfricaCountry(code, name, population, area, gdp));
                } else if (dataList.get(5).equals("North America")) {
                    countryManager.append(new NorthAmericaCountry(code, name, population, area, gdp));
                } else if (dataList.get(5).equals("South America")) {
                    countryManager.append(new SouthAmericaCountry(code, name, population, area, gdp));
                } else if (dataList.get(5).equals("Oceania")) {
                    countryManager.append(new OceaniaCountry(code, name, population, area, gdp));
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
        String filePath = "D:\\Users\\Asus\\IntellijProjects\\OOP\\src\\hus\\oop\\contrymanager\\countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.print(codesString);
    }

    public static void testSortIncreasingByPopulation() {
        /* TODO */
        System.out.println("The original array is: ");
        CountryArrayManager.print(countryManager.getCountries());
        Country[] country = countryManager.sortByIncreasingPopulation();
        System.out.println("The sorted array is: ");
        CountryArrayManager.print(country);
    }

    public static void testSortDecreasingByPopulation() {
        /* TODO */
        System.out.println("The original array is: ");
        CountryArrayManager.print(countryManager.getCountries());
        Country[] country = countryManager.sortByDecreasingPopulation();
        System.out.println("The sorted array is: ");
        CountryArrayManager.print(country);
    }

    public static void testSortIncreasingByArea() {
        /* TODO */
        System.out.println("The original array is: ");
        CountryArrayManager.print(countryManager.getCountries());
        Country[] country = countryManager.sortByIncreasingArea();
        System.out.println("The sorted array is: ");
        CountryArrayManager.print(country);

    }

    public static void testSortDecreasingByArea() {
        /* TODO */
        System.out.println("The original array is: ");
        CountryArrayManager.print(countryManager.getCountries());
        Country[] country = countryManager.sortByDecreasingArea();
        System.out.println("The sorted array is: ");
        CountryArrayManager.print(country);
    }

    public static void testSortIncreasingByGdp() {
        /* TODO */
        System.out.println("The original array is: ");
        CountryArrayManager.print(countryManager.getCountries());
        Country[] country = countryManager.sortByIncreasingGdp();
        System.out.println("The sorted array is: ");
        CountryArrayManager.print(country);
    }

    public static void testSortDecreasingByGdp() {
        /* TODO */
        System.out.println("The original array is: ");
        CountryArrayManager.print(countryManager.getCountries());
        Country[] country = countryManager.sortByDecreasingGdp();
        System.out.println("The sorted array is: ");
        CountryArrayManager.print(country);
    }

    public static void testFilterAfricaCountry() {
        /* TODO */
        System.out.println("The Africa countries are:");
        System.out.println(Arrays.toString(countryManager.filterAfricaCountry()));
    }

    public static void testFilterAsiaCountry() {
        /* TODO */
        System.out.println("The Asia countries are:");
        System.out.println(Arrays.toString(countryManager.filterAsiaCountry()));
    }

    public static void testFilterEuropeCountry() {
        /* TODO */
        System.out.println("The Europe countries are:");
        System.out.println(Arrays.toString(countryManager.filterEuropeCountry()));
    }

    public static void testFilterNorthAmericaCountry() {
        /* TODO */
        System.out.println("The North America countries are:");
//        System.out.println(Arrays.toString(countryManager.filterNorthAmericaCountry()));
    }

    public static void testFilterOceaniaCountry() {
        /* TODO */
        System.out.println("The Oceania countries are:");
        System.out.println(Arrays.toString(countryManager.filterOceaniaCountry()));
    }

    public static void testFilterSouthAmericaCountry() {
        /* TODO */
        System.out.println("The South America countries are:");
        System.out.println(Arrays.toString(countryManager.filterSouthAmericaCountry()));
    }

    public static void testFilterMostPopulousCountries() {
        /* TODO */
        System.out.println("The most populous countries are:");
        System.out.println(Arrays.toString(countryManager.filterMostPopulousCountries(10)));
    }

    public static void testFilterLeastPopulousCountries() {
        /* TODO */
        System.out.println("The least populous countries are:");
        System.out.println(Arrays.toString(countryManager.filterLeastPopulousCountries(10)));
    }

    public static void testFilterLargestAreaCountries() {
        /* TODO */
        System.out.println("The largest area countries are:");
        System.out.println(Arrays.toString(countryManager.filterLargestAreaCountries(10)));
    }

    public static void testFilterSmallestAreaCountries() {
        /* TODO */
        System.out.println("The smallest area countries are:");
        System.out.println(Arrays.toString(countryManager.filterSmallestAreaCountries(10)));
    }

    public static void testFilterHighestGdpCountries() {
        /* TODO */
        System.out.println("The highest GDP countries are:");
        System.out.println(Arrays.toString(countryManager.filterHighestGdpCountries(10)));
    }

    public static void testFilterLowestGdpCountries() {
        /* TODO */
        System.out.println("The lowest GDP countries are:");
        System.out.println(Arrays.toString(countryManager.filterLowestGdpCountries(10)));
    }
}
