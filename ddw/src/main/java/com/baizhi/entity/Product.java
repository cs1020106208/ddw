package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

public class Product {

    private Integer bookId;
    private Integer cid;
    private String bookName;
    private Double bookPrice;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private java.util.Date groundingdate;
    private String bookState;
    private Integer inventory;
    private String author;
    private String press;
    private Integer editnum;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private java.util.Date printDate;
    private Integer printCount;
    private String isbn;
    private String wordCount;
    private String pageCount;
    private String style;
    private String page;
    private String pack;
    private Integer salenum;
    private Double customeScore;
    private String recommend;
    private String messages;
    private String authorMsg;
    private String list;
    private String mediaComment;
    private String imagepath;
    private String seriesName;
    private Double dangprice;
    private String productImage;
    public Product() {
        super();
    }
    public Product(Integer bookId,Integer cid,String bookName,Double bookPrice,java.util.Date groundingdate,String bookState,Integer inventory,String author,String press,Integer editnum,java.util.Date printDate,Integer printCount,String isbn,String wordCount,String pageCount,String style,String page,String pack,Integer salenum,Double customeScore,String recommend,String messages,String authorMsg,String list,String mediaComment,String imagepath,String seriesName,Double dangprice,String productImage) {
        super();
        this.bookId = bookId;
        this.cid = cid;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.groundingdate = groundingdate;
        this.bookState = bookState;
        this.inventory = inventory;
        this.author = author;
        this.press = press;
        this.editnum = editnum;
        this.printDate = printDate;
        this.printCount = printCount;
        this.isbn = isbn;
        this.wordCount = wordCount;
        this.pageCount = pageCount;
        this.style = style;
        this.page = page;
        this.pack = pack;
        this.salenum = salenum;
        this.customeScore = customeScore;
        this.recommend = recommend;
        this.messages = messages;
        this.authorMsg = authorMsg;
        this.list = list;
        this.mediaComment = mediaComment;
        this.imagepath = imagepath;
        this.seriesName = seriesName;
        this.dangprice = dangprice;
        this.productImage = productImage;
    }
    public Integer getBookId() {
        return this.bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getCid() {
        return this.cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Double getBookPrice() {
        return this.bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public java.util.Date getGroundingdate() {
        return this.groundingdate;
    }

    public void setGroundingdate(java.util.Date groundingdate) {
        this.groundingdate = groundingdate;
    }

    public String getBookState() {
        return this.bookState;
    }

    public void setBookState(String bookState) {
        this.bookState = bookState;
    }

    public Integer getInventory() {
        return this.inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return this.press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public Integer getEditnum() {
        return this.editnum;
    }

    public void setEditnum(Integer editnum) {
        this.editnum = editnum;
    }

    public java.util.Date getPrintDate() {
        return this.printDate;
    }

    public void setPrintDate(java.util.Date printDate) {
        this.printDate = printDate;
    }

    public Integer getPrintCount() {
        return this.printCount;
    }

    public void setPrintCount(Integer printCount) {
        this.printCount = printCount;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getWordCount() {
        return this.wordCount;
    }

    public void setWordCount(String wordCount) {
        this.wordCount = wordCount;
    }

    public String getPageCount() {
        return this.pageCount;
    }

    public void setPageCount(String pageCount) {
        this.pageCount = pageCount;
    }

    public String getStyle() {
        return this.style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getPage() {
        return this.page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPack() {
        return this.pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public Integer getSalenum() {
        return this.salenum;
    }

    public void setSalenum(Integer salenum) {
        this.salenum = salenum;
    }

    public Double getCustomeScore() {
        return this.customeScore;
    }

    public void setCustomeScore(Double customeScore) {
        this.customeScore = customeScore;
    }

    public String getRecommend() {
        return this.recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public String getMessages() {
        return this.messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public String getAuthorMsg() {
        return this.authorMsg;
    }

    public void setAuthorMsg(String authorMsg) {
        this.authorMsg = authorMsg;
    }

    public String getList() {
        return this.list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public String getMediaComment() {
        return this.mediaComment;
    }

    public void setMediaComment(String mediaComment) {
        this.mediaComment = mediaComment;
    }

    public String getImagepath() {
        return this.imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    public String getSeriesName() {
        return this.seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public Double getDangprice() {
        return this.dangprice;
    }

    public void setDangprice(Double dangprice) {
        this.dangprice = dangprice;
    }

    public String getProductImage() {
        return this.productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

}
