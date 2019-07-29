import java.nio.file.*;
class FileSystem{
    public static void main(String... args){
        FileSystems.getDefault().getRootDirectories().forEach(x -> System.out.println(" " + x));
    }
}
