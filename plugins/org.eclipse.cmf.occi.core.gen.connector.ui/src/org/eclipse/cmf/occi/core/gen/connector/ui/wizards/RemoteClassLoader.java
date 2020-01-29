package org.eclipse.cmf.occi.core.gen.connector.ui.wizards;

import java.io.*;
import java.nio.file.*;
import java.util.zip.*;

public class RemoteClassLoader extends ClassLoader {

	private final ZipFile zipFile;

    public RemoteClassLoader(byte[] jarBytes) throws IOException {
        this.zipFile = RemoteClassLoader.load(jarBytes);
    }

    private static ZipFile load(byte[] jarBytes) throws IOException {
        // Create my temporary file
        Path path = Files.createTempFile("RemoteClassLoader", "jar");
        // Delete the file on exit
        path.toFile().deleteOnExit();
        // Copy the content of my jar into the temporary file
        try (InputStream is = new ByteArrayInputStream(jarBytes)) {
            Files.copy(is, path, StandardCopyOption.REPLACE_EXISTING);
        }
        return new ZipFile(path.toFile());
    }

    @Override
    public InputStream getResourceAsStream(String name) {
        // Get the entry by its name
        ZipEntry entry = zipFile.getEntry(name);
        if (entry != null) {
            // The entry could be found
            try {
                // Gives the content of the entry as InputStream
                return zipFile.getInputStream(entry);
            } catch (IOException e) {
                // Could not get the content of the entry
                // you could log the error if needed
                return null;
            }
        }
        // The entry could not be found
        return null;
    }
    
    public static void main(String[] args) {
    	
    }
}
