package com.example.roomdemo

@Entity(tableName = "products")
class Product {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "productId")
    var id: Int = 0

    @ColumnInfo(name = "productName")
    var productName: String = ""
    var quantity: Int = 0
    constructor()
    constructor(productname: String, quantity: Int) {
        this.productName = productname
        this.quantity = quantity
    }
}