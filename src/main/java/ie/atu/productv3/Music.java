package ie.atu.productv3;

import java.text.NumberFormat;

public class Music extends Product{


        private String Artist;
        private String description;
        private String code;
        private double price;
        private String Label;

        public Music() {
            description = "";
            code = "";
            Artist = "";
            Label = "";
            price = 0.0;

        }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }
}
