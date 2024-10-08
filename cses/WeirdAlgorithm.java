import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class WeirdAlgorithm {
  public static void main(String[] args) throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    long input = Long.parseLong(reader.readLine());
    writer.write(input + " ");
    while(input != 1){
      if(input%2 == 0) {
        input /= 2;
      } else {
        input = (input*3) + 1;
      }
      if(input != 1)writer.write(input + " ");
      else writer.write(input + "\n");
    }
    reader.close();
    writer.close();
  }
}