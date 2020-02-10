import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

public class AirportReducer {
    public class AirportReducer extends Reducer<AirportWritableComparable, Text, Text, Text> {
        @Override
        protected void reduce(AirportWritableComparable key, Iterable<Text> values, Context context) throws
                IOException, InterruptedException {
            Iterator<Text> iter = values.iterator();
            double max = Double.MIN_VALUE, min = Double.MAX_VALUE, sum = 0.0, size = 0.0;
            String airportName = "";
            for (; iter.hasNext(); size++) {
                String str = iter.next().toString();
                if (str.isEmpty()) {
                    continue;
                } else if (str.matches(".*[a-zA-Z]+.*")) {
                    airportName = str;
                    continue;
                }
                double current = Double.parseDouble(str);
                if (current > max) {

            }
        }

    }
}

