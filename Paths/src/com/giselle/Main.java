package com.giselle;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {

//        DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>(){
//            @Override
//            public boolean accept(Path path) throws IOException {
//                return Files.isRegularFile(path);
//            }
//        };

        DirectoryStream.Filter<Path> filter = p -> Files.isRegularFile(p);

//        Path directory = FileSystems.getDefault().getPath("Examples/Dir2");
        Path directory = FileSystems.getDefault().getPath("Examples" + File.separator + "Dir2"); // it would works in any OS, where the separator can be differetn
        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)){
            for(Path file : contents){
                System.out.println(file.getFileName());
            }
        } catch (IOException | DirectoryIteratorException e){
            System.out.println("Exception: " + e.getMessage());
        }

        String separator = File.separator;
        System.out.println(separator);
        separator = FileSystems.getDefault().getSeparator();
        System.out.println(separator);

        try {
            Path tempFile = Files.createTempFile("myapp", ".appext");
            System.out.println("Temporary file path = " + tempFile.toAbsolutePath());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();
        for(FileStore store : stores){
            System.out.println("Volume name/Drive letter = " + store);
            System.out.println("File store = " + store.name());
        }

        System.out.println("********************");
        Iterable<Path> rootPaths = FileSystems.getDefault().getRootDirectories();
        for(Path path : rootPaths){
            System.out.println(path);
        }

        System.out.println("---- Walking Tree for Dir2 -----");
        Path dir2Path = FileSystems.getDefault().getPath("Examples" + File.separator + "Dir2");

        try{
            Files.walkFileTree(dir2Path, new PrintNames());
        } catch (IOException e){
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("----Copy Dir2 to Dir4/Dir2Copy-----");
        Path copyPath = FileSystems.getDefault().getPath("Examples" + File.separator + "Dir4" + File.separator + "Dir2Copy");

        try {
            Files.walkFileTree(dir2Path, new CopyFiles(dir2Path, copyPath));
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        File file = new File("/Examples2/file.txt");
        Path convertPath = file.toPath();
        System.out.println("convertPath = " + convertPath);

        File parent = new File("/Examples2");
        File resolvedFile = new File(parent, "dir/file.txt");
        System.out.println(resolvedFile.toPath());

        resolvedFile = new File("/Examples2", "dir/file.txt");
        System.out.println(resolvedFile.toPath());

        Path parentPath = Paths.get("/Examples2");
        Path childRelativePath = Paths.get("dir/file.txt");
        System.out.println(parentPath.resolve(childRelativePath));

        File workDirectory = new File("").getAbsoluteFile();
        System.out.println("Working directory = " + workDirectory.getAbsolutePath());

        System.out.println("---- print Dir1 contents using list() ----");
        File dir2File = new File(workDirectory, "/Examples/Dir2");
        String[] dir2Contents = dir2File.list();
        for(int i = 0; i < dir2Contents.length; i++){
            System.out.println("i= " + i + ": " + dir2Contents[i]);
        }

        System.out.println("---- print Dir2 contents using listFiles() ----");
        File[] dir2Files = dir2File.listFiles();
        for(int i = 0; i < dir2Files.length; i++){
            System.out.println("i= " + i + ": " + dir2Files[i].getName());
        }

//        try {
//
//            Path filePath = FileSystems.getDefault().getPath("Examples", "Dir1/file1.txt");
//            long size = Files.size(filePath);
//            System.out.println("Size = " + size);
//            System.out.println("Last modified = " + Files.getLastModifiedTime(filePath));
//
//            BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
//            System.out.println("Size = " + attributes.size());
//            System.out.println("Last modified = " + attributes.lastModifiedTime());
//            System.out.println("Created = " + attributes.creationTime());
//            System.out.println("Is directory = " + attributes.isDirectory());
//            System.out.println("Is regular files = " + attributes.isRegularFile());;
//
//            // create directories
////            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir2/Dir3/Dir4/Dir5/Dir6");
////            Path dirToCreate = FileSystems.getDefault().getPath("Examples/Dir2/Dir3/Dir4/Dir5/Dir6/Dir7");
////            Files.createDirectories(dirToCreate);
//
//            // create a file
////            Path fileToCreate = FileSystems.getDefault().getPath("Examples", "file2.txt");
////            Files.createFile(fileToCreate);
//
//            // create a directory
////            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir4");
////            Files.createDirectory(dirToCreate);
//
//            // delete a file
////            Path fileToDelete = FileSystems.getDefault().getPath("Examples", "Dir1", "file1copy.txt");
//////            Files.delete(fileToDelete);
////            Files.deleteIfExists(fileToDelete);
//
//            // rename a file
////            Path fileToMove = FileSystems.getDefault().getPath("Examples", "file1.txt");
////            Path destination = FileSystems.getDefault().getPath("Examples", "file2.txt");
////            Files.move(fileToMove, destination);
//
//            // move a file
////            Path fileToMove = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
////            Path destination = FileSystems.getDefault().getPath("Examples", "Dir1", "file1copy.txt");
////            Files.move(fileToMove, destination);
//
//            //copy a file
////            Path sourceFile = FileSystems.getDefault().getPath("Examples", "file1.txt");
////            Path copyFile = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
////            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
////
////            sourceFile = FileSystems.getDefault().getPath("Examples", "Dir1");
////            copyFile = FileSystems.getDefault().getPath("Examples", "Dir4");
////            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
//
//        } catch (IOException e){
//            System.out.println("Exception: " + e.getMessage());
//        }




//        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
//        printFile(path);
////        Path filePath = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
//        Path filePath = Paths.get(".","files","SubdirectoryFile.txt");
//        printFile(filePath);
////        filePath = Paths.get("/home/giselletavares/Documents/giselletavares/_CursosOnline/Udemy-CompleteJavaMasterClass/Java8Studies/OutThere.txt");
//        filePath = Paths.get("/home/giselletavares/Documents/giselletavares/_CursosOnline/Udemy-CompleteJavaMasterClass","/Java8Studies","OutThere.txt");
//        printFile(filePath);
//
//        filePath = Paths.get(".");
//        System.out.println(filePath.toAbsolutePath());
//
//        Path path2 = FileSystems.getDefault().getPath(".", "files","..","files","SubdirectoryFile.txt");
//        System.out.println(path2.normalize().toAbsolutePath());
//        printFile(path2);
//
//        Path path3 = FileSystems.getDefault().getPath("thisfiledoesntexist.txt");
//        System.out.println(path3.toAbsolutePath());
//
//        Path path4 = Paths.get("/Volumes/Test/ING", "abcdef", "whatever.txt");
//        System.out.println(path4.toAbsolutePath());
//
//        filePath = FileSystems.getDefault().getPath("files");
//        System.out.println("Exists = " + Files.exists(filePath));
//
//        System.out.println("Exists = " + Files.exists(path4));
    }

//    private static void printFile(Path path){
//        try (BufferedReader fileReader = Files.newBufferedReader(path)) {
//            String line;
//            while((line = fileReader.readLine()) != null){
//                System.out.println(line);
//            }
//        } catch (IOException e){
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//    }
}
