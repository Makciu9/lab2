import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;
public class AirportGroupingComparator {
    AirportGroupingComparator() {
        super(AirportWritableComparable.class, true);
    }
    
}
