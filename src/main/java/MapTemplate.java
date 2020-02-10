import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
public class MapTemplate {
    public static void use(Text value, Mapper.Context context, int keyData, int airportId, int delayed) throws IOException, InterruptedException {
        String[] parsed = UtilitiesCSV.parse(value.toString(), keyData);
    }

}
