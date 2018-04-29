package com.nubeclick.pos.dto;
// Generated 07/04/2018 08:40:29 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Product generated by hbm2java
 */
@Entity
@Table(name="product"
    ,catalog="posnubeclick"
)
public class Product  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = -5939706964112801298L;
	private int productId;
     private Warehouse warehouse;
     private String productDescription;
     private Double productCost;
     private double productPrice;
     private Double productStock;
     private Set<Saledetail> saledetails = new HashSet<Saledetail>(0);
     private Set<Purchasedetail> purchasedetails = new HashSet<Purchasedetail>(0);

    public Product() {
    }

	
    public Product(int productId, Warehouse warehouse, String productDescription, double productPrice) {
        this.productId = productId;
        this.warehouse = warehouse;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
    }
    public Product(int productId, Warehouse warehouse, String productDescription, Double productCost, double productPrice, Double productStock, Set<Saledetail> saledetails, Set<Purchasedetail> purchasedetails) {
       this.productId = productId;
       this.warehouse = warehouse;
       this.productDescription = productDescription;
       this.productCost = productCost;
       this.productPrice = productPrice;
       this.productStock = productStock;
       this.saledetails = saledetails;
       this.purchasedetails = purchasedetails;
    }
   
     @Id 

    
    @Column(name="product_id", unique=true, nullable=false)
    public int getProductId() {
        return this.productId;
    }
    
    public void setProductId(int productId) {
        this.productId = productId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="warehouse_id", nullable=false)
    public Warehouse getWarehouse() {
        return this.warehouse;
    }
    
    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    
    @Column(name="product_description", nullable=false, length=150)
    public String getProductDescription() {
        return this.productDescription;
    }
    
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    
    @Column(name="product_cost", precision=22, scale=0)
    public Double getProductCost() {
        return this.productCost;
    }
    
    public void setProductCost(Double productCost) {
        this.productCost = productCost;
    }

    
    @Column(name="product_price", nullable=false, precision=22, scale=0)
    public double getProductPrice() {
        return this.productPrice;
    }
    
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    
    @Column(name="product_stock", precision=22, scale=0)
    public Double getProductStock() {
        return this.productStock;
    }
    
    public void setProductStock(Double productStock) {
        this.productStock = productStock;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="product")
    public Set<Saledetail> getSaledetails() {
        return this.saledetails;
    }
    
    public void setSaledetails(Set<Saledetail> saledetails) {
        this.saledetails = saledetails;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="product")
    public Set<Purchasedetail> getPurchasedetails() {
        return this.purchasedetails;
    }
    
    public void setPurchasedetails(Set<Purchasedetail> purchasedetails) {
        this.purchasedetails = purchasedetails;
    }




}

