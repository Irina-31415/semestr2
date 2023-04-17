import java.util.HashMap;
import java.util.Map;

public class Shop {
    Map<Integer, product> products;

    public class product {
        String name;
        int code;
        int rub;
        int cop;
    }

    public Shop() {
        products = new HashMap<>();
    }

    public void NewProduct(String name, int code, int rub, int cop) throws Exception {
        if (products.get(code) != null) {
            throw new Exception("CodeAlreadyExist");
        }
        product p = new product();
        p.name = name;
        p.code = code;
        p.rub = rub;
        p.cop = cop;
        products.put(code, p);
    }

    public void ChangePrice(int code, int rub, int cop) throws Exception {
        product p = products.get(code);
        if (p == null) {
            throw new Exception("ProductNotFound");
        }
        p.rub = rub;
        p.cop = cop;
        products.put(code, p);
    }

    public void ChangeName(int code, String name) throws Exception {
        product p = products.get(code);
        if (p == null) {
            throw new Exception("ProductNotFound");
        }
        p.name = name;
        products.put(code, p);

    }

    public void DeleteProduct(int code) throws Exception {
        product p = products.get(code);
        if (p == null) {
            throw new Exception("ProductNotFound");
        }
        products.remove(code);
    }

    public Double GetPrice(int code, int x) throws Exception {
        product p = products.get(code);
        if (p == null) {
            throw new Exception("ProductNotFound");
        }
        return ((double)p.rub + (double)p.cop / 100) * x;
    }

}
