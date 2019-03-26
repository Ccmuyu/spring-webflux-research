package name.zicat.spring.webflux.research.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ProductInfo {

    private int productId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date time;


    public ProductInfo(int productId) {
        this.productId = productId;
        this.time = new Date();
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

}
