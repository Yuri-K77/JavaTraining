package classes.Artifact;

public class Main {
    public static void main(String[] args) {
        ArtifactsBase artifactsBase1 = new ArtifactsBase(12345);
        ArtifactsBase artifactsBase2 = new ArtifactsBase(56789, "Майя");
        ArtifactsBase artifactsBase3 = new ArtifactsBase(14709, "Инки", 1000);

        System.out.println("Base 1: museum number: " + artifactsBase1.number);
        System.out.println("Base 2: museum number: " +  artifactsBase2.number + "; culture: " + artifactsBase2.culture);
        System.out.println("Base 3: museum number: " + artifactsBase3.number + "; culture: " + artifactsBase3.culture + "; century: " + artifactsBase3.century);
   }
}
