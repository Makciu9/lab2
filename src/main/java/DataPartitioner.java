import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.lib.partition.HashPartitioner;
public class DataPartitioner extends HashPartitioner<AirportWritableComparable, Text> {

}
