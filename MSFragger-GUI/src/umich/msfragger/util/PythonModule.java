package umich.msfragger.util;

public class PythonModule {
    public final String installName;
    public final String someImportName;

    public PythonModule(String installName, String someImportName) {
        if (installName == null || someImportName == null)
            throw new IllegalArgumentException("No nulls");
        this.installName = installName;
        this.someImportName = someImportName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PythonModule that = (PythonModule) o;

        if (!installName.equals(that.installName)) {
            return false;
        }
        return someImportName.equals(that.someImportName);
    }

    @Override
    public int hashCode() {
        int result = installName.hashCode();
        result = 31 * result + someImportName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "PythonModule{" +
            "installName='" + installName + '\'' +
            ", someImportName='" + someImportName + '\'' +
            '}';
    }
}
