import java.io.*;

public class TableGenerator {

   public static void main(String[] args) throws Exception {
      for (String arg : args) {
         File source = new File(arg);
         if (source.toString().endsWith(".vhd")) {
            VHDLParser parser = new VHDLParser(source);
            parser.writeHTML();
            parser.printSummary();
         }
      }
   }
}

