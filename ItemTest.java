import org.junit.*;
import static org.junit.Assert.*;

public class ItemTest {

  Item item1;
  Item item2;
  Item item3;
  Item item4;
  Item item5;
  Item item6;

  @Before
  public void before(){
    item1 = new Item("toothpaste", 1.25);
    item2 = new Item("watermelon", 2.00);
    item3 = new Item("cloth", 0.99);
    item4 = new Item("rice", 2.99);
    item5 = new Item("pizza", 2.00);
    item6 = new Item("shirt", 15.00);
  }

  @Test
  public void canGetName(){
    assertEquals("toothpaste", item1.getName());
  }

  @Test
  public void canGetPrice(){
    assertEquals(2.00, item6.getPrice(), 0.01);
  }

  @Test
  public void canSetName(){
    item5.setName("orange");
    assertEquals("orange", item5.getName());
  }

  @Test
  public void canSetPrice(){
    item8.setPrice(20.00);
    assertEquals(20.00, item8.getPrice(), 0.01);
  }
}