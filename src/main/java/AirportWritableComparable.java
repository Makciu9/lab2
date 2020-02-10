import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AirportWritableComparable {
    private int airportID;
    private int keyData;

    public AirportWritableComparable() {}

    AirportWritableComparable(int airportID, int keyData) {
        this.airportID = airportID;
        this.keyData = keyData;
    }

    int getAirportID() {
        return this.airportID;
    }
    
}
