import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class AirportTime {
    public static void main(String[] args) throws Exception {
        if (args.length != 3){
            System.exit(-1);
        }
    }
    Job job = Job.getInstance();
    
}
