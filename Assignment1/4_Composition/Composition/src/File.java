public class File {
    private String name;
    private Folder parentFolder;

    public File(String name, Folder parentFolder) {
        this.name = name;
        this.parentFolder = parentFolder;
        parentFolder.addFile(this);
    }

    public String getName() {
        return name;
    }

    public Folder getParentFolder() {
        return parentFolder;
    }

    public void print() {
        System.out.println("            |--"+getName()+ "    ");
        //return getName();
    }
}
