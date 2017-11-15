package hdfsoperator;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class FileStatusMetadata {

	public static void main(String[] args) throws IOException {
		Configuration conf = new Configuration();
		String uri = "hdfs://localhost/wordcount/file2.txt";
		FileSystem fs = FileSystem.get(conf);
		FileStatus fSt = fs.getFileStatus(new Path(uri));
		System.out.println(fSt.isFile());
		System.out.println(fSt.getPath());
		System.out.println(fSt.getLen());
		System.out.println(fSt.getModificationTime());
	}

}
