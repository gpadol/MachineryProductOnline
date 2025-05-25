package Machinery.product.MachineryProductOnline.Model;

import org.springframework.stereotype.Component;

@Component


public class Products {

    public Products() {
    }

    private int prodID;
    private String prodName;
    private String prodDes;

    public Products(int prodID, String prodName, String prodDes) {
        this.prodID = prodID;
        this.prodName = prodName;
        this.prodDes = prodDes;
    }

    public int getProdID() {
        return prodID;
    }

    public void setProdID(int prodID) {
        this.prodID = prodID;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdDes() {
        return prodDes;
    }

    public void setProdDes(String prodDes) {
        this.prodDes = prodDes;
    }
}
