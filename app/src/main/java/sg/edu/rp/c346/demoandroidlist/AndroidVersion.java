package sg.edu.rp.c346.demoandroidlist;


public class AndroidVersion {

    private String name;
    private String version;

    public AndroidVersion(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public void setName(String x) {
        name = x;
    }

    public void setVersion(String x) {
        version = x;
    }

    @Override
    public String toString() {
        return name + ": " + version;
    }
}

