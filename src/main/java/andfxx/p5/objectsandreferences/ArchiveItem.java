package andfxx.p5.objectsandreferences;

public class ArchiveItem {
    private final String identifier;
    private final String name;

    public ArchiveItem(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ArchiveItem archiveItem)) {
            return false;
        }

        return this.identifier.equals(archiveItem.identifier);
    }

    @Override
    public String toString() {
        return identifier + ": " + name;
    }
}
