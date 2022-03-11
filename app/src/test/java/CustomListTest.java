import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @Before
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize + 1);
    }

    @Test
    public void hasCityTest() {
        City city = new City("Edmonton", "AB");
        assertEquals(1, list.hasCity(city));

        list.addCity(city);
        assertEquals(0, list.hasCity(city));
    }

    @Test
    public void deleteCityTest(){

        City city = new City("Montreal", "QC");
        list.addCity(city);

        assertEquals(1, list.getCount());
        list.deleteCity(city);
        assertEquals(0, list.getCount());
        assertEquals(1, list.hasCity(city));
    }

    @Test
    public void countCitiesTest(){

        City city = new City("Saskatoon", "SK");
        assertEquals(list.countCities(), list.getCount());
        list.addCity(city);
        assertEquals(list.countCities(), list.getCount());
    }
}
