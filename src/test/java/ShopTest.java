import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTest {
    @Test
    void testShop() throws Exception {
        Shop MyShop = new Shop();
        MyShop.NewProduct("Jupiter", 5, 4, 11);
        MyShop.NewProduct("Pluto", 9, 8, 16);
        MyShop.NewProduct("Mars", 4, 14, 32);
        MyShop.NewProduct("Saturn", 6, 94, 58);
        Shop.product p = MyShop.products.get(9);
        assertEquals(p.code, 9);
        assertEquals(p.name, "Pluto");
        assertEquals(p.rub, 8);
        assertEquals(p.cop, 16);

        MyShop.ChangePrice(4, 23, 4);
        Shop.product n = MyShop.products.get(4);
        assertEquals(n.rub, 23);
        assertEquals(n.cop, 4);

        MyShop.ChangeName(6, "Venus");
        Shop.product m = MyShop.products.get(6);
        assertEquals(m.name, "Venus");

        MyShop.DeleteProduct(5);
        assertEquals(MyShop.products.get(5), null);

        assertEquals(MyShop.GetPrice(9, 4), 32.64);

    }
}
