package com.wr30mggmail.familybudget;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Kirabot on 09.09.2017.
 */

public class ExpenseItem {


    private String mDescription;
    private Date mDate;
    private ArrayList<String> mCategoryArray;
    private String mCategory;
    private int mPrice;

    public ExpenseItem(String text, int price) {
        mDescription = text;
        mPrice = price;
        mCategory = "Bear";
        //getCategory();
    }

    public ExpenseItem() {
       // mCategoryArray = new ArrayList<String>();
        //mCategoryArray.add("Beer");
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mText) {
        mDescription = mText;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public int getPrice() {
        return mPrice;
    }

    public void setPrice(int mPrice) {
        this.mPrice = mPrice;
    }

    public String getCategory() {
        return mCategory;
    }
}
