public class Driver {
    public static void main(String[] args) {
        // Create root folder
        Folder root = new Folder("root");

        // Create folders and files
        Folder php_demo1 = new Folder(".php demo 1");
        Folder sourceFiles = new Folder("Source Files");
        Folder phalcon = new Folder("phalcon");
        Folder app = new Folder("app");
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");
        File htaccess = new File("htaccess", php_demo1);
        File htrouter = new File("htrouter.php", php_demo1);
        File index = new File("index.html", php_demo1);
        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");

        // Add folders and files to root folder
        root.addSubfolder(php_demo1);
        root.addSubfolder(includePath);
        root.addSubfolder(remoteFiles);

        // Add folders and files to php_demo1 folder
        php_demo1.addSubfolder(sourceFiles);
        php_demo1.addFile(htaccess);
        php_demo1.addFile(htrouter);
        php_demo1.addFile(index);

        // Add folders and files to sourceFiles folder
        sourceFiles.addSubfolder(phalcon);
        sourceFiles.addSubfolder(app);
        sourceFiles.addSubfolder(cache);
        sourceFiles.addSubfolder(publicFolder);

        // Add folders and files to app folder
        app.addSubfolder(config);
        app.addSubfolder(controllers);
        app.addSubfolder(library);
        app.addSubfolder(migrations);
        app.addSubfolder(models);
        app.addSubfolder(views);

        // Print out file system
        root.print("");
        
        // Delete app folder and print out file system
        php_demo1.removeSubfolder(app);
        root.print("");
        
        // Delete public folder and print out file system
        sourceFiles.removeSubfolder(publicFolder);
        root.print("");
    }
}
