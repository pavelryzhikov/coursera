package helloworld;
import edu.duke.*;
//import org.apache.commons.*;

public class HelloWorld {
	public void runHello () {
		FileResource res = new FileResource("helloworld/hello_unicode.txt");
		//FileResource res = new duke.src.main.java.duke.FileResource("helloworld/hello_unicode.txt");
		for (String line : res.lines()) {
			System.out.println(line);
		}
	}

	public static void main(String[] args) {
		System.out.println(" Hello World!");
	}
}
//	mvn install:install-file -Dfile=/Volumes/data1/projects/java/IdeaProjects/coursera/ -DgroupId=coursera  -DartifactId=duke-src -Dversion=1.0 -Dpackaging=jar