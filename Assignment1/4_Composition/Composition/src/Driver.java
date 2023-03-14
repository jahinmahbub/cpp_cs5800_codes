public class Driver {
    public static void main(String[] args) {
        // Create the root folder
        Folder root = new Folder(".php demo 1");

        // Create subfolders
        Folder sourceFiles = new Folder("Source Files");
        Folder includePath = new Folder("Incude Path");
        Folder remoteFiles = new Folder("Remote Files");

        // Add subfolders to the root folder
        root.addSubfolder(sourceFiles);
        root.addSubfolder(includePath);
        root.addSubfolder(remoteFiles);

        // Create subfolders for the Source Files folder
        Folder phalcon = new Folder("phalcon");
        Folder app = new Folder("app");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");

        // Add subfolders to the Source Files folder
        sourceFiles.addSubfolder(phalcon);
        sourceFiles.addSubfolder(app);
        sourceFiles.addSubfolder(cache);
        sourceFiles.addSubfolder(publicFolder);

        // Create subfolders for the app folder
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");

        // Add subfolders to the app folder
        app.addSubfolder(config);
        app.addSubfolder(controllers);
        app.addSubfolder(library);
        app.addSubfolder(migrations);
        app.addSubfolder(models);
        app.addSubfolder(views);

        // Create files for the public folder
        File htaccess = new File(".htaccess", publicFolder);
        File htrouter = new File("htrouter.php", publicFolder);
        File index = new File("index.html", publicFolder);

        // Print out the file system
        root.print("");

        // Delete the app folder
        sourceFiles.removeSubfolder(app);

        // Print out the file system again
        System.out.println();
        root.print("");

        // Delete the public folder
        sourceFiles.removeSubfolder(publicFolder);

        // Print out the file system again
        System.out.println();
        root.print("");
    }
}
