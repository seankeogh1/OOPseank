package ie.atu.productv4;
import java.text.NumberFormat;

public class Music extends Product {
    private     String  Artist;
    private     String  Label;

    public Music(){
        super();
        Artist = "";
        Label = "";
        count++;
    }
    public String getArtist() {return Artist;}

    public void setArtist(String artist) {Artist = artist;}

    public String getLabel() {return Label;}

    public void setLabel(String label) {Label = label;}

    @Override
    public String toString() {return super .toString() + "Artist" + Artist+ '\'' + "Label" + Label+'\'' ;}

}