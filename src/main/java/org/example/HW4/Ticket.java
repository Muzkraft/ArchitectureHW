package org.example.HW4;

import java.util.Date;

/**
 *
 */
public class Ticket {
    private int id;
    private int customerId;
    private Date date;
    private String qrCode;
    private boolean enable = true;

    public Ticket(Date date, String qrCode) {
        this.date = date;
        this.qrCode = qrCode;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Date getDate() {
        return date;
    }

    public String getQrCode() {
        return qrCode;
    }

    public boolean isEnable() {
        return enable;
    }
}
