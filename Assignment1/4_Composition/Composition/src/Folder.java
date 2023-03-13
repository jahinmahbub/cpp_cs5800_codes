import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;
    private List<File> files;
    private List<Folder> subfolders;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.subfolders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<File> getFiles() {
        return files;
    }

    public List<Folder> getSubfolders() {
        return subfolders;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void removeFile(File file) {
        files.remove(file);
    }

    public void addSubfolder(Folder folder) {
        subfolders.add(folder);
    }

    public void removeSubfolder(Folder folder) {
        subfolders.remove(folder);
    }
    
    public void print(String prefix) {
        System.out.println(prefix + "|-- " + name);
        for (Folder subfolder : subfolders) {
            subfolder.print(prefix + "    ");
        }
        for (File file : files) {
            file.print(prefix + "    ");
        }
    }
}
