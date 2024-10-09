package classes.Artifact;

public class ArtifactsBase {
    int number;
    String culture;
    int century;

    public ArtifactsBase(int number) {
        this.number = number;
    }

    public ArtifactsBase(int number, String culture) {
        this.number = number;
        this.culture = culture;
    }

    public ArtifactsBase(int number, String culture, int century) {
        this.number = number;
        this.culture = culture;
        this.century = century;
    }
}
