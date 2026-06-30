package operations;

import java.nio.file.*;
import java.io.IOException;
import java.io.InputStream;

public class FileMoveOut {
	private Path target;
    
    public void moveOut(String currentDir, String zname) {
    	target = Paths.get(currentDir, zname);
        try (InputStream moveStream = FileMoveOut.class.getResourceAsStream("/resourcepacks/" + zname)){
        	   if(moveStream == null) {
        		   System.out.println("Can't find Resourcepack zip!");
        		   return;
        	   }
        	   Files.copy(moveStream, target);
        }catch(IOException e) {
        	System.out.println("Move out finished: " + e.getMessage());
        }
    }
}