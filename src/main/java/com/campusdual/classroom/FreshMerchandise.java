package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {


    private Date expirationDate;

    public FreshMerchandise(String name, String uniqueId, String responsibleId) {
        super(name, uniqueId, responsibleId);
    }

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
    }

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }
    public String getFormattedDate(Date date) {
        if (date == null) {
            return "No expiration date";
        }
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        return formatter.format(date);
    }


    @Override
    public String getSpecificData() {
        String dateForrmatted = getFormattedDate(this.expirationDate);

        StringBuilder builder = new StringBuilder();
        builder.append("Location: ").append(getLocation()).append("\n");
        builder.append("Expiration Date: ").append(dateForrmatted);

        return builder.toString();
    }

    public void printSpecificData() {
        System.out.println(getSpecificData());
    }
}